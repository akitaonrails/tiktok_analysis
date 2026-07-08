package com.bytedance.android.livesdk.game.broadcast.mirror;

import X.C098200Yq;
import X.C0IJT;
import X.C0JDJ;
import X.C0TFE;
import X.C0UQO;
import X.C1119920fFW;
import X.C1124870fNV;
import X.C1161920gLG;
import X.C128Y;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AKO;
import X.C2188811AlT;
import X.C465220IMe;
import X.C474500IjA;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C520010KaN;
import X.C743540TEq;
import X.C782110Um9;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWiredWidget;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWirelessWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCastChooseFragment extends BaseFragment implements C1AKO, C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiHELIOSotLSwyOzFiJCYhOio+ZwgyJSAPKDwnCy0jJjw2DjctLiI2JjE=";
    public RecyclableWidgetManager LL;
    public GameCastWiredWidget LLILLJJLI;
    public GameCastWirelessWidget LLILLL;
    public View LLILZ;

    @Override // X.C1AKO
    public final void finish() {
    }

    @Override // X.C1AKO
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // X.C1AKO
    public final boolean onBackPressed() {
        FragmentManager fragmentManagerLJJI;
        List<Fragment> listLJJLIIIJL;
        List<C128Y> listLJLJJLL;
        C1AKO c1ako;
        if (C504210Jpz.LIZ && (fragmentManagerLJJI = C520010KaN.LJJI(this, false)) != null && (listLJJLIIIJL = fragmentManagerLJJI.LJJLIIIJL()) != null && (listLJLJJLL = C13LP.LJLJJLL(listLJJLIIIJL)) != null) {
            for (C128Y c128y : listLJLJJLL) {
                if (!Intrinsics.LJFF(c128y, this)) {
                    Boolean boolValueOf = null;
                    if ((c128y instanceof C1AKO) && (c1ako = (C1AKO) c128y) != null) {
                        boolValueOf = Boolean.valueOf(c1ako.onBackPressed());
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        return true;
                    }
                }
                if (Intrinsics.LJFF(c128y, this)) {
                    break;
                }
                if (!(c128y instanceof C1AKO)) {
                    FragmentManager fragmentManagerLJJI2 = C520010KaN.LJJI(this, false);
                    if (fragmentManagerLJJI2 != null) {
                        fragmentManagerLJJI2.LJLLILLLL();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        RecyclableWidgetManager recyclableWidgetManager = this.LL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.unload(this.LLILLJJLI);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.LL;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.unload(this.LLILLL);
        }
        super.onDestroy();
        if (C0UQO.LIZ()) {
            GameCast gameCast = GameCast.LIZ;
            GameCast.LJIIIZ();
        }
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).d8();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.cov);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 186), viewFindViewById);
        }
        this.LL = RecyclableWidgetManager.of(this, view, LiveWidgetProviderProxy.Companion.getInstance(), C486790J7d.LIZ);
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new GameCastWiredWidget(getId(), getArguments());
        }
        RecyclableWidgetManager recyclableWidgetManager = this.LL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.load(R.id.dh_, this.LLILLJJLI);
        }
        if (this.LLILLL == null) {
            this.LLILLL = new GameCastWirelessWidget(getId(), getArguments());
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.LL;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.load(R.id.dha, this.LLILLL);
        }
        TextView textView = (TextView) view.findViewById(R.id.zc_);
        String str = getString(2131841790) + "\n" + getString(2131841787) + "\n";
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_gamelive_cast_edu_download2");
        if (strLIZIZ == null) {
            strLIZIZ = textView.getResources().getString(2131841788);
        }
        int length = str.length() + a0.LJJJ(strLIZIZ, "WWW", 0, true, 2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(strLIZIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0394
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context = view2.getContext();
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ("https://www.tiktok.com/studio/download");
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, length, spannableStringBuilder.length(), 33);
        C1119920fFW.LJ(textView.getContext(), spannableStringBuilder, length, spannableStringBuilder.length(), 33, 8, 500);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF(R.color.a6q)), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        ((TextView) view.findViewById(R.id.zca)).setText(getString(2131841791) + "\n" + getString(2131841789));
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("screen_cast_type_from");
        } else {
            string = null;
        }
        C0TFE c0tfe = C0TFE.LIZ;
        Context context = getContext();
        c0tfe.getClass();
        if (context != null && Build.VERSION.SDK_INT <= 28) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131841740);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131841738));
            c782110Um9.LJIIL(2131841739);
            c782110Um9.LJIILL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
        }
        if (string != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_type_show");
            c474500IjALIZ.LJJII(Long.valueOf(C743540TEq.LIZIZ()), "anchor_id");
            c474500IjALIZ.LJJII(string, "enter_from");
            c474500IjALIZ.LJJII("live_studio", "live_type");
            c474500IjALIZ.LIZ();
        }
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).tM2();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).uO2();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hyr, viewGroup, false);
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
}
