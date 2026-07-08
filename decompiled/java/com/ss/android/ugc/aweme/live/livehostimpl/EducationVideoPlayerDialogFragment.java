package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C098200Yq;
import X.C0N0R;
import X.C0N0S;
import X.C1483410ohn;
import X.C1507750pL3;
import X.C1685300txQ;
import X.C1752030vh3;
import X.C1765720w38;
import X.C1765730w39;
import X.C189200o6;
import X.C197039127h;
import X.C19736512Jv;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C389001fE;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC1508940pMy;
import X.InterfaceC1835090xr1;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS123S0100000_23;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.EducationVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class EducationVideoPlayerDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElHELIOSJD8/ZgAoPCwyPCwjJxk6LCAjGSMyMSA+DSYyJCorDz0yLygpJzs=";
    public ImageView LL;
    public C197039127h LLILLJJLI;
    public C0N0S LLILLL;
    public C1765720w38 LLILZ;
    public C1765730w39 LLILZIL;
    public ConstraintLayout LLILZLL;
    public C19736512Jv LLIZ;
    public int LLJ;
    public int LLJI;
    public C19736512Jv LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public InterfaceC1835090xr1 LLJILLL;
    public String LLIZLLLIL = "";
    public final EducationVideoPlayerDialogFragment$observer$1 LLJJ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.livehostimpl.EducationVideoPlayerDialogFragment$observer$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
                return;
            }
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
            } else if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            C1765720w38 c1765720w38 = this.LL.LLILZ;
            if (c1765720w38 != null) {
                c1765720w38.LIZ(true);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            C1765720w38 c1765720w38 = this.LL.LLILZ;
            if (c1765720w38 != null) {
                HandlerHook.viewPost(c1765720w38, new ARunnableS123S0100000_23(c1765720w38, 29));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            C1765720w38 c1765720w38 = this.LL.LLILZ;
            if (c1765720w38 != null) {
                c1765720w38.LJFF();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(false);
            C1765720w38 c1765720w38 = this.LL.LLILZ;
            if (c1765720w38 != null) {
                c1765720w38.LIZJ();
            }
        }
    };

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLILLL = null;
        C1765720w38 c1765720w38 = this.LLILZ;
        if (c1765720w38 != null) {
            c1765720w38.LIZ(true);
        }
        this.LLILZ = null;
        super.onDestroy();
        getLifecycle().removeObserver(this.LLJJ);
    }

    public final void MR() {
        JSONObject jSONObject = new JSONObject();
        C0N0S c0n0s = this.LLILLL;
        Long lValueOf = null;
        Boolean boolValueOf = c0n0s != null ? Boolean.valueOf(c0n0s.LJIJI) : null;
        boolean z = C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_PAUSE;
        C0N0S c0n0s2 = this.LLILLL;
        if (c0n0s2 != null) {
            C1483410ohn c1483410ohn = c0n0s2.LJII;
            lValueOf = Long.valueOf(c1483410ohn != null ? c1483410ohn.getCurrentPosition() : 0L);
        }
        jSONObject.put("is_mute", boolValueOf);
        jSONObject.put("is_pause", z);
        jSONObject.put("position", lValueOf != null ? lValueOf.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) : 0L);
        jSONObject.put("current_position", lValueOf != null ? lValueOf.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) : 0L);
        C389001fE.LIZ("video_full_screen_close", jSONObject, System.currentTimeMillis(), false);
    }

    public final ImageView NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j2o) : null;
            this.LL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final C197039127h OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vfw) : null;
            this.LLILLJJLI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() throws JSONException {
        C1483410ohn c1483410ohn;
        super.dismiss();
        JSONObject jSONObject = new JSONObject();
        C0N0S c0n0s = this.LLILLL;
        Boolean boolValueOf = c0n0s != null ? Boolean.valueOf(c0n0s.LJIJI) : null;
        boolean z = C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_PAUSE;
        C0N0S c0n0s2 = this.LLILLL;
        if (c0n0s2 != null && (c1483410ohn = c0n0s2.LJII) != null) {
            c1483410ohn.getCurrentPosition();
        }
        C0N0S c0n0s3 = this.LLILLL;
        float f = c0n0s3 != null ? c0n0s3.LJIIIZ / 100.0f : 1.0f;
        jSONObject.put("is_mute", boolValueOf);
        jSONObject.put("is_pause", z);
        jSONObject.put("position", this.LLJ);
        jSONObject.put("current_position", (int) Math.rint(this.LLJ * f));
        C389001fE.LIZ("anchor_subscribe_play_intro_video_change", jSONObject, System.currentTimeMillis(), false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, android.R.style.Theme.Holo.Light);
        getLifecycle().addObserver(this.LLJJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Window window;
        C1765730w39 c1765730w39;
        ConstraintLayout constraintLayout;
        C19736512Jv c19736512Jv;
        ImageView imageView;
        C19736512Jv c19736512Jv2;
        super.onViewCreated(view, bundle);
        this.LLILZ = (C1765720w38) view.findViewById(R.id.gv7);
        if (getArguments() == null) {
            dismiss();
        } else {
            C1765720w38 c1765720w38 = this.LLILZ;
            if (c1765720w38 != null) {
                this.LLILLL = new C0N0S(c1765720w38);
            }
            final Video video = new Video();
            this.LLJ = getArguments().getInt("videoLength");
            Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("videoUrl")) == null) {
                string = "";
            }
            this.LLIZLLLIL = string;
            if (this.LLJ != 0 && !a0.LJJJIL(string)) {
                LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("subscription_education_video_");
                sbLIZ.append(this.LLIZLLLIL);
                localVideoUrlModel.setSourceId(C2188811AlT.LIZIZ(sbLIZ));
                localVideoUrlModel.setUrlList(new ArrayList());
                localVideoUrlModel.getUrlList().add(this.LLIZLLLIL);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("subscription_education_video_");
                sbLIZ2.append(this.LLIZLLLIL);
                localVideoUrlModel.setUrlKey(C2188811AlT.LIZIZ(sbLIZ2));
                video.setPlayAddr(localVideoUrlModel);
                this.LLJI = getArguments().getInt("position");
                this.LLJILJIL = getArguments().getBoolean("isMute");
                this.LLJILJILJ = getArguments().getBoolean("isPause");
                getArguments().getBoolean("isAutoPlay");
                video.setVideoLength(this.LLJ);
                video.setPlayAddrBytevc1(video.getPlayAddr());
                C0N0S c0n0s = this.LLILLL;
                if (c0n0s != null) {
                    c0n0s.LJFF = video;
                }
                new C1752030vh3();
                C1752030vh3 c1752030vh3 = new C1752030vh3();
                c1752030vh3.LIZ = this.LLILLL;
                c1752030vh3.LIZJ = getActivity().getWindow();
                c1752030vh3.LJ = Integer.valueOf(this.LLJ);
                Dialog dialog = getDialog();
                C19736512Jv c19736512Jv3 = null;
                if (dialog != null) {
                    window = dialog.getWindow();
                } else {
                    window = null;
                }
                c1752030vh3.LIZJ = window;
                C1765720w38 c1765720w382 = this.LLILZ;
                if (c1765720w382 != null) {
                    c1765720w382.setParams(c1752030vh3);
                }
                C1765720w38 c1765720w383 = this.LLILZ;
                if (c1765720w383 != null) {
                    c1765730w39 = (C1765730w39) c1765720w383.findViewById(R.id.qtg);
                } else {
                    c1765730w39 = null;
                }
                this.LLILZIL = c1765730w39;
                if (c1765730w39 != null) {
                    constraintLayout = (ConstraintLayout) c1765730w39.findViewById(R.id.a15);
                } else {
                    constraintLayout = null;
                }
                this.LLILZLL = constraintLayout;
                if (constraintLayout != null) {
                    c19736512Jv = (C19736512Jv) constraintLayout.findViewById(R.id.vki);
                } else {
                    c19736512Jv = null;
                }
                this.LLJIJIL = c19736512Jv;
                ConstraintLayout constraintLayout2 = this.LLILZLL;
                if (constraintLayout2 != null) {
                    imageView = (ImageView) constraintLayout2.findViewById(R.id.inu);
                } else {
                    imageView = null;
                }
                if (imageView != null) {
                    C786410Ut5.LJZI(8, imageView);
                }
                C1765720w38 c1765720w384 = this.LLILZ;
                if (c1765720w384 != null) {
                    C786410Ut5.LLLLLLLLL(c1765720w384.LLJIJIL, 0);
                }
                C1765730w39 c1765730w392 = this.LLILZIL;
                if (c1765730w392 != null) {
                    c1765730w392.findViewById(R.id.xwn);
                }
                C1765730w39 c1765730w393 = this.LLILZIL;
                if (c1765730w393 != null) {
                    c19736512Jv3 = (C19736512Jv) c1765730w393.findViewById(R.id.qmi);
                }
                this.LLIZ = c19736512Jv3;
                C0N0S c0n0s2 = this.LLILLL;
                if (c0n0s2 != null) {
                    c0n0s2.LJIIZILJ = new C0N0R() { // from class: X.0y6G
                        @Override // X.C0N0R
                        public final void onComplete() throws JSONException {
                            C1483410ohn c1483410ohn;
                            this.LIZ.getClass();
                            this.LIZ.dismiss();
                            this.LIZ.onDestroy();
                            InterfaceC1835090xr1 interfaceC1835090xr1 = this.LIZ.LLJILLL;
                            if (interfaceC1835090xr1 != null) {
                                interfaceC1835090xr1.LIZJ();
                            }
                            JSONObject jSONObject = new JSONObject();
                            C0N0S c0n0s3 = this.LIZ.LLILLL;
                            Boolean boolValueOf = c0n0s3 != null ? Boolean.valueOf(c0n0s3.LJIJI) : null;
                            boolean z = C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_PAUSE;
                            C0N0S c0n0s4 = this.LIZ.LLILLL;
                            if (c0n0s4 != null && (c1483410ohn = c0n0s4.LJII) != null) {
                                c1483410ohn.getCurrentPosition();
                            }
                            C0N0S c0n0s5 = this.LIZ.LLILLL;
                            float f = c0n0s5 != null ? c0n0s5.LJIIIZ / 100.0f : 1.0f;
                            jSONObject.put("is_mute", boolValueOf);
                            jSONObject.put("is_pause", z);
                            jSONObject.put("position", video.getVideoLength());
                            jSONObject.put("current_position", (int) Math.rint(this.LIZ.LLJ * f));
                            C389001fE.LIZ("video_full_screen_close", jSONObject, System.currentTimeMillis(), false);
                        }

                        @Override // X.C0N0R
                        public final void onFailed() {
                            InterfaceC1835090xr1 interfaceC1835090xr1 = this.LIZ.LLJILLL;
                            if (interfaceC1835090xr1 != null) {
                                interfaceC1835090xr1.LIZIZ();
                            }
                        }
                    };
                    c0n0s2.LJIILIIL = this.LLJILJILJ;
                }
                if (this.LLJILJIL && (c19736512Jv2 = this.LLJIJIL) != null) {
                    c19736512Jv2.callOnClick();
                }
                C0N0S c0n0s3 = this.LLILLL;
                if (c0n0s3 != null) {
                    c0n0s3.LJIILJJIL = this.LLJILJIL;
                }
                float f = ((this.LLJI * 1.0f) / this.LLJ) * LSPassThroughRecordSizeConfig.DEFAULT;
                C1765720w38 c1765720w385 = this.LLILZ;
                if (c1765720w385 != null) {
                    c1765720w385.LJIIJ(f);
                }
                C19736512Jv c19736512Jv4 = this.LLIZ;
                if (c19736512Jv4 != null) {
                    C786410Ut5.LLLLLLLLL(c19736512Jv4, 0);
                }
                C786410Ut5.Q7(NR(), new ACListenerS161S0100000_27(this, 178));
                ((ViewGroup.MarginLayoutParams) OR().getLayoutParams()).setMargins(16, 0, 16, this.LLJIJIL.getLayoutParams().height);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NR().getLayoutParams();
                marginLayoutParams.topMargin = 59;
                marginLayoutParams.leftMargin = 21;
                if (C497740JfY.LJJ()) {
                    ((FrameLayout.LayoutParams) OR().getLayoutParams()).gravity = 83;
                    ((FrameLayout.LayoutParams) NR().getLayoutParams()).gravity = 53;
                    marginLayoutParams.rightMargin = 21;
                }
                OR().setText(C497740JfY.LJIJI(2131842840));
                C786410Ut5.LLLLLLJ(OR(), 8);
                C786410Ut5.U8(OR(), new ACListenerS161S0100000_27(this, 179));
            } else {
                dismiss();
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0y6I
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (4 == i && 1 == keyEvent.getAction()) {
                        EducationVideoPlayerDialogFragment educationVideoPlayerDialogFragment = this.LL;
                        educationVideoPlayerDialogFragment.dismiss();
                        InterfaceC1835090xr1 interfaceC1835090xr1 = educationVideoPlayerDialogFragment.LLJILLL;
                        if (interfaceC1835090xr1 != null) {
                            interfaceC1835090xr1.LIZ();
                        }
                        educationVideoPlayerDialogFragment.MR();
                        educationVideoPlayerDialogFragment.onDestroy();
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(getActivity().getLayoutInflater(), R.layout.djj, viewGroup, false);
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
