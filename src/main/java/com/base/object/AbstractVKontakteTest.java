package com.base.object;

import com.vkontakte.pages.AudioPage;
import com.vkontakte.pages.ForgotPassword;
import com.vkontakte.pages.FotoPage;
import com.vkontakte.pages.FriendsPage;
import com.vkontakte.pages.GamesPage;
import com.vkontakte.pages.GroupsPage;
import com.vkontakte.pages.MainPage;
import com.vkontakte.pages.MessagePage;
import com.vkontakte.pages.MyPage;
import com.vkontakte.pages.NewsPage;
import com.vkontakte.pages.Register;
import com.vkontakte.pages.TestEE2016;
import com.vkontakte.pages.VideoPage;
import com.vkontakte.pages.Vkontakte;
import com.vkontakte.pages.VkontakteLogout;

public class AbstractVKontakteTest {

	protected MainPage mainPage = new MainPage();
	protected Vkontakte vkontakte;
	protected TestEE2016 testEE2016;
	protected VkontakteLogout vkontakteLogout;
	protected Register register;
	protected ForgotPassword forgotPassword;
	
	
	protected MyPage myPage;
	protected NewsPage newsPage;
	protected MessagePage messagePage;
	protected FriendsPage friendsPage;
	protected GroupsPage groupsPage;
	protected FotoPage fotoPage;
	protected AudioPage audioPage;
	protected VideoPage videoPage;
	protected GamesPage gamesPage;
}
