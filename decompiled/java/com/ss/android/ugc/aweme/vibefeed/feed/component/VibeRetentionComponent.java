package com.ss.android.ugc.aweme.vibefeed.feed.component;

import X.AbstractC1391830mK5;
import X.C019F;
import X.C01GW;
import X.C0P30;
import X.C0P3X;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1558520qew;
import X.C1572370r1H;
import X.C1574770r59;
import X.C1575290r5z;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C638560P2w;
import X.C724750Sbp;
import X.C814420VxA;
import X.C908790Zkz;
import X.C985403tE;
import X.EnumC912680ZrG;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.vibefeed.feed.ability.IVibeRetentionAbility;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeRetentionComponent extends BasePanelComponent implements IVibeRetentionAbility, InterfaceC1554640qYg {
    public static final C1572370r1H LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final C01GW<Keva> LLILZLL;
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 636));
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VibeRetentionComponent.class, "consumeVM", "getConsumeVM()Lcom/ss/android/ugc/aweme/vibefeed/feed/viewmodel/VibeFeedConsumeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new C1572370r1H();
        LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(400));
    }

    public VibeRetentionComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedConsumeViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 635), AFwS264S0000000_24.get$arr$(523), null, true);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1393674221) {
            return null;
        }
        return this;
    }

    public final void bo() {
        final Context context;
        String strOptString;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (context = fragment.getContext()) == null) {
            return;
        }
        String string = context.getString(2131835337);
        String string2 = context.getString(2131835334);
        String string3 = context.getString(2131835335);
        String string4 = context.getString(2131835336);
        JSONObject jSONObject = (JSONObject) this.LLILLJJLI.getValue();
        if (jSONObject == null || (strOptString = jSONObject.optString("conversation_id")) == null) {
            strOptString = "";
        }
        String strLIZLLL = C0P30.LIZ().LIZLLL(strOptString);
        C908790Zkz c908790Zkz = EnumC912680ZrG.Companion;
        JSONObject jSONObject2 = (JSONObject) this.LLILLJJLI.getValue();
        int iOptInt = jSONObject2 != null ? jSONObject2.optInt("mutual_feed_scene") : 0;
        c908790Zkz.getClass();
        EnumC912680ZrG enumC912680ZrGLIZ = C908790Zkz.LIZ(iOptInt);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c1397580mTM.LJIIIZ = new AbstractC1391830mK5(context, iLIZIZ) { // from class: X.0mK2
            public final /* synthetic */ Context LJ;
            public final /* synthetic */ int LJFF;

            @Override // X.AbstractC1397490mTD
            public final View LIZIZ() {
                C1CRB c1crb = new C1CRB(this.LJ, null, 6);
                int i = this.LJFF;
                Context context2 = this.LJ;
                C1CRC c1crc = new C1CRC(-1);
                c1crb.setPadding(i, i, i, i);
                C786410Ut5.Z6(c1crb, c1crc);
                c1crb.setBackground(new ColorDrawable(this.LIZLLL));
                AppCompatImageView appCompatImageView = new AppCompatImageView(c1crb.getContext());
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.ti;
                Drawable drawableLIZ = c0hti.LIZ(appCompatImageView.getContext());
                double intrinsicHeight = ((double) drawableLIZ.getIntrinsicHeight()) / ((double) drawableLIZ.getIntrinsicWidth());
                C1CRC c1crc2 = new C1CRC(-1);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("this.width * ");
                sbLIZ.append(intrinsicHeight);
                c1crc2.LJII = C2230281CQw.LIZ(context2, C2188811AlT.LIZIZ(sbLIZ), "layout_height");
                C786410Ut5.h6(appCompatImageView, c1crc2);
                appCompatImageView.setImageDrawable(drawableLIZ);
                c1crb.addView(appCompatImageView);
                return c1crb;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, 0);
                this.LJ = context;
                this.LJFF = iLIZIZ;
            }
        };
        c1397580mTM.LJI(string);
        c1397580mTM.LIZIZ(string2);
        C985403tE.LIZ(c1397580mTM, new C1574770r59(string3, string4, strOptString, strLIZLLL, enumC912680ZrGLIZ, this));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1575290r5z.LIZ.getClass();
        C1575290r5z.LJFF(strOptString, strLIZLLL, "leave_popup", enumC912680ZrGLIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() throws IllegalAccessException {
        super.onParentViewCreated();
        LLILZ.getClass();
        this.LL = !C1572370r1H.LIZ();
        C1558520qew.LIZLLL(this);
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.feed.ability.IVibeRetentionAbility
    public final boolean L52(String str) {
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && fragment.getUserVisibleHint() && !this.LL && !Intrinsics.LJFF(str, "vibe_turn_off") && !Intrinsics.LJFF(str, "permission_failed") && !Intrinsics.LJFF(str, "send_reminder")) {
            AssemVMLazy assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
            C638560P2w c638560P2w = ((C0P3X) assemVMLazy.getValue().getState()).LLILLL;
            int i = c638560P2w.LIZIZ;
            int i2 = c638560P2w.LIZ;
            if (i != i2 || i2 <= 0) {
                bo();
                this.LL = true;
                LLILZ.getClass();
                C1572370r1H.LIZIZ();
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.feed.ability.IVibeRetentionAbility
    public final boolean onDispatchKeyEvent(KeyEvent keyEvent) {
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || !fragment.getUserVisibleHint() || keyEvent == null || keyEvent.getKeyCode() != 4 || this.LL) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return true;
        }
        bo();
        this.LL = true;
        LLILZ.getClass();
        C1572370r1H.LIZIZ();
        return true;
    }
}
