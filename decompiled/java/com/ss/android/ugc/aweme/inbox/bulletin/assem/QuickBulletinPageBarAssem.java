package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.C0C64;
import X.C0OIZ;
import X.C0OL2;
import X.C0OLV;
import X.C0OM1;
import X.C0OPX;
import X.C0OSB;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1618770sE7;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C606030Npp;
import X.C698190Ra5;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC617060OIe;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class QuickBulletinPageBarAssem extends BaseBulletinBarAssem {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public boolean LLJZ;

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0OM1 c0om1 = new C0OM1();
        ArrayList arrayList = new ArrayList();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZIZ = "bulletin_info_bar";
        ArrayList arrayList2 = new ArrayList();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 17));
        arrayList.add(c1251150ifB);
        Context context = getContext();
        if (context != null) {
            Vo(context, arrayList2);
            c0om1.LIZLLL = true;
            c0om1.LIZLLL(arrayList);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZ(arrayList2);
            TuxNavBar tuxNavBar = this.LLJIJIL;
            if (tuxNavBar != null) {
                tuxNavBar.setNavActions(c0om1);
            }
            TuxNavBar tuxNavBar2 = this.LLJIJIL;
            if (tuxNavBar2 != null) {
                tuxNavBar2.setNavBackground(C1618770sE7.LIZ(R.attr.zp));
            }
            So();
            AssemViewModel.asyncSubscribe$default(No(), new C2217381BqS() { // from class: X.0OLY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LL;
                }
            }, this, null, null, null, new AwS588S0100000_9(this, 10), 28, null);
            C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OLT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C0OKY) obj).LLIZ);
                }
            }, null, new AwS623S0100000_9(this, 1), 6);
            Zo();
            ap();
            String str = null;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C606030Npp(this, null), 3);
            C0OLV c0olvLo = Lo();
            if (c0olvLo != null && c0olvLo.LLILLL) {
                if (No().getState().LL.LIZ() == null) {
                    C0OLV c0olvLo2 = Lo();
                    if (c0olvLo2 != null) {
                        str = c0olvLo2.LL;
                    }
                    BulletinAccountEditResponse bulletinAccountEditResponseLIZ = C0OIZ.LIZ(str);
                    if (bulletinAccountEditResponseLIZ != null) {
                        No().MQ2(bulletinAccountEditResponseLIZ, EnumC617060OIe.IDENTITY_CREATOR.getValue());
                    }
                }
            } else {
                No().RQ2(C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_fix_identity_init_setting", true, true));
            }
            No().NQ2();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void dp(BulletinBoardInfo bulletinBoardInfo, Long l) {
        Context context;
        TuxImageModel tuxImageModel;
        C698190Ra5 c698190Ra5LJII;
        String nickname;
        if (bulletinBoardInfo == null || (context = getContext()) == null) {
            return;
        }
        this.LLJZ = true;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTitleBar: bulletinInfo = ");
        sbLIZ.append(bulletinBoardInfo);
        sbLIZ.append(", member = ");
        sbLIZ.append(l);
        C1720106oR.LJI("BulletinPageBarAssem", C2188811AlT.LIZIZ(sbLIZ));
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = bulletinBoardInfo.name;
            if (l == null) {
                l = bulletinBoardInfo.subscriberCount;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (bulletinBoardInfo.accountType == C0OL2.BULLETIN_ACCOUNT_TYPE_LIVE_ARENA.getType() && (tuxImageModel = bulletinBoardInfo.accountIcon) != null && (c698190Ra5LJII = C0OSB.LJII(context, tuxImageModel)) != null) {
                User user = bulletinBoardInfo.channelOwner;
                if (user != null) {
                    nickname = user.getNickname();
                } else {
                    nickname = null;
                }
                spannableStringBuilder.append((CharSequence) nickname);
                int i2 = c698190Ra5LJII.LIZ;
                Integer num = c698190Ra5LJII.LIZIZ;
                spannableStringBuilder.append((CharSequence) " T");
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i2;
                c419910GdJ.LIZLLL = num;
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, context), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
            }
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue >= 0) {
                    spannableStringBuilder.append((CharSequence) C0OPX.LJFF(2131755123, jLongValue));
                }
            }
            c1250250idj.LIZLLL = spannableStringBuilder;
            tuxNavBar.LJIJJ(c1250250idj);
        }
    }
}
