package com.bytedance.android.livesdkapi.host.dummy;

import X.C05JF;
import X.C09JN;
import X.C1106210etP;
import X.C197039127h;
import X.C19EG;
import X.InterfaceC1372610lp5;
import X.InterfaceC473070Igr;
import X.InterfaceC473650Ihn;
import X.InterfaceC473660Iho;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class LiveHostShareDummy implements IHostShare {
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Pair<String, Drawable> getBreathShareAnimShareRes(Context context, String str, String str2) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final String getBundleKey(int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getLongPressShareDialog(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Fragment getLongPressShareDialog2Fragment(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final int getRepostIconRes() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getShareDialog(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final User getShareExternalLinkShareUser(long j) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final C197039127h getShareRelationButton(Context context, C05JF c05jf) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final TuxSheet getShareTuxSheet(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getShortUrl(String str, InterfaceC473660Iho interfaceC473660Iho) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getUrlModelAndShowAnim(InterfaceC473650Ihn interfaceC473650Ihn) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final boolean isImChannel(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void postFollowRecommendEvent(String str, String str2, String str3) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void postFollowStatus(String str, int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void refreshScreenShotConfig() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void registerShareUserInfoListener(long j, InterfaceC473070Igr interfaceC473070Igr) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void repost(long j, Map<String, String> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void setScreenShotConfig() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void share(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareLiveReplay(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSingleMessage(Activity activity, String str, C1106210etP c1106210etP, C09JN<Boolean> c09jn) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSingleMessageToMultiUser(Activity activity, List<String> list, C1106210etP c1106210etP, C09JN<Boolean> c09jn) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareStreamGoal(Activity activity, String str, C1106210etP c1106210etP, C09JN<Boolean> c09jn) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSubInvitation(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSubscribeLink(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void showScreenTimeDialog(Bundle bundle) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final List<Long> getInternalShareSortedUids() {
        return Collections.emptyList();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Boolean isSharer(long j) {
        return Boolean.FALSE;
    }
}
