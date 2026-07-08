package com.ss.android.ugc.aweme.socialavatar.view.v2;

import X.C01GW;
import X.C0HMC;
import X.C0HMM;
import X.C0HMP;
import X.C0MGE;
import X.C0VSJ;
import X.C1390130mHL;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.C345890DhD;
import X.C439380HKu;
import X.C452501pT;
import X.C770750ULh;
import X.C786410Ut5;
import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarChoosePhotoScene extends MvChoosePhotoScene implements C0MGE, C0HMM, C0HMC {
    public static final int $stable = 8;
    public Drawable H0;
    public int albumFailureTime;
    public final AtomicBoolean currentlyProcessingImage = new AtomicBoolean(false);
    public int noCenterFaceCount;
    public int notNeutralExpressionCount;
    public int somethingWentWrongCount;

    @Override // X.C0HMM
    public void checkValidAndUpload(Activity activity, List<String> list, String str, Function1<? super List<String>, Unit> function1) {
    }

    public final FrameLayout createLoadingView() {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0HMA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        frameLayout.addView(new C1390130mHL(frameLayout.getContext(), null, 6), new FrameLayout.LayoutParams(-2, -2, 17));
        return frameLayout;
    }

    public final void showAlbumGuidePanel() {
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LJ = getString(2131826285);
        if (this.H0 == null) {
            new Object() { // from class: X.0HMB
            }.getClass();
            String anywhereChannelPath = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath("tiktok_social_friends_interaction_res");
            if (anywhereChannelPath != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(anywhereChannelPath);
                sbLIZ.append(File.separator);
                sbLIZ.append("aimoji_aiself/aimoji_album_guide_banner.png");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists()) {
                    String path = c0vsj.getPath();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    this.H0 = new BitmapDrawable(getResources(), BitmapFactory.decodeFile(path, options));
                }
            }
        }
        c770750ULh.LIZ = this.H0;
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJFF(new C345890DhD(getString(2131826281), true), new C345890DhD(getString(2131826282), true), new C345890DhD(getString(2131826283), true));
        c770750ULh.LJIILLIIL = false;
        c770750ULh.LJI(getString(2131826284), AFwS236S0000000_6.get$arr$(349));
        c770750ULh.LIZIZ().LIZ.show(requireAppCompatActivity().getSupportFragmentManager(), "TikTokSAARootGroupScene");
    }

    @Override // X.C0HMC
    public void callback(C19EG c19eg) {
        String string;
        String string2;
        int i;
        Bundle bundle = this.mArguments;
        String string3 = null;
        if (bundle != null) {
            string = bundle.getString("source");
        } else {
            string = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            string2 = bundle2.getString("enter_from");
        } else {
            string2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", string2);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            string3 = bundle3.getString("enter_method");
        }
        c2344009Gk.LJIIIIZZ("enter_method", string3);
        c2344009Gk.LJIIIIZZ("source", string);
        C20684815ws.LJIILLIIL("aimoji_open_album", c2344009Gk.LIZ);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && !bundle4.getBoolean("prevent_album_guide_panel", false)) {
            C0HMP.LIZ.getClass();
            if (!C0HMP.LIZJ && (i = C0HMP.LIZIZ) < 2) {
                C0HMP.LIZIZ = i + 1;
                showAlbumGuidePanel();
            }
        }
    }

    @Override // X.C0HMM
    public void onSingleImageClicked(MediaModel mediaModel) {
        View rootView;
        ViewGroup viewGroup;
        String string;
        String string2;
        String string3;
        Window window;
        View decorView;
        if (!this.currentlyProcessingImage.compareAndSet(false, true)) {
            return;
        }
        Activity activity = this.mActivity;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            rootView = decorView.getRootView();
        } else {
            rootView = null;
        }
        if (rootView instanceof ViewGroup) {
            viewGroup = (ViewGroup) rootView;
        } else {
            viewGroup = null;
        }
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            string = bundle.getString("source");
        } else {
            string = null;
        }
        Bundle bundle2 = this.mArguments;
        String str = "";
        if (bundle2 == null || (string2 = bundle2.getString("enter_from")) == null) {
            string2 = "";
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string3 = bundle3.getString("enter_method")) != null) {
            str = string3;
        }
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 705));
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS75S0200000_6(viewGroup, c01gwLIZIZ, 53));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C439380HKu(string, mediaModel, this, string2, str, viewGroup, c01gwLIZIZ, null), 3);
    }

    public static final void onSingleImageClicked$dismissDualBall(ViewGroup viewGroup, C01GW<? extends FrameLayout> c01gw) {
        if (viewGroup == null) {
            return;
        }
        HandlerHook.viewPost(viewGroup, new ARunnableS75S0200000_6(viewGroup, c01gw, 54));
    }
}
