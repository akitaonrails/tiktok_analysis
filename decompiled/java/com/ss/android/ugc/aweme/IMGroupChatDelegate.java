package com.ss.android.ugc.aweme;

import X.AbstractC1225770i0F;
import X.AbstractC1549150qPp;
import X.C099R;
import X.C0Y8T;
import X.C0YMW;
import X.C1227540i36;
import X.C1230440i7m;
import X.C1230810i8N;
import X.C19719912Dl;
import X.C19EG;
import X.C830490Whz;
import X.C869590Y9l;
import X.C900560ZUo;
import X.C913140Zs0;
import X.C913630Zsn;
import X.InterfaceC1227250i2d;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1493105sv;
import X.InterfaceC1612206Sy;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC900570ZUp;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupSystemContent;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinRequestV2;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class IMGroupChatDelegate implements IMGroupChatApi {
    public final /* synthetic */ C913630Zsn LIZJ = C913630Zsn.LJIIJJI;

    @Override // com.ss.android.ugc.aweme.IMGroupChatApi
    public final void LIZ() {
        this.LIZJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.IMGroupChatApi
    public final void LIZJ() {
        this.LIZJ.LIZJ();
    }

    @Override // X.InterfaceC1230510i7t
    @InterfaceC1294060jmO
    public final void LIZLLL(C19EG c19eg, String str, String str2, String str3) {
        this.LIZJ.LIZLLL(c19eg, str, str2, str3);
    }

    @Override // X.InterfaceC1730506q7
    public final void LJ() {
        this.LIZJ.LJ();
    }

    @Override // X.InterfaceC1662206f6
    public final InterfaceC1612206Sy LJFF(Fragment fragment, SessionInfo sessionInfo) {
        return this.LIZJ.LJFF(fragment, sessionInfo);
    }

    @Override // X.InterfaceC1662206f6
    public final C19719912Dl LJI(String str) {
        return this.LIZJ.LJI(str);
    }

    @Override // X.C0I13
    public final void LJII(String str, int i, List<String> list, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        this.LIZJ.LJII(str, i, list, str2, interfaceC1493105sv);
    }

    @Override // X.InterfaceC1662206f6
    public final String LJIIIIZZ(GroupSystemContent groupSystemContent) {
        return this.LIZJ.LJIIIIZZ(groupSystemContent);
    }

    @Override // X.InterfaceC1662206f6
    public final C19719912Dl LJIIIZ() {
        return this.LIZJ.LJIIIZ();
    }

    @Override // X.C0I13
    public final C830490Whz LJIIJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        return this.LIZJ.LJIIJ(str, interfaceC1493105sv);
    }

    @Override // X.InterfaceC1662206f6
    public final void LJIIJJI(C0Y8T c0y8t, InterfaceC497601wk interfaceC497601wk) {
        this.LIZJ.LJIIJJI(c0y8t, interfaceC497601wk);
    }

    @Override // X.InterfaceC1227800i3W
    public final Object LJIIL(long j, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        Object objLJIIL = this.LIZJ.LJIIL(j, interfaceC1364105Vn, true);
        C099R.LJFF();
        return objLJIIL;
    }

    @Override // com.ss.android.ugc.aweme.IMGroupChatApi
    public final boolean LJIILIIL(Object obj) {
        return this.LIZJ.LJIILIIL(obj);
    }

    @Override // X.InterfaceC1230510i7t
    public final GroupInvitePopupResponse LJIILJJIL(String str) {
        return this.LIZJ.LJIILJJIL(str);
    }

    @Override // X.InterfaceC1230510i7t
    public final Object LJIILL(GroupInvitePopupRequest groupInvitePopupRequest, InterfaceC1364105Vn<? super GroupInvitePopupResponse> interfaceC1364105Vn) {
        return this.LIZJ.LJIILL(groupInvitePopupRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1227800i3W
    public final void LJIILLIIL(C0YMW c0ymw) {
        this.LIZJ.LJIILLIIL(c0ymw);
    }

    @Override // X.InterfaceC1662206f6
    public final void LJIIZILJ(Context context, Fragment fragment, String str) {
        this.LIZJ.LJIIZILJ(context, fragment, str);
    }

    @Override // X.InterfaceC1230510i7t
    @InterfaceC1294060jmO
    public final void LJIJ(Activity activity, String str, long j, GroupInfo groupInfo, String str2, String str3, String str4, C900560ZUo c900560ZUo) {
        this.LIZJ.LJIJ(activity, str, j, groupInfo, str2, str3, str4, c900560ZUo);
    }

    @Override // X.InterfaceC1227800i3W
    public final InterfaceC1227250i2d LJIJI(AbstractC1225770i0F abstractC1225770i0F) {
        return this.LIZJ.LJIJI(abstractC1225770i0F);
    }

    @Override // X.C0I13
    public final void LJIJJ(int i, long j, InterfaceC1493105sv interfaceC1493105sv, String str) {
        this.LIZJ.LJIJJ(i, j, interfaceC1493105sv, str);
    }

    @Override // X.InterfaceC1658106eR
    public final void LJIJJLI(String str, List<? extends IMUser> list) {
        this.LIZJ.LJIJJLI(str, list);
    }

    @Override // com.ss.android.ugc.aweme.IMGroupChatApi
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIL() {
        return this.LIZJ.LJIL();
    }

    @Override // X.InterfaceC1658106eR
    public final void LJJ(String str) {
        this.LIZJ.LJJ(str);
    }

    @Override // X.InterfaceC1230510i7t
    public final void LJJI(Context context, C1230810i8N c1230810i8N) {
        this.LIZJ.LJJI(context, c1230810i8N);
    }

    @Override // X.InterfaceC1230510i7t
    public final PriorityProtocol LJJII() {
        return this.LIZJ.LJJII();
    }

    @Override // X.C0I13
    public final void LJJIII(String str, String str2, Pair<? extends Object, String>[] pairArr, InterfaceC1493105sv interfaceC1493105sv) {
        this.LIZJ.LJJIII(str, str2, pairArr, interfaceC1493105sv);
    }

    @Override // X.C0I13
    public final void LJJIIJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        throw null;
    }

    @Override // X.InterfaceC913650Zsp
    public final void LJJIIJZLJL(Activity activity, C913140Zs0 c913140Zs0, int i) {
        this.LIZJ.LJJIIJZLJL(activity, c913140Zs0, i);
    }

    @Override // X.InterfaceC1662206f6
    public final void LJJIIZ(InterfaceC665370Q7z interfaceC665370Q7z, List<String> list) {
        this.LIZJ.LJJIIZ(interfaceC665370Q7z, list);
    }

    @Override // X.InterfaceC1230510i7t
    public final InterfaceC900570ZUp LJJIIZI() {
        this.LIZJ.LJJIIZI();
        return C1230440i7m.LJ;
    }

    @Override // X.InterfaceC1230510i7t
    public final Object LJJIJ(GroupJoinRequestV2 groupJoinRequestV2, InterfaceC1364105Vn<? super GroupJoinResponseV2> interfaceC1364105Vn) {
        return this.LIZJ.LJJIJ(groupJoinRequestV2, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1662206f6
    public final boolean LJJIJIIJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        return this.LIZJ.LJJIJIIJI(c0y8t, c869590Y9l);
    }

    @Override // X.InterfaceC1658106eR
    public final boolean LJJIJIIJIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        return this.LIZJ.LJJIJIIJIL(interfaceC1369790lkX);
    }

    @Override // com.ss.android.ugc.aweme.IMGroupChatApi
    public final C1227540i36 LJJIFFI() {
        this.LIZJ.getClass();
        return C1227540i36.LIZIZ;
    }

    @Override // X.InterfaceC1230510i7t
    @InterfaceC1294060jmO
    public final void LIZIZ(C19EG c19eg, String str, String str2) {
        this.LIZJ.LJII.LIZIZ(c19eg, str, str2);
    }
}
