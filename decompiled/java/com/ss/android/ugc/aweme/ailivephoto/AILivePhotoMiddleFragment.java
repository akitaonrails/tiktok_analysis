package com.ss.android.ugc.aweme.ailivephoto;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C0C64;
import X.C0EJS;
import X.C0HTI;
import X.C0ID9;
import X.C0MEB;
import X.C0MED;
import X.C0OM1;
import X.C1192870h9B;
import X.C11JF;
import X.C1202340hOS;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C557160LtC;
import X.C557170LtD;
import X.C557190LtF;
import X.C559010LwB;
import X.C560970LzL;
import X.C570560MZi;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC21503819Do;
import X.InterfaceC497601wk;
import X.InterfaceC557220LtI;
import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoMiddleFragment extends AmeBaseLegacyFragment implements InterfaceC21503819Do, InterfaceC557220LtI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlJSYlLTHELIOSUkJjs8ZgQFBSYlLRUkJjs8BSwoLSM2DjctLiI2JjE=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 40));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 44));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 50));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 48));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 45));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 36));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 37));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 47));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 39));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 35));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 38));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 49));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 43));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 41));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 42));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(378));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 46));

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final void NR() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String strLIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "live_photo_go_to_posted", true, false) ? ((Boolean) this.LLJJ.getValue()).booleanValue() ? C0MED.LIZ(C0MEB.EDITING_PAGE_LIVE_PHOTO_TOAST_DRAFT_PROCESSED, new Object[0]) : C0MED.LIZ(C0MEB.EDITING_PAGE_LIVE_PHOTO_TOAST_DRAFT_DELETE, new Object[0]) : C0MED.LIZ(C0MEB.ERROR_DRAFT_UNAVAIL_BODY, new Object[0]);
        ((TextView) this.LLILLL.getValue()).setText(C0MED.LIZ(C0MEB.ERROR_DRAFT_UNAVAIL_TITLE, new Object[0]));
        ((TextView) this.LLILZ.getValue()).setText(strLIZ);
        C786410Ut5.LJZ(8, (FrameLayout) this.LLILZIL.getValue());
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.nk;
        ((ImageView) this.LL.getValue()).setImageDrawable(c0hti.LIZ(context));
        C786410Ut5.LJZI(0, (ImageView) this.LL.getValue());
        C786410Ut5.LLLLZLL((TuxTextView) this.LLIZLLLIL.getValue(), 8);
    }

    public final View RR() {
        View view = getView();
        if (view != null) {
            return view;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C557190LtF c557190LtF = (C557190LtF) this.LLJJIII.getValue();
        AnonymousClass0956 anonymousClass0956 = c557190LtF.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C11JF c11jf = c557190LtF.LJIIIZ;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = c557190LtF.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJI(C557190LtF.class.getName(), AFwS189S0000000_3.get$arr$(377), false);
        }
        C2296808zG.LIZJ((InterfaceC497601wk) this.LLJJI.getValue(), null);
    }

    public final String MR(String str) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(str)) == null) {
            return "";
        }
        return string;
    }

    public final void OR(boolean z) {
        if (getContext() == null) {
            return;
        }
        if (!C560970LzL.LIZ(getContext())) {
            PR(-1);
            return;
        }
        ((TextView) this.LLILLL.getValue()).setText(C0MED.LIZ(C0MEB.DOWNLOADING_TITLE, new Object[0]));
        ((TextView) this.LLILZ.getValue()).setText(C0MED.LIZ(C0MEB.DOWNLOADING_BODY, new Object[0]));
        C786410Ut5.LJZI(8, (ImageView) this.LL.getValue());
        C786410Ut5.LJZ(0, (FrameLayout) this.LLILZIL.getValue());
        C786410Ut5.LLLLZLL((TuxTextView) this.LLIZLLLIL.getValue(), 8);
        if (!z) {
            C559010LwB.LIZIZ("AILivePhotoMiddleFragment", "start restore task");
            C557190LtF c557190LtF = (C557190LtF) this.LLJJIII.getValue();
            if (c557190LtF.LIZ() != null) {
                AnonymousClass0956 anonymousClass0956 = c557190LtF.LJIIIIZZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c557190LtF.LJIIIIZZ = C23250099c.LIZLLL(c557190LtF.LIZJ, null, null, new C557170LtD(c557190LtF, null), 3);
                return;
            }
            return;
        }
        C559010LwB.LIZIZ("AILivePhotoMiddleFragment", "retry restore task");
        C557190LtF c557190LtF2 = (C557190LtF) this.LLJJIII.getValue();
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = c557190LtF2.LIZ();
        if (iCreationAsyncTaskManagerLIZ == null) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = c557190LtF2.LJIIIIZZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        c557190LtF2.LJIIIIZZ = C23250099c.LIZLLL(c557190LtF2.LIZJ, null, null, new C557160LtC(iCreationAsyncTaskManagerLIZ, c557190LtF2, null), 3);
    }

    @Override // X.InterfaceC557220LtI
    public final void PE(int i) {
        PR(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(int r11) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleFragment.PR(int):void");
    }

    public final void j3(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restore progress -> ");
        sbLIZ.append(i);
        C559010LwB.LIZIZ("AILivePhotoMiddleFragment", C2188811AlT.LIZIZ(sbLIZ));
        ((C0EJS) this.LLILZLL.getValue()).setProgress(i);
        TextView textView = (TextView) this.LLIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append('%');
        textView.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            C1192870h9B.LIZ.getClass();
            C1202340hOS.LIZIZ(activity, C1192870h9B.LIZJ);
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        Context context = getContext();
        boolean z2 = true;
        if (context != null && C960203pA.LIZIZ(context)) {
            z = true;
        } else {
            z = false;
        }
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(!z);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        Context context2 = getContext();
        if (context2 == null || !C960203pA.LIZIZ(context2)) {
            z2 = false;
        }
        tuxImmersionBarLIZLLL.LIZIZ.LJII(z2);
        tuxImmersionBarLIZLLL.LIZ(false);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // X.InterfaceC557220LtI
    public final void onFinish(AwemeDraft awemeDraft) {
        if (awemeDraft != null) {
            final C19EG activity = getActivity();
            if (activity != null) {
                AILivePhotoModel aILivePhotoModel = awemeDraft.LIZ.aiLivePhotoModel;
                aILivePhotoModel.isFailureRecall = false;
                aILivePhotoModel.LJIILJJIL((String) this.LLJ.getValue());
                awemeDraft.LJIJI = 13;
                C570560MZi.LJ(activity, awemeDraft, 13, System.currentTimeMillis(), null, new OnStartEditDraftListener() { // from class: X.0M0w
                    @Override // com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener
                    public final void onEnd() {
                        activity.finish();
                    }

                    @Override // com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener
                    public final void onStart(Intent intent) {
                        this.LIZ.j3(100);
                    }
                }, "page");
            }
            C559010LwB.LIZIZ("AILivePhotoMiddleFragment", "ready for restore draft when restore task finish");
            return;
        }
        C559010LwB.LIZ("AILivePhotoMiddleFragment", "draft lost when restore task finish");
        NR();
    }

    @Override // X.InterfaceC557220LtI
    public final void onProgress(int i) {
        j3(i);
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getView() != null) {
            TuxNavBar tuxNavBar = (TuxNavBar) this.LLILLJJLI.getValue();
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZJ(new AwS552S0100000_8(this, 5));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
            TuxTextView tuxTextView = (TuxTextView) this.LLIZLLLIL.getValue();
            tuxTextView.setOutlineProvider(new C0ID9(0));
            tuxTextView.setClipToOutline(true);
            C786410Ut5.h9(tuxTextView, new ACListenerS143S0100000_8(this, 0));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, tuxTextView.getContext());
            if (numLIZJ != null) {
                tuxTextView.setBackgroundColor(numLIZJ.intValue());
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
            if (numLIZJ2 != null) {
                tuxTextView.setTextColor(numLIZJ2.intValue());
            }
        }
        if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            NR();
            C559010LwB.LIZIZ("AILivePhotoMiddleFragment", "draft lost in start");
        } else {
            OR(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.s9, viewGroup, false);
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
