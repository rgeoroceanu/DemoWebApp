package rgeoroceanu.cms.component.form;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import rgeoroceanu.cms.localization.Localizable;
import rgeoroceanu.cms.localization.Localizer;

public abstract class Form extends VerticalLayout implements Localizable {

	private static final long serialVersionUID = 1L;
	private final Button saveButton;
	private final Button discardButton;
	private final Button removeButton;
	
	public Form() {
		saveButton = new Button();
		saveButton.addStyleName(ValoTheme.BUTTON_LINK);
		discardButton = new Button();
		discardButton.addStyleName(ValoTheme.BUTTON_LINK);
		removeButton = new Button();
		removeButton.addStyleName(ValoTheme.BUTTON_LINK);
		
		final HorizontalLayout buttonLayout = new HorizontalLayout();
		buttonLayout.addComponent(saveButton);
		buttonLayout.addComponent(discardButton);
		buttonLayout.addComponent(removeButton);
		
		this.addComponent(buttonLayout);
	}
	
	public void addSaveButtonListener(final ClickListener listener) {
		saveButton.addClickListener(listener);
	}
	
	public void addRemoveButtonListener(final ClickListener listener) {
		removeButton.addClickListener(listener);
	}
	
	public void addDiscardButtonListener(final ClickListener listener) {
		discardButton.addClickListener(listener);
	}
	
	public void setActionButtonsEnableState(boolean saveButtonEnabled,
			boolean discardButtonEnabled, boolean removeButtonEnabled) {
		
		saveButton.setEnabled(saveButtonEnabled);
		discardButton.setEnabled(saveButtonEnabled);
		removeButton.setEnabled(saveButtonEnabled);
	}

	@Override
	public void localize() {
		saveButton.setCaption(Localizer.getLocalizedString("save"));
		discardButton.setCaption(Localizer.getLocalizedString("discard"));
		removeButton.setCaption(Localizer.getLocalizedString("remove"));
	}
}