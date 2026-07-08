package com.ss.android.ugc.aweme.friendstab.repo;

import X.EnumC1587000rOs;
import X.InterfaceC1364105Vn;
import X.InterfaceC149400hg;
import X.InterfaceC2177008fw;

/* JADX INFO: loaded from: classes25.dex */
public interface IFriendsV3FeedOperator extends InterfaceC149400hg {
    Object getFriendsTextDetail(String str, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn);

    Object getFriendsTextHistory(int i, String str, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn);

    Object getFriendsV3Feeds(String str, String str2, int i, int i2, int i3, int i4, EnumC1587000rOs enumC1587000rOs, Long l, String str3, @InterfaceC2177008fw Object obj, String str4, String str5, String str6, String str7, String str8, String str9, int i5, String str10, int i6, Boolean bool, Integer num, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn);
}
