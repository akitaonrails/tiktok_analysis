package com.ss.android.ugc.profile.business.ur.longpress;

import X.AbstractC1387200mCc;
import X.AbstractC2173821A5s;
import X.AbstractC737180Svs;
import X.C01GW;
import X.C0S3J;
import X.C0VSJ;
import X.C1259150is5;
import X.C12ES;
import X.C1308910kAL;
import X.C13BV;
import X.C1447800nmM;
import X.C1486660on2;
import X.C1906580ziK;
import X.C19743512Mn;
import X.C19743712Mp;
import X.C19743812Mq;
import X.C19743912Mr;
import X.C19775212Ys;
import X.C199Y;
import X.C19EG;
import X.C1E5F;
import X.C2189821An6;
import X.C23250099c;
import X.C452501pT;
import X.C734080Sqs;
import X.C786410Ut5;
import X.InterfaceC1259330isN;
import X.InterfaceC1484830ok5;
import X.InterfaceC346201Wa;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import com.ss.android.ugc.ur.longpress.AwemeRouteDetailPageParams;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class LongPressAwemeFragment extends BaseFragment implements InterfaceC1259330isN {
    public static final C19743512Mn LLL = new C19743512Mn();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9HELIOSPTdiJSA9LzU+LDwgZgkjJygDOiA/Og4kLSgpDz0yLygpJzs=";
    public ViewGroup LLIZ;
    public LinearLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public SmartImageView LLJIJIL;
    public FrameLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public ViewGroup LLJILLL;
    public TuxIconView LLJJ;
    public ImageView LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJIL;
    public Aweme LLJJJ;
    public AwemeRouteDetailPageParams LLJJJIL;
    public C2189821An6 LLJJJJ;
    public List<? extends UrlModel> LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public LongPressAwemeGestureViewModel LLJL;
    public InterfaceC346201Wa<MotionEvent> LLJLIL;
    public Rect LLJLILLLLZIIL;
    public Bitmap LLJLL;
    public AwS573S0100000_29 LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZIJLIL;
    public final RectF LLJJIJI = new RectF();
    public final RectF LLJJIJIIJIL = new RectF();
    public List<? extends AbstractC737180Svs> LLJJL = C13BV.INSTANCE;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 742));

    @Override // X.InterfaceC1259330isN
    public final void Gb() {
        UR(null);
    }

    public final C19743712Mp WR() {
        return (C19743712Mp) this.LLJZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        super.onDestroy();
        C19743712Mp c19743712MpWR = WR();
        if (c19743712MpWR != null && (interfaceC1484830ok5 = c19743712MpWR.LIZJ) != null) {
            interfaceC1484830ok5.stop();
            interfaceC1484830ok5.release();
            C1486660on2 c1486660on2 = c19743712MpWR.LIZLLL;
            if (c1486660on2 != null) {
                interfaceC1484830ok5.LJIIJJI(c1486660on2);
            }
            C0S3J c0s3j = c19743712MpWR.LJ;
            if (c0s3j != null) {
                interfaceC1484830ok5.LJJIIZ(c0s3j);
            }
        }
        Bitmap bitmap = this.LLJLL;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        NavigationScene navigationScene;
        Scene sceneLJII;
        NavigationScene navigationSceneLIZ;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        super.onResume();
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            C19743712Mp c19743712MpWR = WR();
            if (c19743712MpWR != null && (interfaceC1484830ok5 = c19743712MpWR.LIZJ) != null) {
                interfaceC1484830ok5.resume();
            }
        }
        if (!this.LLJJIII) {
            this.LLJJIII = true;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C19743812Mq(this, null), 3);
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (sceneLJII = abstractC1387200mCcLJ.LJII()) != null && (navigationSceneLIZ = C1447800nmM.LIZ(sceneLJII)) != null) {
            navigationSceneLIZ.LLLIILIL(this, new C19775212Ys(this, 9));
            return;
        }
        C19EG activity = getActivity();
        if ((activity instanceof C199Y) && (navigationScene = ((C199Y) activity).getNavigationScene()) != null) {
            navigationScene.LLLIILIL(this, new C19775212Ys(this, 10));
            return;
        }
        C19EG activity2 = getActivity();
        if (activity2 == null || (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.LIZ(this, new AbstractC2173821A5s() { // from class: X.12Mt
            @Override // X.AbstractC2173821A5s
            public final void LIZIZ() {
                LongPressAwemeFragment longPressAwemeFragment = this.LIZLLL;
                String str = LongPressAwemeFragment._pnsPageId;
                longPressAwemeFragment.UR(null);
            }

            {
                super(true);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        super.onStop();
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
        C19743712Mp c19743712MpWR = WR();
        if (c19743712MpWR == null || (interfaceC1484830ok5 = c19743712MpWR.LIZJ) == null) {
            return;
        }
        interfaceC1484830ok5.stop();
    }

    public static boolean ZR(Aweme aweme) {
        if (aweme.getAwemeType() == 150) {
            return true;
        }
        return false;
    }

    public final void SR(Integer num) {
        int iIntValue;
        if (num == null) {
            Context context = getContext();
            if (context != null) {
                num = C1308910kAL.LIZJ(R.attr.z_, context);
            } else {
                num = null;
            }
        }
        FrameLayout frameLayout = this.LLJILJIL;
        if (frameLayout != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            frameLayout.setBackgroundColor(iIntValue);
        }
    }

    public final void UR(Intent intent) {
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C19743912Mr(this, intent, null), 3);
    }

    public final void aS(String str) {
        String str2;
        AwemeRouteDetailPageParams awemeRouteDetailPageParams = this.LLJJJIL;
        if (awemeRouteDetailPageParams != null) {
            C734080Sqs c734080Sqs = C734080Sqs.LIZ;
            String value = awemeRouteDetailPageParams.tabFrom.getValue();
            if (awemeRouteDetailPageParams.isMyProfile()) {
                str2 = "user";
            } else {
                str2 = "visitor";
            }
            String str3 = awemeRouteDetailPageParams.toUserId;
            c734080Sqs.getClass();
            C734080Sqs.LIZ(value, str2, str, str3);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AwemeRouteDetailPageParams awemeRouteDetailPageParams;
        Aweme aweme;
        List<? extends UrlModel> list;
        Context context;
        Bitmap bitmapDecodeFile;
        super.onCreate(bundle);
        NR(AFwS273S0000000_29.get$arr$(256));
        Bundle arguments = getArguments();
        C2189821An6 c2189821An6LJII = null;
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("aweme_route_detail_page_params");
            if (serializable instanceof AwemeRouteDetailPageParams) {
                awemeRouteDetailPageParams = (AwemeRouteDetailPageParams) serializable;
            } else {
                awemeRouteDetailPageParams = null;
            }
            this.LLJJJIL = awemeRouteDetailPageParams;
            if (awemeRouteDetailPageParams != null) {
                aweme = awemeRouteDetailPageParams.aweme;
            } else {
                aweme = null;
            }
            this.LLJJJ = aweme;
            if (awemeRouteDetailPageParams != null) {
                list = awemeRouteDetailPageParams.topShareUserAvatarInfo;
            } else {
                list = null;
            }
            this.LLJJJJJIL = list;
            RectF rectF = (RectF) arguments.getParcelable("longpress_aweme_fragment_opening_start_rect");
            if (rectF != null) {
                this.LLJJIJI.set(rectF);
            } else {
                this.LLJJIJI.set(0.0f, 0.0f, C12ES.LJIIJ(getContext()), C12ES.LJIIIIZZ(getContext()));
            }
            RectF rectF2 = (RectF) arguments.getParcelable("longpress_aweme_fragment_closing_end_rect");
            if (rectF2 != null) {
                this.LLJJIJIIJIL.set(rectF2);
            } else {
                this.LLJJIJIIJIL.set(0.0f, 0.0f, C12ES.LJIIJ(getContext()), C12ES.LJIIIIZZ(getContext()));
            }
            if (arguments.getBoolean("longpress_aweme_fragment_has_saved_thumbnail", false) && (context = getContext()) != null) {
                C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), "longpress_aweme_fragment_thumbnail_path");
                if (!c0vsj.exists()) {
                    bitmapDecodeFile = null;
                } else {
                    bitmapDecodeFile = BitmapFactory.decodeFile(c0vsj.getAbsolutePath());
                }
                this.LLJLL = bitmapDecodeFile;
            }
            this.LLJL = new LongPressAwemeGestureViewModel(new C1259150is5(arguments.getBundle("aweme_route_bundle"), this.LLJJJIL));
        }
        C19EG activity = getActivity();
        if (activity != null) {
            c2189821An6LJII = C1E5F.LIZIZ.LJII(activity);
        }
        this.LLJJJJ = c2189821An6LJII;
    }

    public static Integer VR(float f, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            return Integer.valueOf(Color.argb((int) (f * 255), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0S3J, X.0ogN] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0oiS, X.0on2] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bb  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r29, android.view.ViewGroup r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
