package my.pokeboard.ViewModels;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ResourceDownloaderViewModel
{
	private DownloadResourcesAction downloadAction;
	
	public ResourceDownloaderViewModel()
	{
		downloadAction = new DownloadResourcesAction();
	}
	
	public AbstractAction getDownloadResourcesAction()
	{
		return downloadAction;
	}
	
	
	private class DownloadResourcesAction extends AbstractAction
	{
		private static final long serialVersionUID = 1L;

		public DownloadResourcesAction()
		{
			putValue(NAME, "Download Resources");
			putValue(SHORT_DESCRIPTION, "Download all needed data for cards in the Pokemon TCG game.");
		}

		public void actionPerformed(ActionEvent e)
		{
		}
	}
}
