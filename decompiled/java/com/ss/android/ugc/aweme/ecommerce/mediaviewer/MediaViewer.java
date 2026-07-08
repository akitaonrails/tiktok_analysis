package com.ss.android.ugc.aweme.ecommerce.mediaviewer;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C1120604Zw;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1421105hJ;
import X.C1508330pLz;
import X.C1685300txQ;
import X.C1752030vh3;
import X.C1765720w38;
import X.C1765830w3J;
import X.C1765850w3L;
import X.C1765860w3M;
import X.C1775640wJ8;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2188811AlT;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1508380pM4;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS123S0100000_23;
import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.galleryviewer.ui.ECLocalVideoUrlModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class MediaViewer extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+HELIOSLTcvLGE+LSElKDk6LTIpO2EeLSElKBk6LTIpOw==";
    public TuxIconView LL;
    public View LLILLJJLI;
    public C1765830w3J LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(169));
    public final AwS570S0100000_26 LLILZIL = new AwS570S0100000_26(this, 642);
    public final MediaViewer$observer$1 LLILZLL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.mediaviewer.MediaViewer$observer$1
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
            C1765830w3J c1765830w3J = this.LL.LLILLL;
            if (c1765830w3J != null) {
                C1765720w38 c1765720w38 = c1765830w3J.LIZIZ;
                if (c1765720w38 != null) {
                    c1765720w38.LIZ(true);
                }
                c1765830w3J.LIZIZ = null;
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            MediaViewer mediaViewer = this.LL;
            View view = mediaViewer.LLILLJJLI;
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS123S0100000_23(mediaViewer, 23));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            C1765720w38 c1765720w38;
            C1765830w3J c1765830w3J = this.LL.LLILLL;
            if (c1765830w3J == null || (c1765720w38 = c1765830w3J.LIZIZ) == null) {
                return;
            }
            c1765720w38.LJFF();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
            C1765720w38 c1765720w38;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).setCurrentPlayerMute(false);
            C1765830w3J c1765830w3J = this.LL.LLILLL;
            if (c1765830w3J == null || (c1765720w38 = c1765830w3J.LIZIZ) == null) {
                return;
            }
            c1765720w38.LIZJ();
        }
    };

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1765830w3J c1765830w3J = this.LLILLL;
        if (c1765830w3J != null) {
            C1765720w38 c1765720w38 = c1765830w3J.LIZIZ;
            if (c1765720w38 != null) {
                c1765720w38.LIZ(true);
            }
            c1765830w3J.LIZIZ = null;
        }
        super.onDestroy();
        getLifecycle().removeObserver(this.LLILZLL);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.Holo.Light);
        getLifecycle().addObserver(this.LLILZLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1765830w3J c1765830w3J;
        String str;
        String string;
        Integer numValueOf;
        String string2;
        String string3;
        String string4;
        Integer numValueOf2;
        Boolean boolValueOf;
        C1508330pLz c1508330pLz;
        Video video;
        Window window;
        Window window2;
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            dismiss();
        } else {
            Bundle arguments = getArguments();
            View viewFindViewById = null;
            if (arguments != null && (numValueOf = Integer.valueOf(arguments.getInt("type"))) != null && numValueOf.intValue() == 1) {
                C1765860w3M c1765860w3M = (C1765860w3M) this.LLILZ.getValue();
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (string2 = arguments2.getString("video_url")) == null) {
                    string2 = "";
                }
                c1765860w3M.LIZ().put("video_url", string2);
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    string3 = arguments3.getString("video_url");
                } else {
                    string3 = null;
                }
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    string4 = arguments4.getString("video_cover");
                } else {
                    string4 = null;
                }
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    numValueOf2 = Integer.valueOf(arguments5.getInt("video_len"));
                } else {
                    numValueOf2 = null;
                }
                Bundle arguments6 = getArguments();
                if (arguments6 != null) {
                    boolValueOf = Boolean.valueOf(arguments6.getBoolean("is_auto_play", true));
                } else {
                    boolValueOf = null;
                }
                C1765850w3L c1765850w3L = new C1765850w3L();
                c1765850w3L.LIZIZ = string3;
                c1765850w3L.LIZJ = string4;
                c1765850w3L.LIZLLL = numValueOf2;
                c1765850w3L.LJ = boolValueOf;
                C1765860w3M c1765860w3M2 = (C1765860w3M) this.LLILZ.getValue();
                C1765720w38 c1765720w38 = (C1765720w38) view.findViewById(com.zhiliaoapp.musically.R.id.ghq);
                AwS570S0100000_26 awS570S0100000_26 = this.LLILZIL;
                c1765830w3J = new C1765830w3J(this, c1765860w3M2, c1765720w38, awS570S0100000_26);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ecommerce_video_");
                sbLIZ.append(c1765850w3L.LIZIZ);
                c1765850w3L.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                Video video2 = new Video();
                VideoUrlModel eCLocalVideoUrlModel = new ECLocalVideoUrlModel();
                eCLocalVideoUrlModel.setSourceId(c1765850w3L.LIZ);
                eCLocalVideoUrlModel.setUri(c1765850w3L.LIZIZ);
                ArrayList arrayList = new ArrayList();
                arrayList.add(c1765850w3L.LIZIZ);
                eCLocalVideoUrlModel.setUrlList(arrayList);
                eCLocalVideoUrlModel.setUrlKey(c1765850w3L.LIZ);
                video2.setPlayAddr(eCLocalVideoUrlModel);
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(c1765850w3L.LIZJ);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c1765850w3L.LIZJ);
                urlModel.setUrlList(arrayList2);
                video2.setCover(urlModel);
                Integer num = c1765850w3L.LIZLLL;
                if (num != null) {
                    video2.setVideoLength(num.intValue());
                }
                video2.setPlayAddrBytevc1(video2.getPlayAddr());
                Aweme aweme = new Aweme();
                aweme.setVideo(video2);
                aweme.setAid(c1765850w3L.LIZ);
                c1765830w3J.LJFF = aweme;
                c1765830w3J.LIZLLL = c1765850w3L;
                String str2 = c1765850w3L.LIZIZ;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    C1765720w38 c1765720w382 = c1765830w3J.LIZIZ;
                    if (c1765720w382 != null) {
                        c1508330pLz = new C1508330pLz(c1765720w382, false);
                        c1508330pLz.LIZLLL().add(c1765830w3J.LJII.getValue());
                    } else {
                        c1508330pLz = null;
                    }
                    c1765830w3J.LJ = c1508330pLz;
                    Aweme aweme2 = c1765830w3J.LJFF;
                    if (aweme2 != null && (video = aweme2.getVideo()) != null) {
                        C1508330pLz c1508330pLz2 = c1765830w3J.LJ;
                        if (c1508330pLz2 != null) {
                            c1508330pLz2.LJFF = video;
                            c1508330pLz2.LJI = 0;
                            Aweme aweme3 = c1765830w3J.LJFF;
                            InterfaceC1508380pM4 interfaceC1508380pM4 = c1508330pLz2.LJIIIIZZ;
                            if (interfaceC1508380pM4 != null) {
                                interfaceC1508380pM4.LIZIZ(aweme3);
                            }
                        }
                        new C1752030vh3();
                        C1752030vh3 c1752030vh3 = new C1752030vh3();
                        c1752030vh3.LIZ = c1765830w3J.LJ;
                        C19EG activity = getActivity();
                        if (activity != null) {
                            window = activity.getWindow();
                        } else {
                            window = null;
                        }
                        c1752030vh3.LIZJ = window;
                        c1752030vh3.LJ = Integer.valueOf(video.getVideoLength());
                        Dialog dialog = getDialog();
                        if (dialog != null) {
                            window2 = dialog.getWindow();
                        } else {
                            window2 = null;
                        }
                        c1752030vh3.LIZJ = window2;
                        c1765830w3J.LJI = c1752030vh3;
                        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(video.getCover());
                        c1326790kdB.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModelLIZ);
                        c1331670kl3LIZLLL.LJJIJL(getContext());
                        c1331670kl3LIZLLL.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LIZLLL.LJJII(new C1775640wJ8(c1765830w3J, 0));
                        C1765720w38 c1765720w383 = c1765830w3J.LIZIZ;
                        if (c1765720w383 != null) {
                            c1765720w383.setParams(c1765830w3J.LJI);
                        }
                    }
                } else {
                    if (awS570S0100000_26 != null) {
                        awS570S0100000_26.invoke();
                    }
                    C1765720w38 c1765720w384 = c1765830w3J.LIZIZ;
                    if (c1765720w384 != null) {
                        c1765720w384.LIZ(true);
                    }
                    c1765830w3J.LIZIZ = null;
                }
            } else {
                c1765830w3J = null;
            }
            this.LLILLL = c1765830w3J;
            C1765860w3M c1765860w3M3 = (C1765860w3M) this.LLILZ.getValue();
            String str3 = "unknown";
            if (this.LLILLL == null) {
                str = "unknown";
            } else {
                str = "video_viewer";
            }
            c1765860w3M3.LIZ().put("page_name", str);
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (string = arguments7.getString("from_page")) == null) {
                string = "unknown";
            }
            c1765860w3M3.LIZ().put("previous_page", string);
            View view2 = this.LL;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(com.zhiliaoapp.musically.R.id.cov);
                }
                this.LL = (TuxIconView) viewFindViewById;
                view2 = viewFindViewById;
            }
            C786410Ut5.a9((TuxIconView) view2, new ACListenerS160S0100000_26(this, 1));
            C1765830w3J c1765830w3J2 = this.LLILLL;
            if (c1765830w3J2 != null) {
                c1765830w3J2.LIZ();
                C1765860w3M c1765860w3M4 = (C1765860w3M) this.LLILZ.getValue();
                c1765860w3M4.getClass();
                try {
                    HashMap map = new HashMap();
                    String str4 = c1765860w3M4.LIZ().get("page_name");
                    if (str4 == null) {
                        str4 = "unknown";
                    }
                    map.put("page_name", str4);
                    String str5 = c1765860w3M4.LIZ().get("previous_page");
                    if (str5 != null) {
                        str3 = str5;
                    }
                    map.put("previous_page", str3);
                    C1421105hJ.LIZJ("rd_tiktokec_enter_page", map);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0w3K
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (4 == i && 1 == keyEvent.getAction()) {
                        this.LL.dismiss();
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        LayoutInflater layoutInflater2;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null && (layoutInflater2 = activity.getLayoutInflater()) != null) {
            viewTd = C786410Ut5.Td(layoutInflater2, com.zhiliaoapp.musically.R.layout.bqa, viewGroup, false);
        } else {
            viewTd = null;
        }
        this.LLILLJJLI = viewTd;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
