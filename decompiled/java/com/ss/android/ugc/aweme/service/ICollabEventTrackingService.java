package com.ss.android.ugc.aweme.service;

/* JADX INFO: loaded from: classes32.dex */
public interface ICollabEventTrackingService {
    void reportClickInviteCollab(String str, boolean z);

    void reportCollabAnchor(String str, String str2, String str3, String str4, boolean z);

    void reportCollabAuthorizeEntrance(String str, String str2, String str3, String str4, String str5, String str6);

    void reportCollabAuthorizePopup(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void reportShowInviteCollab(String str, boolean z);
}
