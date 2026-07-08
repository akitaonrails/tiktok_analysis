package com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders;

import X.C01GW;
import X.C054G;
import X.C0F29;
import X.C0M0P;
import X.C0M1K;
import X.C0M31;
import X.C0M35;
import X.C0M7M;
import X.C0VSJ;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1443030nef;
import X.C1697580uHE;
import X.C1697810uHb;
import X.C20642515q3;
import X.C2188811AlT;
import X.C23250099c;
import X.C341550DaD;
import X.C426320Gne;
import X.C427760Gpy;
import X.C452501pT;
import X.C549720LhC;
import X.C551520Lk6;
import X.C551550Lk9;
import X.C551580LkC;
import X.C561130Lzb;
import X.C562150M2z;
import X.C562670M4z;
import X.C786410Ut5;
import X.EnumC428930Grr;
import X.EnumC429060Gs4;
import X.EnumC545550LaT;
import X.InterfaceC497601wk;
import X.InterfaceC558600LvW;
import X.InterfaceC562000M2k;
import X.ViewOnLongClickListenerC580880MqM;
import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS134S0201000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class DraftBoxTaskItemViewHolder extends DraftItemBaseBgViewHolder {
    public final View LLJJ;
    public final C561130Lzb LLJJI;
    public final InterfaceC497601wk LLJJIII;
    public final InterfaceC562000M2k LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public ViewGroup LLJJJJ;
    public C427760Gpy LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final void onViewDetachedFromWindow() {
    }

    private final TuxIconView f6() {
        return (TuxIconView) this.LLJZIJLIL.getValue();
    }

    private final TuxTextView h6() {
        return (TuxTextView) this.LLL.getValue();
    }

    public final View e6() {
        return (View) this.LLJZ.getValue();
    }

    public final View i6() {
        return (View) this.LLJLIL.getValue();
    }

    public final View q6() {
        return (View) this.LLJJL.getValue();
    }

    public final TuxIconView r6() {
        return (TuxIconView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public ViewGroup u6() {
        return (ViewGroup) this.LLJJIJIIJIL.getValue();
    }

    public final TuxTextView v6() {
        return (TuxTextView) this.LLJJJ.getValue();
    }

    public final TuxIconView w6() {
        return (TuxIconView) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public Integer S5() {
        if (C0M1K.LIZ()) {
            return Integer.valueOf(DraftItemBaseBgViewHolder.W5() ? R.layout.cvr : R.layout.cvq);
        }
        return Integer.valueOf(R.layout.cvo);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public C561130Lzb R5() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public InterfaceC562000M2k T5() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public InterfaceC497601wk U5() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public View getItemView() {
        return this.LLJJ;
    }

    private final void C6(C0M0P c0m0p) {
        boolean z;
        int iLJIJI;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        boolean zBooleanValue;
        String strLJI;
        Boolean bool;
        if (!c0m0p.LIZIZ && c0m0p.LJIILIIL != EnumC545550LaT.NONE) {
            List<String> list = c0m0p.LJIILLIIL;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            Drawable drawable = null;
            if (z) {
                ViewGroup viewGroup = this.LLJJJJ;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
            } else {
                if (this.LLJJJJ == null) {
                    FrameLayout frameLayout = (FrameLayout) getItemView().findViewById(R.id.bkd);
                    if (frameLayout != null) {
                        C786410Ut5.Pb(frameLayout, 1.125f);
                        C786410Ut5.qc(frameLayout, 1.125f);
                        C786410Ut5.U4(frameLayout, 0.8f);
                    } else {
                        frameLayout = null;
                    }
                    this.LLJJJJ = frameLayout;
                }
                if (this.LLJJJJJIL == null) {
                    C427760Gpy c427760Gpy = (C427760Gpy) getItemView().findViewById(R.id.bkc);
                    if (c427760Gpy != null) {
                        c427760Gpy.setSize(EnumC428930Grr.LARGE);
                        c427760Gpy.setStacking(EnumC429060Gs4.FIRST_ON_TOP);
                    } else {
                        c427760Gpy = null;
                    }
                    this.LLJJJJJIL = c427760Gpy;
                }
                IAITheaterFeatureService.LIZ.getClass();
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null) {
                    iLJIJI = interfaceC558600LvWLIZIZ.LJIJI();
                } else {
                    iLJIJI = 3;
                }
                ViewGroup viewGroup2 = this.LLJJJJ;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(0, viewGroup2);
                }
                C427760Gpy c427760Gpy2 = this.LLJJJJJIL;
                if (c427760Gpy2 != null) {
                    c427760Gpy2.setTotalCount(list.size());
                }
                int i = 0;
                for (Object obj : C13LP.LL(list, iLJIJI)) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C427760Gpy c427760Gpy3 = this.LLJJJJJIL;
                        if (c427760Gpy3 != null) {
                            C427760Gpy.LIZ(c427760Gpy3, i, obj, "Avatar", null, null, false, null, 2040);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            ViewGroup viewGroup3 = this.LLJJJJLIIL;
            if (viewGroup3 != null) {
                C0F29.LIZIZ(viewGroup3);
            }
            InterfaceC497601wk interfaceC497601wkU5 = U5();
            if (interfaceC497601wkU5 != null) {
                C23250099c.LIZLLL(interfaceC497601wkU5, null, null, new C551520Lk6(this, c0m0p, null), 3);
            }
            Object tag = r6().getTag(R.id.g57);
            if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            EnumC545550LaT enumC545550LaT = c0m0p.LJIILIIL;
            if (enumC545550LaT == EnumC545550LaT.PROCESSING) {
                C786410Ut5.LJLLLLLL(8, q6());
                C786410Ut5.LJLLLLLL(0, i6());
                View viewI6 = i6();
                if (c0m0p.LJIILL == Source.TEXT_TO_IMAGE) {
                    drawable = i6().getContext().getDrawable(R.drawable.bip);
                }
                viewI6.setBackground(drawable);
                ((C426320Gne) this.LLJLILLLLZIIL.getValue()).LIZ(c0m0p.LJIILJJIL, false);
                ((TextView) this.LLJLL.getValue()).setText(C20642515q3.LJI(2131850029));
                return;
            }
            if (enumC545550LaT == EnumC545550LaT.COMPLETE) {
                C786410Ut5.LJLLLLLL(0, q6());
                C786410Ut5.LJLLLLLL(8, i6());
                if (!zBooleanValue) {
                    r6().setIconRes(R.raw.icon_tick_circle_fill);
                    r6().setTintColorRes(R.attr.a1v);
                    ((TextView) this.LLJL.getValue()).setText(C20642515q3.LJI(2131850028));
                }
                if (c0m0p.LJIILL != Source.TEXT_TO_IMAGE) {
                    return;
                }
                C562670M4z c562670M4z = C562670M4z.LIZ;
                String str = c0m0p.LJ;
                c562670M4z.getClass();
                Keva keva = C562670M4z.LIZJ;
                Keva keva2 = C562670M4z.LIZIZ;
                if (keva.getString(keva2.getString(str, ""), "").length() <= 0) {
                    return;
                }
                c0m0p.LJFF = keva.getString(keva2.getString(c0m0p.LJ, ""), "");
                C0VSJ c0vsj = new C0VSJ(c0m0p.LJFF);
                if (!c0vsj.exists()) {
                    return;
                }
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.fromFile(c0vsj));
                c1331670kl3LJI.LJJIIZI(null);
                c1331670kl3LJI.LJJI(P5());
                C786410Ut5.h3(c1331670kl3LJI);
                return;
            }
            if (enumC545550LaT != EnumC545550LaT.FAILED) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, q6());
            C786410Ut5.LJLLLLLL(8, i6());
            if (C0M1K.LIZ()) {
                r6().setTintColorRes(R.attr.a1x);
            } else {
                r6().setTintColorRes(R.attr.ee);
            }
            if (zBooleanValue) {
                return;
            }
            r6().setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            TextView textView = (TextView) this.LLJL.getValue();
            if (C0M1K.LIZ()) {
                strLJI = C20642515q3.LJI(2131832400);
            } else {
                strLJI = C20642515q3.LJI(2131850027);
            }
            textView.setText(strLJI);
            return;
        }
        C786410Ut5.LJLLLLLL(8, q6());
        C786410Ut5.LJLLLLLL(8, i6());
    }

    public void D6(C0M0P c0m0p) {
        if (this.LLJILLL == 0) {
            v6().setText(c0m0p.LJIIIIZZ);
        } else {
            v6().setText(C562150M2z.LIZ(c0m0p.LJI));
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final void a6(C0M0P c0m0p) {
        C6(c0m0p);
        InterfaceC497601wk interfaceC497601wkU5 = U5();
        if (interfaceC497601wkU5 != null) {
            C23250099c.LIZLLL(interfaceC497601wkU5, null, null, new C551550Lk9(this, c0m0p, null), 3);
        }
    }

    public final boolean c6(DraftMigrateState draftMigrateState) {
        Context context;
        Resources resources;
        String string;
        Context context2;
        Resources resources2;
        String string2;
        Context context3;
        Resources resources3;
        if (!((Boolean) this.LLLFZ.getValue()).booleanValue()) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftBoxTaskItemViewHolder, bindMigrateIcon, ");
        sbLIZ.append(draftMigrateState);
        C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        int i = C0M35.LIZ[draftMigrateState.ordinal()];
        String string3 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                TuxIconView tuxIconViewF6 = f6();
                if (tuxIconViewF6 != null) {
                    tuxIconViewF6.setIconRes(R.drawable.c60);
                }
                TuxIconView tuxIconViewF62 = f6();
                if (tuxIconViewF62 != null) {
                    tuxIconViewF62.setTintColorRes(R.attr.ee);
                }
                TuxIconView tuxIconViewF63 = f6();
                if (tuxIconViewF63 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconViewF63, 8);
                }
                TuxTextView tuxTextViewH6 = h6();
                if (tuxTextViewH6 != null) {
                    TuxTextView tuxTextViewH62 = h6();
                    if (tuxTextViewH62 != null && (context3 = tuxTextViewH62.getContext()) != null && (resources3 = context3.getResources()) != null) {
                        string2 = resources3.getString(2131836954);
                    } else {
                        string2 = null;
                    }
                    tuxTextViewH6.setText(string2);
                }
                View viewE6 = e6();
                if (viewE6 != null) {
                    C786410Ut5.LJLLLLLL(0, viewE6);
                }
                View viewE62 = e6();
                if (viewE62 != null) {
                    viewE62.setBackground(null);
                }
            } else {
                TuxIconView tuxIconViewF64 = f6();
                if (tuxIconViewF64 != null) {
                    tuxIconViewF64.setIconRes(R.drawable.c60);
                }
                TuxIconView tuxIconViewF65 = f6();
                if (tuxIconViewF65 != null) {
                    tuxIconViewF65.setTintColorRes(R.attr.ee);
                }
                TuxIconView tuxIconViewF66 = f6();
                if (tuxIconViewF66 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconViewF66, 0);
                }
                TuxTextView tuxTextViewH63 = h6();
                if (tuxTextViewH63 != null) {
                    TuxTextView tuxTextViewH64 = h6();
                    if (tuxTextViewH64 != null && (context2 = tuxTextViewH64.getContext()) != null && (resources2 = context2.getResources()) != null) {
                        string = resources2.getString(2131836953);
                    } else {
                        string = null;
                    }
                    tuxTextViewH63.setText(string);
                }
                View viewE63 = e6();
                if (viewE63 != null) {
                    C786410Ut5.LJLLLLLL(0, viewE63);
                }
                View viewE64 = e6();
                if (viewE64 != null) {
                    viewE64.setBackground(null);
                }
            }
        } else {
            TuxIconView tuxIconViewF67 = f6();
            if (tuxIconViewF67 != null) {
                tuxIconViewF67.setIconRes(R.drawable.c5z);
            }
            TuxIconView tuxIconViewF68 = f6();
            if (tuxIconViewF68 != null) {
                tuxIconViewF68.setTintColorRes(R.attr.a1v);
            }
            TuxIconView tuxIconViewF69 = f6();
            if (tuxIconViewF69 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewF69, 0);
            }
            TuxTextView tuxTextViewH65 = h6();
            if (tuxTextViewH65 != null) {
                TuxTextView tuxTextViewH66 = h6();
                if (tuxTextViewH66 != null && (context = tuxTextViewH66.getContext()) != null && (resources = context.getResources()) != null) {
                    string3 = resources.getString(2131836952);
                }
                tuxTextViewH65.setText(string3);
            }
            View viewE65 = e6();
            if (viewE65 != null) {
                C786410Ut5.LJLLLLLL(0, viewE65);
            }
            View viewE66 = e6();
            if (viewE66 != null) {
                viewE66.setBackgroundResource(R.drawable.bim);
            }
        }
        return true;
    }

    public final boolean d6(C0M0P c0m0p) {
        Object tag;
        boolean zBooleanValue;
        Typeface typefaceLIZIZ;
        View viewE6 = e6();
        Boolean bool = null;
        if (viewE6 != null) {
            tag = viewE6.getTag(R.id.g57);
        } else {
            tag = null;
        }
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue && !c0m0p.LJJI) {
            if (c0m0p.LJJIFFI) {
                C786410Ut5.LLLLLLZZ(w6(), 8);
                View view = (View) this.LLJJJIL.getValue();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                    C341550DaD.LIZ(view);
                    TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.g58);
                    if (tuxTextView != null && (typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 10.0f, 1.0f, null, 0.0f, 0, null, 241)) != null) {
                        tuxTextView.setTypeface(typefaceLIZIZ);
                        tuxTextView.setTextSize(10.0f);
                    }
                }
                return true;
            }
            View view2 = (View) this.LLJJJIL.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            Integer num = c0m0p.LJIJ;
            if (((Boolean) this.LLLFZ.getValue()).booleanValue() || num == null) {
                return false;
            }
            if (num.intValue() == 0) {
                C786410Ut5.LLLLLLZZ(w6(), 8);
            } else {
                w6().setIconRes(num.intValue());
                C786410Ut5.LLLLLLZZ(w6(), 0);
                if (DraftItemBaseBgViewHolder.W5()) {
                    HandlerHook.viewPost(u6(), new ARunnableS108S0100000_8(this, 101));
                    return true;
                }
            }
            return true;
        }
        View view3 = (View) this.LLJJJIL.getValue();
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final void X5(C0M0P c0m0p, int i) {
        if (this.LLJILJIL) {
            View viewE6 = e6();
            if (viewE6 != null) {
                C786410Ut5.LJLLLLLL(8, viewE6);
            }
            C786410Ut5.LJLZ(8, u6());
            C786410Ut5.LJLLLLLL(8, q6());
            C786410Ut5.LJLLLLLL(8, i6());
            View view = (View) this.LLJJJIL.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C786410Ut5.LJLLLLLL(0, (View) this.LLJLLIL.getValue());
            ((TextView) this.LLJLLL.getValue()).setText(C562150M2z.LIZ(c0m0p.LJI));
        } else {
            C786410Ut5.LJLZ(0, u6());
            C786410Ut5.LJLLLLLL(8, (View) this.LLJLLIL.getValue());
            D6(c0m0p);
            C6(c0m0p);
            C0M31.LIZ(getItemView(), new AwS134S0201000_8(this, i, c0m0p, 8));
            getItemView().setOnLongClickListener(new ViewOnLongClickListenerC580880MqM(this, c0m0p, 0));
            if (!d6(c0m0p)) {
                u6().setTag(R.id.g56, c0m0p.LJ);
                InterfaceC497601wk interfaceC497601wkU5 = U5();
                if (interfaceC497601wkU5 != null) {
                    C23250099c.LIZLLL(interfaceC497601wkU5, null, null, new C551580LkC(this, c0m0p, null), 3);
                }
            }
        }
        DraftItemBaseBgViewHolder.b6(c0m0p);
    }

    public final void z6(View view, C0M0P c0m0p) {
        MigrateTaskStatus migrateTaskStatusCurrentMigrateFlowStatus;
        if (((Boolean) this.LLLI.getValue()).booleanValue() || ((Boolean) this.LLLFZ.getValue()).booleanValue()) {
            AVDraftMigrateService aVDraftMigrateService = (AVDraftMigrateService) this.LLLFFI.getValue();
            if (aVDraftMigrateService != null) {
                migrateTaskStatusCurrentMigrateFlowStatus = aVDraftMigrateService.currentMigrateFlowStatus();
            } else {
                migrateTaskStatusCurrentMigrateFlowStatus = null;
            }
            if (Intrinsics.LJFF(migrateTaskStatusCurrentMigrateFlowStatus, MigrateTaskStatus.Started.INSTANCE) || (migrateTaskStatusCurrentMigrateFlowStatus instanceof MigrateTaskStatus.Progress)) {
                return;
            }
        }
        C1443030nef c1443030nefLJII = C1443030nef.LJII();
        Context context = view.getContext();
        c1443030nefLJII.getClass();
        if (!C1443030nef.LJI(context)) {
            return;
        }
        if (!c0m0p.LIZIZ) {
            InterfaceC562000M2k interfaceC562000M2kT5 = T5();
            if (interfaceC562000M2kT5 != null) {
                interfaceC562000M2kT5.v1();
            }
            InterfaceC562000M2k interfaceC562000M2kT52 = T5();
            if (interfaceC562000M2kT52 != null) {
                interfaceC562000M2kT52.l(c0m0p);
            }
        }
        if (!N5().isEnabled()) {
            return;
        }
        N5().setChecked(!c0m0p.LJIIJJI);
        InterfaceC562000M2k interfaceC562000M2kT53 = T5();
        if (interfaceC562000M2kT53 == null) {
            return;
        }
        N5();
        interfaceC562000M2kT53.v3(c0m0p, N5().isChecked(), true);
    }

    public DraftBoxTaskItemViewHolder(View view, C561130Lzb c561130Lzb, C054G c054g, DraftBoxFragment draftBoxFragment) {
        super(view, c561130Lzb, c054g, draftBoxFragment);
        this.LLJJ = view;
        this.LLJJI = c561130Lzb;
        this.LLJJIII = c054g;
        this.LLJJIJI = draftBoxFragment;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 878));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 884));
        this.LLJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 881));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 838));
        this.LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 866));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 869));
        this.LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 875));
        this.LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 864));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 872));
        this.LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 874));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 840));
        this.LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 843));
        this.LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 849));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 852));
        this.LLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 859));
        this.LLLF = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(359));
        this.LLLFF = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(358));
        this.LLLFFI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(351));
        this.LLLFZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(353));
        this.LLLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(354));
    }
}
