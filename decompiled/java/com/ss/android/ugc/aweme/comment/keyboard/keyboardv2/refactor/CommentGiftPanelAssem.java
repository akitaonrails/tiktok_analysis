package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C1346420l8q;
import X.C1348790lCf;
import X.C13LE;
import X.C1548820qPI;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C20097313kJ;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC1349160lDG;
import X.InterfaceC1554640qYg;
import X.InterfaceC20673515v3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboarInputAbility;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentGiftPanelAssem extends UISlotAssem implements IKeyboardProtocol, ICommentGiftPanelAssemVAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C1348790lCf LLJJIJI;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C726120Se2 LLJJI = new C726120Se2();
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 127));
    public final IVideoGiftService LLJJIJIIJIL = VideoGiftService.LJI();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentGiftPanelAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentGiftPanelAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 22));
        this.LLJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 128));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fs2;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentKeyboardScope.class});
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentKeyboardScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1068315276) {
            return null;
        }
        return this;
    }

    public final void hp() {
        CommentContextSource commentContextSourceIp;
        CommentCommonModel commonModel;
        Aweme aweme;
        GiftViewModel giftViewModel;
        CommentKeyboardModel keyboardModel;
        CommentCommonModel commonModel2;
        IVideoGiftService iVideoGiftService = this.LLJJIJIIJIL;
        CommentContextSource commentContextSourceIp2 = ip();
        Boolean boolValueOf = null;
        if (iVideoGiftService.LIZ((commentContextSourceIp2 == null || (commonModel2 = commentContextSourceIp2.getCommonModel()) == null) ? null : commonModel2.aweme)) {
            CommentContextSource commentContextSourceIp3 = ip();
            if (commentContextSourceIp3 != null && (keyboardModel = commentContextSourceIp3.getKeyboardModel()) != null) {
                boolValueOf = Boolean.valueOf(keyboardModel.getEnableGiftScene());
            }
            if (!C1346420l8q.LIZ(boolValueOf) || this.LLJJIII.getValue() == null || (commentContextSourceIp = ip()) == null || (commonModel = commentContextSourceIp.getCommonModel()) == null || (aweme = commonModel.aweme) == null || (giftViewModel = (GiftViewModel) this.LLJJIII.getValue()) == null) {
                return;
            }
            giftViewModel.PF2(aweme.getAid(), AwemeExtKt.getAuthorUid(aweme));
        }
    }

    public final CommentContextSource ip() {
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1348790lCf c1348790lCf = this.LLJJIJI;
        if (c1348790lCf != null) {
            C1548820qPI.LJIIIIZZ("wallet_exchange_status", c1348790lCf.LJIIJ);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        CommentContextSource commentContextSourceIp;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceIp2;
        CommentCommonModel commonModel2;
        Fragment fragmentLJI;
        C19EG activity;
        View view;
        ViewGroup viewGroup;
        Fragment fragmentLJI2;
        View view2;
        MutableLiveData<GiftStruct> mutableLiveDataWQ2;
        if (this.LLJJIII.getValue() != null && (commentContextSourceIp = ip()) != null && (commonModel = commentContextSourceIp.getCommonModel()) != null && commonModel.aweme != null && (commentContextSourceIp2 = ip()) != null && (commonModel2 = commentContextSourceIp2.getCommonModel()) != null && commonModel2.aweme != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (activity = fragmentLJI.getActivity()) != null && (view = getSupervisor().LLJJIII) != null && (viewGroup = (ViewGroup) view.findViewById(this.LLIZ)) != null) {
            GiftViewModel giftViewModel = (GiftViewModel) this.LLJJIII.getValue();
            if (giftViewModel != null && (mutableLiveDataWQ2 = giftViewModel.wQ2()) != null) {
                getActualLifecycleOwner();
                mutableLiveDataWQ2.observe(this, new AObserverS224S0100000_21(this, 107));
            }
            GiftViewModel giftViewModel2 = (GiftViewModel) this.LLJJIII.getValue();
            if (giftViewModel2 != null && (fragmentLJI2 = C724240Sb0.LJI(this)) != null) {
                C1348790lCf c1348790lCf = new C1348790lCf(fragmentLJI2, viewGroup, activity, giftViewModel2, new InterfaceC1349160lDG() { // from class: X.0kzZ
                    @Override // X.InterfaceC1349160lDG
                    public final void LIZ() {
                        Object objLIZ;
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this.LIZ);
                        C844470XAv.LIZ.getClass();
                        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IKeyboarInputAbility.class, null);
                            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, CommentKeyboardScope.class);
                            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(IKeyboarInputAbility.class) : null;
                            if (!(ability instanceof IKeyboarInputAbility)) {
                                ability = null;
                            }
                            InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) ability;
                            C0DJ3 c0dj3 = C0DJ3.LIZ;
                            String strLJI = C13LE.LIZ(IKeyboarInputAbility.class).LJI();
                            if (strLJI == null) {
                                strLJI = "null";
                            }
                            c0dj3.getClass();
                            C0DJ3.LIZ(interfaceC494301wDLIZ, strLJI, interfaceC494301wD);
                        }
                        C0DJ3.LIZ.getClass();
                        if (C0DJ3.LIZIZ()) {
                            C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, CommentKeyboardScope.class);
                            Object ability2 = c0qsjLIZJ2 != null ? c0qsjLIZJ2.getAbility(IKeyboarInputAbility.class) : null;
                            objLIZ = (IKeyboarInputAbility) (ability2 instanceof IKeyboarInputAbility ? ability2 : null);
                        } else {
                            objLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IKeyboarInputAbility.class, null);
                        }
                        IKeyboarInputAbility iKeyboarInputAbility = (IKeyboarInputAbility) objLIZ;
                        if (iKeyboarInputAbility != null) {
                            iKeyboarInputAbility.yj();
                        }
                    }
                });
                this.LLJJIJI = c1348790lCf;
                C1548820qPI.LIZLLL("wallet_exchange_status", c1348790lCf.LJIIJ);
                C1348790lCf c1348790lCf2 = this.LLJJIJI;
                if (c1348790lCf2 != null && (view2 = c1348790lCf2.LJI) != null) {
                    Zo(view2);
                }
            }
        }
        super.xo();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C19EG activity;
        Window window;
        View decorView;
        super.onResume();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        C20097313kJ.LIZJ(decorView);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        hp();
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIL.getValue(), new C2217381BqS() { // from class: X.0lBn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 22), 4);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
        hp();
        C1348790lCf c1348790lCf = this.LLJJIJI;
        if (c1348790lCf != null) {
            c1348790lCf.LJIIIZ.getClass();
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                interfaceC20673515v3K4.LLILL("video_gift_panel");
            }
        }
    }
}
