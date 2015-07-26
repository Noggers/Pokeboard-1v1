package my.pokeboard.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import my.pokeboard.ViewModels.ResourceDownloaderViewModel;

import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class ResourceDownloader extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ResourceDownloaderViewModel dataContext = new ResourceDownloaderViewModel();

	/**
	 * Create the frame.
	 */
	public ResourceDownloader()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JButton btnDownloadResources = new JButton();
		btnDownloadResources.setAction(dataContext.getDownloadResourcesAction());
		panel.add(btnDownloadResources);
	}
}
