package com.ss.android.ugc.profile.business.profile.menu.business.content.business.base;

import X.C01GW;
import X.C11G4;
import X.C1248270iaX;
import X.C1248860ibU;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C1250210idf;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1558520qew;
import X.C16GA;
import X.C1720106oR;
import X.C19252910Tv;
import X.C19EG;
import X.C19ME;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452501pT;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC665370Q7z;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.CellBizBaseData;
import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ContentCellNewBaseUIComponent<T extends CellBizBaseData> extends BaseUIComponent {
    public Context LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((ContentCellNewBaseUIComponent) this, 2109));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(367));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19((ContentCellNewBaseUIComponent) this, 2110));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19((ContentCellNewBaseUIComponent) this, 2108));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19((ContentCellNewBaseUIComponent) this, 2107));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19((ContentCellNewBaseUIComponent) this, 2106));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19((ContentCellNewBaseUIComponent) this, 2111));
    public final boolean LLJZIJLIL = true;
    public final ACListenerS154S0100000_19 LLL = new ACListenerS154S0100000_19(this, 149);
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS563S0100000_19((ContentCellNewBaseUIComponent) this, 2105));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        ProfileMenuViewModel profileMenuViewModelZn2;
        ProfileMenuViewModel profileMenuViewModelZn22;
        IPageMenuAbility iPageMenuAbility = (IPageMenuAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPageMenuAbility.class, null);
        if (iPageMenuAbility != null && (profileMenuViewModelZn22 = iPageMenuAbility.zn2()) != null) {
            C736680Sv4.LJIIIIZZ(this, profileMenuViewModelZn22, new C2217381BqS() { // from class: X.0ic8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C596330NaB) obj).LLILZ;
                }
            }, null, new AwS633S0100000_19((ContentCellNewBaseUIComponent) this, 117), 6);
        }
        IPageMenuAbility iPageMenuAbility2 = (IPageMenuAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPageMenuAbility.class, null);
        if (iPageMenuAbility2 == null || (profileMenuViewModelZn2 = iPageMenuAbility2.zn2()) == null) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, profileMenuViewModelZn2, new C2217381BqS() { // from class: X.0ic9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C596330NaB) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19((ContentCellNewBaseUIComponent) this, 118), 4);
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final IMenuAbility Ap() {
        return (IMenuAbility) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        View view = this.LLJJ;
        if (view != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
            ISectionListAbility iSectionListAbility = (ISectionListAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ISectionListAbility.class, c1248950ibd != null ? c1248950ibd.LLILLL : null);
            if (iSectionListAbility != null) {
                String str = this.assemTagInternal;
                if (str == null) {
                    str = "";
                }
                iSectionListAbility.cg(view, this.LLJILLL, str, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lo() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent.Lo():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        ProfileComponents profileComponents;
        List<Action> list;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.actions) == null) {
            return;
        }
        for (Action action : list) {
            if (Intrinsics.LJFF(action.getType(), "router")) {
                Context context = getContext();
                Action.RouterInfo router = action.getRouter();
                SmartRouter.buildRoute(context, router != null ? router.getUrl() : null).open();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(getContext(), R.style.y0));
        IPageMenuAbility iPageMenuAbility = (IPageMenuAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPageMenuAbility.class, null);
        this.LLJJLIIIJLLLLLLLZ = iPageMenuAbility != null ? iPageMenuAbility.ub1() : null;
        super.onCreate();
    }

    public final ContentCellProtocol up() {
        return (ContentCellProtocol) this.LLJLLIL.getValue();
    }

    public final C1248860ibU yp() {
        return (C1248860ibU) this.LLJLIL.getValue();
    }

    public final void Bp() {
        C11G4 c11g4;
        String str;
        String str2;
        ContentCellProtocol contentCellProtocolUp;
        C127K c127k;
        if (Ep()) {
            ContentCellProtocol contentCellProtocolUp2 = up();
            if (contentCellProtocolUp2 != null) {
                contentCellProtocolUp2.LLJL = false;
            }
            View view = this.LLJJ;
            C127M accessory = null;
            if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
                accessory = c127k.getAccessory();
            }
            if (!(accessory instanceof C11G4) || (c11g4 = (C11G4) accessory) == null) {
                return;
            }
            ContentCellProtocol contentCellProtocolUp3 = up();
            if (contentCellProtocolUp3 == null || (str = contentCellProtocolUp3.LLJLLIL) == null || str.length() == 0) {
                c11g4.LJIILJJIL("");
                return;
            }
            ContentCellProtocol contentCellProtocolUp4 = up();
            if (contentCellProtocolUp4 == null || (str2 = contentCellProtocolUp4.LLJLLIL) == null || (contentCellProtocolUp = up()) == null) {
                return;
            }
            contentCellProtocolUp.LJLL(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Gp() {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent.Gp():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        ContentCellProtocol contentCellProtocolUp = up();
        if (contentCellProtocolUp != null) {
            contentCellProtocolUp.LLIZLLLIL = (IProfilePlatformVM) this.LLJZ.getValue();
        }
        ContentCellProtocol contentCellProtocolUp2 = up();
        if (contentCellProtocolUp2 != null) {
            contentCellProtocolUp2.LLJI = true;
            contentCellProtocolUp2.LLJJIJIL = "personal_homepage";
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void bp() {
        super.bp();
        ContentCellProtocol contentCellProtocolUp = up();
        if (contentCellProtocolUp != null) {
            contentCellProtocolUp.LLILZ = C724240Sb0.LJI(this);
        }
        ContentCellProtocol contentCellProtocolUp2 = up();
        if (contentCellProtocolUp2 != null) {
            contentCellProtocolUp2.LLJLIL = (C419890GdH) this.LLLF.getValue();
        }
        ContentCellProtocol contentCellProtocolUp3 = up();
        if (contentCellProtocolUp3 != null) {
            contentCellProtocolUp3.LLIZ = this.LLJJI;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        View view = this.LLJJ;
        ViewParent parent = view != null ? view.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLJJ, viewGroup);
        }
        ContentCellProtocol contentCellProtocolUp = up();
        if (contentCellProtocolUp != null) {
            contentCellProtocolUp.onDestroy();
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        ContentCellBizBaseData contentCellBizBaseData;
        Fragment fragmentLJI;
        C19EG activity;
        C19EG activity2;
        Intent intent;
        super.onResume();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume. clicked:");
        sbLIZ.append(this.LLJL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJL) {
            this.LLJL = false;
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (activity2 = fragmentLJI2.getActivity()) != null && (intent = activity2.getIntent()) != null && intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                C1720106oR.LJI("ContentCellNewBaseUIComponent", "onResume. push tab intent");
                intent.removeExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                return;
            }
            BizBaseData bizBaseData = this.LLJJIJIIJIL;
            if (!(bizBaseData instanceof ContentCellBizBaseData) || (contentCellBizBaseData = (ContentCellBizBaseData) bizBaseData) == null || !Intrinsics.LJFF(contentCellBizBaseData.getHideMenuOnBack(), Boolean.TRUE) || (fragmentLJI = C724240Sb0.LJI(this)) == null || (activity = fragmentLJI.getActivity()) == null) {
                return;
            }
            Hox hoxLIZ = Hox.LLJILJIL.LIZ(activity);
            Bundle bundle = new Bundle();
            bundle.putBoolean("isSmoothScroll", true);
            hoxLIZ.TQ2(bundle, "USER", false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void tp() {
        C127K c127k;
        String str;
        Describe describe;
        ContentCellProtocol contentCellProtocolUp;
        ProfileComponents profileComponents;
        ContentCellProtocol contentCellProtocolUp2 = up();
        BizBaseData bizBaseData = null;
        if (Intrinsics.LJFF(contentCellProtocolUp2 != null ? Boolean.valueOf(contentCellProtocolUp2.LJJLIIIJILLIZJL()) : null, Boolean.TRUE)) {
            return;
        }
        View view = this.LLJJ;
        if (!(view instanceof C127K) || (c127k = (C127K) view) == null) {
            return;
        }
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (str = profileComponents.componentId) == null) {
            str = this.LLJILJIL;
        }
        BizBaseData bizBaseData2 = this.LLJJIJIIJIL;
        c127k.setTitle(((bizBaseData2 == null && ((contentCellProtocolUp = up()) == null || (bizBaseData2 = contentCellProtocolUp.LLJILJIL) == null)) || (describe = bizBaseData2.getDescribe()) == null) ? null : describe.getText());
        TuxTextView tuxTextView = (TuxTextView) c127k.findViewById(R.id.y3j);
        if (tuxTextView != null) {
            BizBaseData bizBaseData3 = this.LLJJIJIIJIL;
            if (bizBaseData3 == null) {
                ContentCellProtocol contentCellProtocolUp3 = up();
                bizBaseData3 = contentCellProtocolUp3 != null ? contentCellProtocolUp3.LLJILJIL : null;
            }
            C1248270iaX.LIZJ(tuxTextView, bizBaseData3, str, null, null, false, 28);
        }
        TuxIconView tuxIconView = (TuxIconView) c127k.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            BizBaseData bizBaseData4 = this.LLJJIJIIJIL;
            if (bizBaseData4 == null) {
                ContentCellProtocol contentCellProtocolUp4 = up();
                if (contentCellProtocolUp4 != null) {
                    bizBaseData = contentCellProtocolUp4.LLJILJIL;
                }
            } else {
                bizBaseData = bizBaseData4;
            }
            C1248270iaX.LIZ(tuxIconView, bizBaseData, str, null, null, null);
        }
    }

    public boolean Ep() {
        return this.LLJZIJLIL;
    }

    public View.OnClickListener zp() {
        return this.LLL;
    }

    public void Fp(boolean z) {
        ContentCellProtocol contentCellProtocolUp = up();
        if (contentCellProtocolUp != null) {
            contentCellProtocolUp.LJLJJLL(null, z);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public void Hj(ProfileComponents profileComponents) {
        super.Hj(profileComponents);
        if (this.LLJJJJJIL) {
            return;
        }
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        tp();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View So(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context;
        Describe describe;
        CharSequence text;
        int iIntValue;
        View viewLJFF;
        LinearLayout.LayoutParams layoutParams;
        C19ME c19me;
        C19ME c19me2;
        Icon icon;
        Integer iconInt$default;
        ContentCellProtocol contentCellProtocolUp;
        View view = null;
        layoutParams = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        view = null;
        if (getContext() != null && (context = this.LLJJLIIIJLLLLLLLZ) != null) {
            C127K c127k = new C127K(context, null, 6);
            BizBaseData bizBaseData = this.LLJJIJIIJIL;
            if ((bizBaseData != null || ((contentCellProtocolUp = up()) != null && (bizBaseData = contentCellProtocolUp.LLJILJIL) != null)) && (describe = bizBaseData.getDescribe()) != null) {
                text = describe.getText();
            } else {
                text = null;
            }
            c127k.setTitle(text);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = yp().LIZIZ;
            c419910GdJ.LIZJ = yp().LIZJ;
            BizBaseData bizBaseData2 = this.LLJJIJIIJIL;
            if (bizBaseData2 == null) {
                ContentCellProtocol contentCellProtocolUp2 = up();
                if (contentCellProtocolUp2 != null) {
                    bizBaseData2 = contentCellProtocolUp2.LLJILJIL;
                } else {
                    bizBaseData2 = null;
                }
            }
            if (bizBaseData2 != null && (icon = bizBaseData2.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, null, 3, null)) != null) {
                iIntValue = iconInt$default.intValue();
            } else {
                iIntValue = 0;
            }
            c419910GdJ.LIZ = iIntValue;
            c419910GdJ.LJ = Integer.valueOf(yp().LIZLLL);
            c127k.setIcon(c419910GdJ);
            C11G4 c11g4 = new C11G4(context, null);
            c11g4.LJIILL(zp());
            c127k.setAccessory(c11g4);
            TuxIconView tuxIconView = (TuxIconView) c127k.findViewById(R.id.k1_);
            if (tuxIconView != null) {
                ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (c19me2 = (C19ME) layoutParams3) != null) {
                    c19me2.startToStart = 0;
                    c19me2.topToTop = 0;
                    c19me2.bottomToBottom = 0;
                    ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
                    ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = 0;
                    c19me2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                    c19me2.setMarginEnd(0);
                    C786410Ut5.M6(tuxIconView, c19me2);
                }
            }
            TextView textView = (TextView) c127k.findViewById(R.id.y3j);
            if (textView != null) {
                C426750GoL.LJIIIZ(textView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            C127M accessory = c127k.getAccessory();
            if (accessory != null && (viewLJFF = accessory.LJFF()) != null) {
                ViewGroup.LayoutParams layoutParams4 = viewLJFF.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (c19me = (C19ME) layoutParams4) != null) {
                    c19me.topToTop = 0;
                    c19me.bottomToBottom = 0;
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                    ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                    c19me.setMarginStart(0);
                    c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                    C786410Ut5.W5(viewLJFF, c19me);
                }
                c127k.setGravity(8388629);
                TuxIconView tuxIconView2 = (TuxIconView) viewLJFF.findViewById(R.id.k1_);
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(R.raw.icon_chevron_right_slim_thin_ltr);
                    tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    tuxIconView2.setTintColorRes(R.attr.a1k);
                    ViewGroup.LayoutParams layoutParams5 = tuxIconView2.getLayoutParams();
                    if ((layoutParams5 instanceof C16GA) && (layoutParams = (LinearLayout.LayoutParams) layoutParams5) != null) {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        layoutParams2 = layoutParams;
                    }
                    C786410Ut5.M6(tuxIconView2, layoutParams2);
                }
            }
            View viewFindViewById = c127k.findViewById(R.id.dlh);
            if (viewFindViewById != null) {
                C426750GoL.LJIIL(viewFindViewById, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), 16);
                C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), 0, false, 16);
                C427690Gpr.LJ(viewFindViewById, C418440Gaw.LIZIZ(8));
            }
            view = c127k;
            c127k.setTag(this.assemTagInternal);
        }
        C1248870ibV.LIZJ(view, profileComponentUIConfig, true, false);
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLIZLLLIL(view, null, null, Boolean.FALSE);
        ContentCellProtocol contentCellProtocolUp3 = up();
        if (contentCellProtocolUp3 != null) {
            contentCellProtocolUp3.LLILZLL = view;
        }
        return view;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void ep(n nVar) {
        BizBaseData bizBaseData;
        try {
            bizBaseData = (BizBaseData) C1250210idf.LIZ(nVar.toString(), ContentCellBizBaseData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("ContentCellNewBaseUIComponent", "parseComponentBizData error", e);
            bizBaseData = null;
        }
        this.LLJJIJIIJIL = bizBaseData;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void hp(Function0<Unit> function0, Function1<? super ProfilePlatformProtocol<BizBaseData>, Unit> function1) {
        ContentCellProtocol contentCellProtocolUp = up();
        if (!(contentCellProtocolUp instanceof ProfilePlatformProtocol)) {
            contentCellProtocolUp = null;
        }
        function1.invoke(contentCellProtocolUp);
    }
}
