package com.ss.android.ugc.aweme.services.popsuite;

import com.ss.android.ugc.aweme.account.eventtracking.PopupSuiteResponseEvent;
import com.ss.android.ugc.aweme.account.eventtracking.PopupSuiteShowEvent;

/* JADX INFO: loaded from: classes.dex */
public final class PopSuiteETHelper {
    public static final int $stable = 0;
    public static final PopSuiteETHelper INSTANCE = new PopSuiteETHelper();

    public final void mobPopSuitePopupShow(String str, String str2, String str3, int i) {
        PopupSuiteShowEvent popupSuiteShowEvent = new PopupSuiteShowEvent();
        popupSuiteShowEvent.LJI(str, "enter_from");
        popupSuiteShowEvent.LJI(str2, "enter_method");
        popupSuiteShowEvent.LJI(str3, "popup_suite_key");
        popupSuiteShowEvent.LJI(Integer.valueOf(i), "popup_freq");
        popupSuiteShowEvent.LJIIIIZZ();
    }

    public final void mobPopSuitePopupResp(String str, String str2, String str3, String str4, int i) {
        PopupSuiteResponseEvent popupSuiteResponseEvent = new PopupSuiteResponseEvent();
        popupSuiteResponseEvent.LJI(str, "action");
        popupSuiteResponseEvent.LJI(str2, "enter_from");
        popupSuiteResponseEvent.LJI(str3, "enter_method");
        popupSuiteResponseEvent.LJI(str4, "popup_suite_key");
        popupSuiteResponseEvent.LJI(Integer.valueOf(i), "popup_freq");
        popupSuiteResponseEvent.LJIIIIZZ();
    }
}
