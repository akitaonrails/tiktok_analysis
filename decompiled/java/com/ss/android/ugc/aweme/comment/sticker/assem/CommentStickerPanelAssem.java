package com.ss.android.ugc.aweme.comment.sticker.assem;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0AE6;
import X.C0I03;
import X.C0I05;
import X.C0I06;
import X.C0XQ7;
import X.C1220000hqw;
import X.C1345760l7m;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C294720Bgs;
import X.C295780Bia;
import X.C295880Bik;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C457770HxH;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726120Se2;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC454020HrE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC453710Hqj;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentStickerPanelAssem extends UISlotAssem implements C0I06 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C726120Se2 LLJJI = new C726120Se2();
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C0I03.class, "comment_sticker_input_service"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentStickerPanelAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fs2;
    }

    public static void mp() {
        if (((Number) C0AE6.LIZ.getValue()).intValue() > 0) {
            C0I05.LIZ.getClass();
            if (C0I05.LIZ()) {
                return;
            }
            C0I05.LJFF = Boolean.TRUE;
            C0I05.LIZIZ().storeBoolean("has_added_fav_sticker_to_input", true);
        }
    }

    @Override // X.C0I06
    public final Integer Ga() {
        C0I03 c0i03Kp;
        Function0<Boolean> function0;
        if (((Number) C0AE6.LIZ.getValue()).intValue() <= 0) {
            return null;
        }
        C0I05.LIZ.getClass();
        return (!C0I05.LIZ() || (c0i03Kp = kp()) == null || (function0 = c0i03Kp.LLILZIL) == null || !function0.invoke().booleanValue() || C294720Bgs.LIZ()) ? null : 7;
    }

    public final CommentContextSource hp() {
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return c726120Se2.LIZ(this);
    }

    public final boolean ip() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    public final C0I03 kp() {
        return (C0I03) this.LLJJIII.getValue();
    }

    public final int lp() {
        return ((Number) this.LLJJIJIIJIL.getValue()).intValue();
    }

    public CommentStickerPanelAssem() {
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 59);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(47), new AwS550S0100000_6((AbstractC738140SxQ) this, 58), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(37));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(33));
        this.LLJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(34));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(35));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(36));
    }

    @Override // X.C0I06
    public final int fJ() {
        int iFJ;
        int iLp = lp();
        if (iLp != EnumC454020HrE.ONLY_COMMENT.getType()) {
            if (iLp == EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
                iFJ = IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ().fJ();
            }
            return 5;
        }
        iFJ = C0I05.LIZJ(C0I05.LIZ);
        if (iFJ == -1) {
            return 5;
        }
        return iFJ;
    }

    @Override // X.C0I06
    public final long hN() {
        int iLp = lp();
        if (iLp == EnumC454020HrE.ONLY_COMMENT.getType()) {
            return C0I05.LIZLLL(C0I05.LIZ);
        }
        if (iLp == EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
            return IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ().hN();
        }
        return -1L;
    }

    @Override // X.C0I06
    public final void Dg(int i) {
        int iLp = lp();
        if (iLp == EnumC454020HrE.ONLY_COMMENT.getType()) {
            C0I05.LJIIIIZZ(C0I05.LIZ, i);
        } else {
            if (iLp != EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
                return;
            }
            IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ().Dg(i);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        C01GW c01gw = C295880Bik.LIZ;
        if (C295880Bik.LIZLLL) {
            C01GW c01gw2 = C295780Bia.LIZ;
            if (C295780Bia.LIZIZ) {
                return LJJIJL().getContext();
            }
        }
        super.Eo(context);
        return context;
    }

    @Override // X.C0I06
    public final void c8(long j) {
        int iLp = lp();
        if (iLp == EnumC454020HrE.ONLY_COMMENT.getType()) {
            C0I05.LIZ.getClass();
            Keva kevaLIZIZ = C0I05.LIZIZ();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sticker_set_id");
            sbLIZ.append(curUserId);
            kevaLIZIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
            return;
        }
        if (iLp != EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
            return;
        }
        IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ().c8(j);
    }

    @Override // X.C0I06
    public final void la(int i) {
        int iLp = lp();
        if (iLp == EnumC454020HrE.ONLY_COMMENT.getType()) {
            C0I05.LIZ.getClass();
            Keva kevaLIZIZ = C0I05.LIZIZ();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scroll_offset");
            sbLIZ.append(curUserId);
            kevaLIZIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
            return;
        }
        if (iLp != EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
            return;
        }
        IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ().la(i);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0I05.LIZ.getClass();
        if (!C0I05.LJII()) {
            C0I05.LJ = Boolean.TRUE;
            C0I05.LIZIZ().storeBoolean("sticker_used", true);
        }
        C457770HxH c457770HxH = InterfaceC453710Hqj.LIZ;
        LifecycleOwnerKt.getLifecycleScope(this);
        AwS407S0200000_6 awS407S0200000_6 = new AwS407S0200000_6(this, view, 2);
        c457770HxH.getClass();
        C457770HxH.LIZ((ViewGroup) view, awS407S0200000_6);
        AssemViewModel value = this.LLJJIJI.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS442S0200000_6(this, view, 0));
        ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(C724240Sb0.LJI(this), C1558520qew.LJIIL(this));
        if (iCommentFakeInputAbilityLIZJ != null) {
            iCommentFakeInputAbilityLIZJ.Ym0();
        }
    }

    @Override // X.C0I06
    public final void z4(int i) {
        int iLp = lp();
        if (iLp == EnumC454020HrE.ONLY_COMMENT.getType()) {
            C0I05.LIZ.getClass();
            Keva kevaLIZIZ = C0I05.LIZIZ();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scroll_position");
            sbLIZ.append(curUserId);
            kevaLIZIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
            return;
        }
        if (iLp != EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
            return;
        }
        IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ().z4(i);
    }
}
