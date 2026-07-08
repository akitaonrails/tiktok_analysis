package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.C098200Yq;
import X.C0OM1;
import X.C0SHX;
import X.C0TA1;
import X.C1022820ciu;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C189200o6;
import X.C19284810cY;
import X.C19323710ip;
import X.C19EG;
import X.C19GS;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.InterfaceC19324410iw;
import X.InterfaceC344240DeY;
import Y.AObserverS230S0100000_28;
import Y.ARunnableS126S0100000_26;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserVM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.commercialize.model.OrientationInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.AdvertiserModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS78S1000000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class DynamicAdExplainDialog extends Fragment implements InterfaceC344240DeY, View.OnClickListener, InterfaceC19324410iw {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyHELIOSp9KyohOSM6KSsvLGEyPCRiDTY9KSglKg43DT08JS46JgElKCM8Lw==";
    public final AwemeRawAd LL;
    public final AboutAdInfo LLILLJJLI;
    public final String LLILLL;
    public final C19EG LLILZ;
    public final int LLILZIL;
    public final InfoModel LLILZLL;
    public RecyclerView LLJI;
    public C19323710ip LLJIJIL;
    public TuxSheet LLJILJIL;
    public RelativeLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxIconView LLJJ;
    public RelativeLayout LLJJI;
    public AdvertiserVM LLJJIII;
    public RelativeLayout LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public long LLJJJJ;
    public Integer LLIZ = -1;
    public Integer LLIZLLLIL = -1;
    public final List<OrientationInfo> LLJ = new ArrayList();
    public int LLJJIJIL = -1;

    public final void MR() {
        if (Intrinsics.LJFF(this.LLIZ, this.LLIZLLLIL)) {
            return;
        }
        AdvertiserModel advertiserModel = new AdvertiserModel(this.LL.getAdvId(), null, null, this.LLIZ, Boolean.FALSE);
        AdvertiserVM advertiserVM = this.LLJJIII;
        if (advertiserVM == null) {
            advertiserVM = null;
        }
        advertiserVM.vQ2(advertiserModel, "1");
        AdvertiserVM advertiserVM2 = this.LLJJIII;
        (advertiserVM2 != null ? advertiserVM2 : null).LLILLL.observe(this, new AObserverS230S0100000_28(this, 10));
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string = this.LLILZ.getString(2131823010);
        C0OM1 c0om1 = new C0OM1();
        try {
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 29));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    public final void show() {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = this;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(this, 2);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLL = true;
        this.LLJILJIL = tuxSheet2;
        tuxSheet2.show(this.LLILZ.getSupportFragmentManager(), "DynamicAdExplain");
        C0SHX.LIZ(this.LLILZ, null).LJIIJJI("ad_explain_static_dynamic", true, new C0TA1() { // from class: X.10iv
            @Override // X.C0TA1
            public final void LIZ() {
                TuxSheet tuxSheet3 = this.LIZ.LLJILJIL;
                if (tuxSheet3 == null) {
                    tuxSheet3 = null;
                }
                tuxSheet3.dismiss();
            }
        });
        this.LLJJJJ = System.currentTimeMillis();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        View view2 = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == R.id.fip) {
                TuxIconView tuxIconView = this.LLJILLL;
                if (tuxIconView == null) {
                    tuxIconView = null;
                }
                tuxIconView.setTintColorRes(R.attr.a04);
                TuxIconView tuxIconView2 = this.LLJILLL;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                tuxIconView2.setIconRes(R.raw.icon_thumbs_up_fill);
                TuxIconView tuxIconView3 = this.LLJILLL;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                tuxIconView3.setClickable(false);
                TuxIconView tuxIconView4 = this.LLJJ;
                if (tuxIconView4 == null) {
                    tuxIconView4 = null;
                }
                tuxIconView4.setClickable(false);
                RelativeLayout relativeLayout = this.LLJILJILJ;
                if (relativeLayout != null) {
                    view2 = relativeLayout;
                }
                HandlerHook.viewPostDelay(view2, new ARunnableS126S0100000_26(this, 10), 1000L);
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("about_this_ad", "otherclick", this.LL);
                c1022820ciuLIZLLL.LIZJ("button", "refer");
                c1022820ciuLIZLLL.LIZIZ("yes", "feedback_value");
                c1022820ciuLIZLLL.LJII();
                return;
            }
            if (numValueOf.intValue() != R.id.fin) {
                return;
            }
            TuxIconView tuxIconView5 = this.LLJJ;
            if (tuxIconView5 == null) {
                tuxIconView5 = null;
            }
            tuxIconView5.setTintColorRes(R.attr.a1j);
            TuxIconView tuxIconView6 = this.LLJJ;
            if (tuxIconView6 == null) {
                tuxIconView6 = null;
            }
            tuxIconView6.setIconRes(R.raw.icon_thumbs_up_fill);
            TuxIconView tuxIconView7 = this.LLJJ;
            if (tuxIconView7 == null) {
                tuxIconView7 = null;
            }
            C786410Ut5.Fb(tuxIconView7, 180.0f);
            TuxIconView tuxIconView8 = this.LLJILLL;
            if (tuxIconView8 == null) {
                tuxIconView8 = null;
            }
            tuxIconView8.setClickable(false);
            TuxIconView tuxIconView9 = this.LLJJ;
            if (tuxIconView9 == null) {
                tuxIconView9 = null;
            }
            tuxIconView9.setClickable(false);
            TuxIconView tuxIconView10 = this.LLJJ;
            if (tuxIconView10 == null) {
                tuxIconView10 = null;
            }
            HandlerHook.viewPostDelay(tuxIconView10, new ARunnableS126S0100000_26(this, 11), 500L);
            TuxIconView tuxIconView11 = this.LLJJ;
            if (tuxIconView11 != null) {
                view2 = tuxIconView11;
            }
            HandlerHook.viewPostDelay(view2, new ARunnableS126S0100000_26(this, 12), 1000L);
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("about_this_ad", "otherclick", this.LL);
            c1022820ciuLIZLLL2.LIZJ("button", "refer");
            c1022820ciuLIZLLL2.LIZIZ("no", "feedback_value");
            c1022820ciuLIZLLL2.LJII();
        }
    }

    @Override // X.InterfaceC19324410iw
    public final void of(int i, OrientationInfo orientationInfo) {
        String string;
        String string2;
        OrientationInfo orientationInfo2;
        OrientationInfo orientationInfo3;
        OrientationInfo orientationInfo4;
        OrientationInfo orientationInfo5;
        Integer num = orientationInfo.infoType;
        if (num != null) {
            if (num.intValue() == 8) {
                SmartRouter.buildRoute(this.LLILZ, "//display/caption/setting_compose").open();
                TuxSheet tuxSheet = this.LLJILJIL;
                TuxSheet tuxSheet2 = null;
                if (tuxSheet == null) {
                    tuxSheet = null;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_not_other_exit", true);
                tuxSheet.setArguments(bundle);
                TuxSheet tuxSheet3 = this.LLJILJIL;
                if (tuxSheet3 != null) {
                    tuxSheet2 = tuxSheet3;
                }
                tuxSheet2.dismiss();
                return;
            }
            if (num == null) {
                return;
            }
            if (num.intValue() != 11 && num.intValue() != 10) {
                if (num.intValue() != 10003) {
                    return;
                }
                Integer num2 = this.LLIZLLLIL;
                if (num2 != null && num2.intValue() == 2) {
                    this.LLIZLLLIL = 1;
                    List<OrientationInfo> list = this.LLJ;
                    if (list != null && (orientationInfo5 = (OrientationInfo) ListProtector.get(list, i)) != null) {
                        orientationInfo5.setSwitch(1);
                    }
                    List<OrientationInfo> list2 = this.LLJ;
                    if (list2 != null && (orientationInfo4 = (OrientationInfo) ListProtector.get(list2, i)) != null) {
                        orientationInfo4.setButtonText(this.LLJJJ);
                    }
                } else {
                    Integer num3 = this.LLIZLLLIL;
                    if (num3 != null && num3.intValue() == 1) {
                        this.LLIZLLLIL = 2;
                        List<OrientationInfo> list3 = this.LLJ;
                        if (list3 != null && (orientationInfo3 = (OrientationInfo) ListProtector.get(list3, i)) != null) {
                            orientationInfo3.setSwitch(2);
                        }
                        List<OrientationInfo> list4 = this.LLJ;
                        if (list4 != null && (orientationInfo2 = (OrientationInfo) ListProtector.get(list4, i)) != null) {
                            orientationInfo2.setButtonText(this.LLJJJIL);
                        }
                    }
                }
                C19323710ip c19323710ip = this.LLJIJIL;
                if (c19323710ip != null) {
                    c19323710ip.notifyItemChanged(i, 0);
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("about_this_ad", "otherclick", this.LL);
                c1022820ciuLIZLLL.LIZJ("about_the_advertiser", "refer");
                c1022820ciuLIZLLL.LJII();
                return;
            }
            String string3 = this.LLILZ.getResources().getString(2131823009);
            Integer num4 = orientationInfo.infoType;
            if (num4 != null && num4.intValue() == 11) {
                string = this.LLILZ.getResources().getString(2131823007);
            } else {
                string = this.LLILZ.getResources().getString(2131822994);
            }
            String strLJJIFFI = u.LJJIFFI(this.LLILZ.getResources().getString(2131823005), "\\n", "", false);
            Integer num5 = orientationInfo.infoType;
            if (num5 != null && num5.intValue() == 11) {
                string2 = this.LLILZ.getResources().getString(2131823006);
            } else {
                string2 = this.LLILZ.getResources().getString(2131822993);
            }
            String string4 = this.LLILZ.getResources().getString(2131823008);
            String strLJJIFFI2 = u.LJJIFFI(string, "%s", String.valueOf(orientationInfo.linkText), false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJIFFI2);
            sbLIZ.append('\n');
            sbLIZ.append(strLJJIFFI);
            sbLIZ.append('\n');
            sbLIZ.append(string2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C19284810cY.LIZ.getClass();
            SpannableStringBuilder spannableStringBuilderLIZIZ = C19284810cY.LIZIZ(strLIZIZ, strLJJIFFI, null, null, null, null);
            C1397580mTM c1397580mTM = new C1397580mTM(this.LLILZ);
            c1397580mTM.LJI(string3);
            c1397580mTM.LIZIZ(spannableStringBuilderLIZIZ);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS78S1000000_28(string4, 7));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r41, android.os.Bundle r42) {
        /*
            Method dump skipped, instruction units count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bmj, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public DynamicAdExplainDialog(C19EG c19eg, AwemeRawAd awemeRawAd, String str, int i, InfoModel infoModel) {
        this.LL = awemeRawAd;
        this.LLILLJJLI = awemeRawAd.getAboutThisAd();
        this.LLILLL = str;
        this.LLILZ = c19eg;
        this.LLILZIL = i;
        this.LLILZLL = infoModel;
        this.LLJJJ = c19eg.getString(2131821332);
        this.LLJJJIL = c19eg.getString(2131823011);
    }
}
