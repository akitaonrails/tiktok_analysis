package com.ss.android.ugc.aweme.tako.multipletemplate.gallery;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1559260qg8;
import X.C1561230qjJ;
import X.C1631406a8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1853010yJv;
import X.C1853550yKn;
import X.C1853560yKo;
import X.C1854240yLu;
import X.C1861330yXL;
import X.C1862330yYx;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C540120LGg;
import X.C540190LGn;
import X.C622620ObU;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1767370w5n;
import X.EnumC540140LGi;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC540160LGk;
import X.InterfaceC540170LGl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS35S0101000_24;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMediaChooseView extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJ;
    public View LLJJJIL;
    public C1854240yLu LLJJJJ;
    public boolean LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public TuxTextView LLJLLIL;
    public final C1559260qg8 LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMediaChooseView.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoMediaChooseView.class, "takoMenuWindowViewModel", "getTakoMenuWindowViewModel()Lcom/ss/android/ugc/aweme/tako/menuwindow/TakoMenuWindowViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoMediaChooseView.class, "templateListViewModel", "getTemplateListViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/templatelist/TemplateListViewModel;", 0);
        c09r3.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TakoMediaChooseView() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1315), AFwS269S0000000_27.get$arr$(259), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMenuWindowViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1318), AFwS269S0000000_27.get$arr$(260), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TemplateListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ3, 1320), AFwS269S0000000_27.get$arr$(261), null, true);
        this.LLJLLL = new C1559260qg8(new C723580SZw(this, C1853010yJv.class, null), checkSupervisorPrepared());
        this.LLJZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1314));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1313));
        this.LLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1316));
        this.LLLF = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1317));
        this.LLLFF = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1319));
        this.LLLFFI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1309));
        this.LLLFZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1321));
        this.LLLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1310));
        this.LLLII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1308));
        this.LLLIIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1312));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1322));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1307));
        this.LLLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1306));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1311));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fqd;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1853010yJv ip() {
        return (C1853010yJv) this.LLJLLL.getValue();
    }

    public final TakoPhotoChooseViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
        return (TakoPhotoChooseViewModel) assemVMLazy.getValue();
    }

    public final TemplateListViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
        return (TemplateListViewModel) assemVMLazy.getValue();
    }

    public final void sp() {
        C19EG c19egLIZ;
        String enterMethod;
        String str;
        String str2;
        Map<String, String> commonMobParams;
        String str3;
        Map<String, String> commonMobParams2;
        Map<String, String> commonMobParams3;
        C1853010yJv c1853010yJvIp;
        Map<String, String> commonMobParams4;
        C1853010yJv c1853010yJvIp2;
        Map<String, String> commonMobParams5;
        if (((Boolean) this.LLLII.getValue()).booleanValue() || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        String str4 = C540120LGg.LIZLLL() ? "full_access" : C540120LGg.LJ() ? "limit_access" : "not_allow";
        C1853010yJv c1853010yJvIp3 = ip();
        String enterFrom = c1853010yJvIp3 != null ? c1853010yJvIp3.getEnterFrom() : null;
        String str5 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        if ((enterFrom.length() == 0) && ((c1853010yJvIp2 = ip()) == null || (commonMobParams5 = c1853010yJvIp2.getCommonMobParams()) == null || (enterFrom = commonMobParams5.get("enter_from")) == null)) {
            enterFrom = "";
        }
        C1853010yJv c1853010yJvIp4 = ip();
        if (c1853010yJvIp4 == null || (enterMethod = c1853010yJvIp4.getEnterMethod()) == null) {
            enterMethod = "";
        }
        if ((enterMethod.length() == 0) && ((c1853010yJvIp = ip()) == null || (commonMobParams4 = c1853010yJvIp.getCommonMobParams()) == null || (enterMethod = commonMobParams4.get("enter_method")) == null)) {
            enterMethod = "";
        }
        C1853010yJv c1853010yJvIp5 = ip();
        if (c1853010yJvIp5 == null || (commonMobParams3 = c1853010yJvIp5.getCommonMobParams()) == null || (str = commonMobParams3.get("process_id")) == null) {
            str = "";
        }
        C1853010yJv c1853010yJvIp6 = ip();
        if (c1853010yJvIp6 == null || (commonMobParams2 = c1853010yJvIp6.getCommonMobParams()) == null || (str2 = commonMobParams2.get("tako_session_id")) == null) {
            str2 = "";
        }
        C1853010yJv c1853010yJvIp7 = ip();
        if (c1853010yJvIp7 != null && (commonMobParams = c1853010yJvIp7.getCommonMobParams()) != null && (str3 = commonMobParams.get("tako_chat_id")) != null) {
            str5 = str3;
        }
        final Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", enterFrom), new Pair("enter_method", enterMethod), new Pair("process_id", str), new Pair("tako_session_id", str2), new Pair("tako_chat_id", str5));
        EnumC540140LGi enumC540140LGi = EnumC540140LGi.IMAGE;
        final boolean zLJI = C540120LGg.LJI(c19egLIZ, enumC540140LGi);
        if (zLJI) {
            C1862330yYx.LJJIIJZLJL(C1862330yYx.LIZ, mapLJIIIIZZ, str4, null, 12);
        }
        C540120LGg.LJFF(c19egLIZ, new TokenCert("bpea-tako_image_uplad_request_permission_photo_album_read"), enumC540140LGi, new InterfaceC540170LGl() { // from class: X.0yKU
            @Override // X.InterfaceC540170LGl
            public final void LIZ(boolean z) {
                this.LIZ.kp().BQ2(EnumC1853160yKA.DENIED);
                if (zLJI && z) {
                    C1862330yYx.LJJIIZ(C1862330yYx.LIZ, mapLJIIIIZZ, "click_not_allow", null, 12);
                }
            }
        }, new InterfaceC540160LGk() { // from class: X.0yKT
            @Override // X.InterfaceC540160LGk
            public final void LIZ(C0L9V c0l9v) {
                String str6;
                C1854240yLu c1854240yLu = this.LIZ.LLJJJJ;
                if (c1854240yLu != null && c1854240yLu.LIZ().getState() == 3) {
                    this.LIZ.hp(1.0f);
                } else {
                    this.LIZ.hp(0.0f);
                }
                this.LIZ.tp();
                boolean zLIZLLL = C540120LGg.LIZLLL();
                boolean zLJ = C540120LGg.LJ();
                if (zLIZLLL) {
                    this.LIZ.kp().BQ2(EnumC1853160yKA.FULL_GRANTED);
                } else if (zLJ) {
                    this.LIZ.kp().BQ2(EnumC1853160yKA.PARTIAL_GRANTED);
                } else {
                    this.LIZ.kp().BQ2(EnumC1853160yKA.DENIED);
                }
                if (zLJI && c0l9v == C0L9V.GRANTED_AFTER_REQUEST) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    Map<String, String> map = mapLJIIIIZZ;
                    if (zLIZLLL) {
                        str6 = "click_full_access";
                    } else if (zLJ) {
                        str6 = "click_limit_access";
                    } else {
                        str6 = "click_not_allow";
                    }
                    C1862330yYx.LJJIIZ(c1862330yYx, map, str6, null, 12);
                }
            }
        });
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622620ObU.LIZIZ("tako_multi_template_photo_list");
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C1561230qjJ.LIZ.getClass();
        if (C1561230qjJ.LIZ()) {
            return;
        }
        sp();
    }

    public final void tp() {
        if (C540120LGg.LIZLLL() || C540120LGg.LJ()) {
            C1854240yLu c1854240yLu = this.LLJJJJ;
            if (c1854240yLu != null) {
                c1854240yLu.LIZ().setDraggable(true);
                return;
            }
            return;
        }
        C1854240yLu c1854240yLu2 = this.LLJJJJ;
        if (c1854240yLu2 != null) {
            c1854240yLu2.LIZ().setDraggable(false);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    public final void hp(float f) {
        boolean z;
        if (!C540190LGn.LIZ && !C540120LGg.LIZLLL() && C540120LGg.LJ()) {
            z = true;
        } else {
            z = false;
        }
        if (C540190LGn.LIZ) {
            View view = this.LLJLIL;
            if (view != null) {
                C1631406a8.LIZ(view);
                return;
            }
            return;
        }
        if (!z) {
            View view2 = this.LLJLIL;
            if (view2 != null) {
                C1631406a8.LIZ(view2);
                return;
            }
            return;
        }
        View view3 = this.LLJLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        if (((Boolean) this.LLJZ.getValue()).booleanValue()) {
            View view4 = this.LLJLIL;
            if (view4 != null) {
                C1631406a8.LIZIZ(view4, f + 1);
                return;
            }
            return;
        }
        View view5 = this.LLJLIL;
        if (view5 == null) {
            return;
        }
        C1631406a8.LIZIZ(view5, f);
    }

    public final void mp(int i) {
        View viewFindViewByPosition;
        int height;
        LinearLayoutManager linearLayoutManager;
        int peekHeight;
        int top;
        BottomSheetBehavior<View> bottomSheetBehaviorLIZ;
        BottomSheetBehavior<View> bottomSheetBehaviorLIZ2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            Integer numValueOf = null;
            if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(i)) != null) {
                int i2 = kp().LLJIJIL;
                if (viewOnAttachStateChangeListenerC20604515jv.getHeight() > 0 && i2 > 0) {
                    C1854240yLu c1854240yLu = this.LLJJJJ;
                    if (c1854240yLu != null && (bottomSheetBehaviorLIZ2 = c1854240yLu.LIZ()) != null) {
                        numValueOf = Integer.valueOf(bottomSheetBehaviorLIZ2.getState());
                    }
                    if (numValueOf != null && numValueOf.intValue() == 4) {
                        C1854240yLu c1854240yLu2 = this.LLJJJJ;
                        if (c1854240yLu2 != null && (bottomSheetBehaviorLIZ = c1854240yLu2.LIZ()) != null) {
                            peekHeight = bottomSheetBehaviorLIZ.getPeekHeight();
                        } else {
                            peekHeight = 0;
                        }
                        View view = this.LLJJJIL;
                        if (view != null) {
                            top = view.getTop();
                        } else {
                            top = 0;
                        }
                        height = (peekHeight - LJJIJL().getPaddingTop()) - top;
                    } else {
                        height = viewOnAttachStateChangeListenerC20604515jv.getHeight();
                    }
                    int iLJFF = C418440Gaw.LJFF((height - i2) - viewFindViewByPosition.getHeight(), viewOnAttachStateChangeListenerC20604515jv.getContext());
                    if (viewFindViewByPosition.getTop() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJFF)))) {
                        RecyclerView.LayoutManager layoutManager2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
                            C1861330yXL.LJII(linearLayoutManager, i, viewOnAttachStateChangeListenerC20604515jv.getContext(), iLJFF, 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS35S0101000_24(this, i, 3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x015a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoMediaChooseView.onViewCreated(android.view.View):void");
    }

    public static final void op(InterfaceC1891350zJl interfaceC1891350zJl, EnumC1767370w5n enumC1767370w5n) {
        if (interfaceC1891350zJl instanceof C1853560yKo) {
            ((C1853560yKo) interfaceC1891350zJl).LLILLL = enumC1767370w5n;
        } else {
            if (!(interfaceC1891350zJl instanceof C1853550yKn)) {
                return;
            }
            ((C1853550yKn) interfaceC1891350zJl).LLILLL = enumC1767370w5n;
        }
    }
}
