package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0B;
import X.C13IQ;
import X.C1668306g5;
import X.C1689206jS;
import X.C1703106lh;
import X.C1734206qi;
import X.C912520Zr0;
import X.EnumC1578206Fw;
import X.EnumC1578706Gb;
import X.EnumC1665006fY;
import X.InterfaceC1566906Bn;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS44S1300000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS44S1300000_2 awS44S1300000_2, Object obj) {
        PopupManager.LJIIZILJ(new C1734206qi((Context) awS44S1300000_2.l1, (FragmentManager) awS44S1300000_2.l2, awS44S1300000_2.s0, EnumC1665006fY.GUIDE_PRO_CREATOR_UPDATE, (Pair) obj, (InboxFragmentV2) awS44S1300000_2.l3), new C1668306g5("professional_inbox_upgrade_guide"));
        ((InboxFragmentV2) awS44S1300000_2.l3).LLLIIIIL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS44S1300000_2 awS44S1300000_2, Object obj) {
        SlashFragment slashFragment = (SlashFragment) awS44S1300000_2.l1;
        C13IQ c13iq = (C13IQ) awS44S1300000_2.l2;
        ((Assembler) obj).RQ2(slashFragment, new AwS87S1200000_2((FrameLayout) awS44S1300000_2.l3, awS44S1300000_2.s0, c13iq, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS44S1300000_2 awS44S1300000_2, Object obj) {
        ((Assembler) obj).QQ2((SlashFragment) awS44S1300000_2.l1, new AwS87S1200000_2((FrameLayout) awS44S1300000_2.l3, awS44S1300000_2.s0, (C13IQ) awS44S1300000_2.l2, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS44S1300000_2 awS44S1300000_2, Object obj) {
        String string;
        int i;
        Activity activity = (Activity) obj;
        IMUser iMUser = (IMUser) awS44S1300000_2.l1;
        if (iMUser != null) {
            Boolean bool = (Boolean) awS44S1300000_2.l2;
            String str = awS44S1300000_2.s0;
            Long l = (Long) awS44S1300000_2.l3;
            if (l != null && (string = l.toString()) != null) {
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    i = 1;
                } else if (iMUser.getCommerceUserLevel() > 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                String uid = iMUser.getUid();
                if (uid == null) {
                    uid = "";
                }
                String contactName = iMUser.getContactName();
                IReportUtils.LIZ.getClass();
                C1689206jS c1689206jS = new C1689206jS(new C912520Zr0(string, uid, str, l.longValue(), C1703106lh.LIZJ(iMUser), Boolean.valueOf(iMUser.isBlock()), "im", i, "click_head", contactName, 0, false, false, iMUser.getNickName(), iMUser.getDisplayAvatar(), Integer.valueOf(iMUser.getFollowingCount()), Integer.valueOf(iMUser.getFollowerCount()), Integer.valueOf(iMUser.getFollowStatus()), null, "", "chat", "im_detail_page"));
                IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
                if (iReportUtilsLIZ != null) {
                    iReportUtilsLIZ.LIZ(c1689206jS, activity, "1", null, true);
                }
                IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class);
                if (iIMMessageAdapterAnalytics != null) {
                    iIMMessageAdapterAnalytics.LIZJ(iMUser, C0I0B.LJFF.LIZIZ(), "chat");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS44S1300000_2 awS44S1300000_2, Object obj) {
        ((InterfaceC1566906Bn) obj).LJI((EnumC1578206Fw) awS44S1300000_2.l1, awS44S1300000_2.s0, (StreakData) awS44S1300000_2.l2, (EnumC1578706Gb) awS44S1300000_2.l3);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS44S1300000_2(android.widget.FrameLayout r3, com.ss.android.ugc.aweme.slash.page.SlashFragment r4, java.lang.String r5, X.C13IQ r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r3
            r1.s0 = r5
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r6
            r1.s0 = r5
            r1.l3 = r3
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS44S1300000_2.<init>(android.widget.FrameLayout, com.ss.android.ugc.aweme.slash.page.SlashFragment, java.lang.String, X.13IQ, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S1300000_2(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb, int i) {
        super(1);
        this.$t = i;
        this.l1 = enumC1578206Fw;
        this.s0 = str;
        this.l2 = streakData;
        this.l3 = enumC1578706Gb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S1300000_2(Context context, FragmentManager fragmentManager, String str, InboxFragmentV2 inboxFragmentV2, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.l2 = fragmentManager;
        this.s0 = str;
        this.l3 = inboxFragmentV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S1300000_2(IMUser iMUser, Boolean bool, String str, Long l, int i) {
        super(1);
        this.$t = i;
        this.l1 = iMUser;
        this.l2 = bool;
        this.s0 = str;
        this.l3 = l;
    }
}
