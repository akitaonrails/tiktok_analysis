package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import X.AnonymousClass1231;
import X.C098200Yq;
import X.C0BWE;
import X.C0CHQ;
import X.C0FEW;
import X.C0GZU;
import X.C0LD3;
import X.C0LEP;
import X.C0MVY;
import X.C0TVI;
import X.C123X;
import X.C1388190mED;
import X.C1388580mEq;
import X.C13LP;
import X.C13LQ;
import X.C1428470nHB;
import X.C1429320nIY;
import X.C1443990ngD;
import X.C1444060ngK;
import X.C1447110nlF;
import X.C1447130nlH;
import X.C1447150nlJ;
import X.C1447190nlN;
import X.C1447200nlO;
import X.C1447230nlR;
import X.C1447250nlT;
import X.C1447460nlo;
import X.C1447610nm3;
import X.C1452730nuJ;
import X.C14K9;
import X.C1685300txQ;
import X.C1741940vQm;
import X.C189200o6;
import X.C194353111z;
import X.C196925122x;
import X.C19726612Ga;
import X.C19EG;
import X.C19GS;
import X.C19M4;
import X.C201955140j;
import X.C298250BmZ;
import X.C366700EZg;
import X.C372580EjA;
import X.C372830EjZ;
import X.C372880Eje;
import X.C430110Gtl;
import X.C497820Jfg;
import X.C580270MpN;
import X.C785410UrT;
import X.C786410Ut5;
import X.C889340Yui;
import X.InterfaceC1447120nlG;
import X.InterfaceC1447140nlI;
import X.InterfaceC1447180nlM;
import X.InterfaceC1447630nm5;
import X.InterfaceC1452170ntP;
import X.ProgressDialogC1397800mTi;
import X.ViewTreeObserverOnGlobalLayoutListenerC462870IDd;
import Y.AObjectS295S0200000_22;
import Y.AObjectS357S0100000_14;
import Y.AObjectS365S0100000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS22S0100100_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS53S0200000_8;
import irm.AkS60S0200000_22;
import irm.AkS90S0100000_22;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import u4.q0;

/* JADX INFO: loaded from: classes23.dex */
public class VEChooseVideoCoverFragment extends Fragment implements InterfaceC1447140nlI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9PiAvHELIOSISA8OyAvJjk2OmsaDAw7Jyo/LBk6LCAjCiAlLTcKOy40JSAiPQ==";
    public RelativeLayout LL;
    public C1447150nlJ LLILLJJLI;
    public FrameLayout LLILLL;
    public ConstraintLayout LLILZ;
    public TuxIconView LLILZIL;
    public TextView LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public ImageView LLJ;
    public FrameLayout LLJI;
    public C19M4 LLJIJIL;
    public TextView LLJILJILJ;
    public View LLJILLL;
    public ViewGroup LLJJ;
    public FrameLayout LLJJI;
    public FrameLayout LLJJIII;
    public C0FEW LLJJIJIIJIL;
    public C123X LLJJIJIL;
    public C196925122x LLJJJ;
    public C19726612Ga LLJJJIL;
    public ViewGroup LLJJJJLIIL;
    public FrameLayout LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public InterfaceC1447630nm5 LLJL;
    public InterfaceC1447120nlG LLJLL;
    public float LLJLLIL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public ProgressDialogC1397800mTi LLL;
    public MutableLiveData<Bitmap> LLLF;
    public MutableLiveData<Boolean> LLLFF;
    public long LLLIL;
    public final IAVPublishService LLJILJIL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
    public final InterfaceC1447180nlM LLJJIJI = C0CHQ.LIZ().LIZ();
    public AnonymousClass1231 LLJJJJ = null;
    public boolean LLJJJJJIL = true;
    public final SafeHandler LLJLIL = new SafeHandler(this);
    public final SafeHandler LLJLILLLLZIIL = new SafeHandler(this);
    public final SparseArray<EffectTextModel> LLJLLL = new SparseArray<>();
    public final MutableLiveData<Integer> LLLFFI = new MutableLiveData<>();
    public int LLLFZ = 7;
    public int LLLI = -1;
    public String LLLII = "by_default";
    public boolean LLLIIII = false;
    public boolean LLLIIIIL = true;
    public boolean LLLIIIL = false;
    public int LLLIIL = 0;
    public final C1447110nlF LLLIILIL = new C1447110nlF();
    public boolean LLLILZ = false;

    public final void MR() {
        C1447150nlJ c1447150nlJ = this.LLILLJJLI;
        if (c1447150nlJ.indexOfChild(c1447150nlJ.LLILZIL) == -1) {
            c1447150nlJ.addView(c1447150nlJ.LLILZIL);
            if (c1447150nlJ.LLILZIL.getVisibility() != 0) {
                C786410Ut5.LLJILJIL(c1447150nlJ.LLILZIL, 0);
            }
        }
    }

    public final void NR() {
        ProgressDialogC1397800mTi progressDialogC1397800mTi = this.LLL;
        if (progressDialogC1397800mTi != null) {
            progressDialogC1397800mTi.dismiss();
            C785410UrT.LIZ(progressDialogC1397800mTi);
            VR(false);
        }
        if (this.LLJLL == null) {
            return;
        }
        this.LLJLIL.removeCallbacksAndMessages(null);
        if (getFragmentManager() != null) {
            this.LLJLL.LLIIIZ(true);
        }
    }

    public final boolean PR() {
        InterfaceC1447120nlG interfaceC1447120nlG = this.LLJLL;
        return (interfaceC1447120nlG == null || C1447200nlO.LIZ(interfaceC1447120nlG.LJI().getVideoCoverStartTm(), this.LLJLLIL / 1000.0f)) ? false : true;
    }

    public final void bS() {
        InterfaceC1447120nlG interfaceC1447120nlG;
        Bitmap currDisplayImage;
        InterfaceC1447120nlG interfaceC1447120nlG2;
        Bitmap currDisplayImage2;
        if (this.LLLILZ && (interfaceC1447120nlG2 = this.LLJLL) != null && interfaceC1447120nlG2.LLFII() != null && (currDisplayImage2 = this.LLJLL.LLFII().getCurrDisplayImage()) != null) {
            this.LLLILZ = false;
            this.LLILLJJLI.setVideoCoverFrameView(currDisplayImage2);
            currDisplayImage2.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(currDisplayImage2);
        }
        if (!this.LLJZ || (interfaceC1447120nlG = this.LLJLL) == null || interfaceC1447120nlG.LLFII() == null || (currDisplayImage = this.LLJLL.LLFII().getCurrDisplayImage()) == null) {
            return;
        }
        this.LLJLLIL = this.LLJLL.LLFII().LLL();
        this.LLLILZ = false;
        this.LLILLJJLI.setVideoCoverFrameView(currDisplayImage);
        currDisplayImage.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(currDisplayImage);
    }

    public final void cS() {
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        String coverFromLocalPath;
        if (this.LLJLL == null || !C1447250nlT.LIZLLL()) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelLJI = this.LLJLL.LJI();
        if ((!C1447250nlT.LIZ() && !C1447250nlT.LIZLLL()) || videoPublishEditModelLJI == null || (creativeModel = videoPublishEditModelLJI.creativeModel) == null || (coverPublishModel = creativeModel.coverPublishModel) == null || (coverFromLocalPath = coverPublishModel.getCoverFromLocalPath()) == null) {
            return;
        }
        this.LLLIILIL.LIZIZ = coverFromLocalPath;
    }

    public final void dS() {
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = this.LLJLL.LLFII();
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) getActivity();
        if (chooseCoverActivity == null || interfaceC1452170ntPLLFII == null) {
            return;
        }
        chooseCoverActivity.a(interfaceC1452170ntPLLFII.getCurrDisplayImage());
        MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1447610nm3 c1447610nm3;
        C1447150nlJ c1447150nlJ = this.LLILLJJLI;
        if (c1447150nlJ != null && (c1447150nlJ.getAdapter() instanceof C1447610nm3) && (c1447610nm3 = (C1447610nm3) this.LLILLJJLI.getAdapter()) != null) {
            c1447610nm3.LLILZIL.dispose();
        }
        this.LLJLIL.removeCallbacksAndMessages(null);
        this.LLJLILLLLZIIL.removeCallbacksAndMessages(null);
        C19726612Ga c19726612Ga = this.LLJJJIL;
        if (c19726612Ga != null) {
            c19726612Ga.setTouchChangedListeners(null);
        }
        this.LLJJJJJIL = true;
        AnonymousClass1231 anonymousClass1231 = this.LLJJJJ;
        if (anonymousClass1231 != null) {
            anonymousClass1231.LJI().LJIIL().setEnable(true);
        }
        Bitmap bitmap = C1444060ngK.LIZ;
        if (bitmap != null && bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            C1444060ngK.LIZ = null;
        }
        C1444060ngK.LIZJ = null;
        super.onDestroy();
    }

    public final boolean SR() {
        InterfaceC1447120nlG interfaceC1447120nlG;
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        if (!C1447250nlT.LIZ() || this.LLJJJIL == null || (interfaceC1447120nlG = this.LLJLL) == null || interfaceC1447120nlG.LJI() == null) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModelLJI = this.LLJLL.LJI();
        Matrix matrixLJIIIIZZ = this.LLJJJIL.LJIIIIZZ();
        if (!C1447250nlT.LIZ()) {
            return false;
        }
        List<Float> previewMatrix = (videoPublishEditModelLJI == null || (creativeModel = videoPublishEditModelLJI.creativeModel) == null || (coverPublishModel = creativeModel.coverPublishModel) == null) ? null : coverPublishModel.getPreviewMatrix();
        Matrix matrix = new Matrix();
        if (previewMatrix == null) {
            return false;
        }
        if (previewMatrix.size() != 9) {
            return previewMatrix.size() == 0 && !Intrinsics.LJFF(matrixLJIIIIZZ, matrix);
        }
        float[] fArrLLI = C13LP.LLI(previewMatrix);
        matrixLJIIIIZZ.getValues(new float[9]);
        return !Arrays.equals(fArrLLI, C13LP.LLI(new ArrayList(C13LQ.LJJLIL(r0))));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        VideoPublishEditModel videoPublishEditModelLJI = this.LLJLL.LJI();
        if (videoPublishEditModelLJI != null && this.LLLIIII) {
            C1443990ngD c1443990ngD = C1443990ngD.LIZ;
            boolean zPR = PR();
            boolean zSR = SR();
            c1443990ngD.getClass();
            C1443990ngD.LJII(videoPublishEditModelLJI, "edit", zPR, zSR);
        }
        this.LLLIIII = false;
    }

    public static void UR(String str) {
        if (C889340Yui.LIZ()) {
            C201955140j.LIZIZ("cover_debug", str);
        }
    }

    public final int OR(float f) {
        InterfaceC1447120nlG interfaceC1447120nlG = this.LLJLL;
        Objects.requireNonNull(interfaceC1447120nlG);
        if (interfaceC1447120nlG.LLFII() == null) {
            return 0;
        }
        Objects.requireNonNull(this.LLJLL);
        return (int) (r0.LLFII().getDuration() * f);
    }

    public final void RR(float f) {
        ARunnableS122S0100000_22 aRunnableS122S0100000_22 = new ARunnableS122S0100000_22(this, 108);
        InterfaceC1447120nlG interfaceC1447120nlG = this.LLJLL;
        if (interfaceC1447120nlG != null && interfaceC1447120nlG.LLFII() != null) {
            this.LLJLL.LLFII().df(new C1447130nlH(this, aRunnableS122S0100000_22));
        }
        this.LLLILZ = true;
        aS(f, false);
        InterfaceC1447120nlG interfaceC1447120nlG2 = this.LLJLL;
        if (interfaceC1447120nlG2 == null) {
            return;
        }
        if (f != 0.0f) {
            interfaceC1447120nlG2.LJI().getCoverPublishModel().setVideoCoverViewX((this.LLILLJJLI.getWidth() - this.LLILLJJLI.getOneThumbWidth()) * f);
        }
        C1447150nlJ c1447150nlJ = this.LLILLJJLI;
        float videoCoverViewX = this.LLJLL.LJI().getCoverPublishModel().getVideoCoverViewX();
        C0GZU c0gzu = c1447150nlJ.LLILZIL;
        if (C1388580mEq.LIZIZ(c1447150nlJ.getContext())) {
            videoCoverViewX = (c1447150nlJ.getMeasuredWidth() - c1447150nlJ.getOneThumbWidth()) - videoCoverViewX;
        }
        C786410Ut5.Id(c0gzu, videoCoverViewX);
    }

    public final void VR(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1014, c0mvy, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean> r13) {
        /*
            r12 = this;
            X.0nlG r0 = r12.LLJLL
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r0.LJI()
            X.0nlG r0 = r12.LLJLL
            X.0ntP r3 = r0.LLFII()
            com.ss.android.ugc.aweme.editSticker.model.EffectTextModel r5 = new com.ss.android.ugc.aweme.editSticker.model.EffectTextModel
            r5.<init>()
            boolean r0 = r12.PR()
            if (r0 != 0) goto L76
            X.0nlF r0 = r12.LLLIILIL
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L76
            boolean r0 = r12.SR()
            if (r0 != 0) goto L76
            r8 = 0
        L2f:
            boolean r10 = X.C1447250nlT.LIZ()
            com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel r1 = r4.getCoverPublishModel()
            if (r10 == 0) goto L62
            if (r1 == 0) goto L62
            com.ss.android.ugc.aweme.editSticker.model.CoverPreviewInfo r0 = r1.getCoverPreviewInfo()
            float r2 = r0.getShowPreviewWidth()
        L43:
            com.ss.android.ugc.aweme.editSticker.model.CoverPreviewInfo r0 = r1.getCoverPreviewInfo()
            float r1 = r0.getShowPreviewHeight()
        L4b:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nlM r3 = r0.LIZ()
            int r6 = (int) r2
            int r7 = (int) r1
            r9 = 0
            Y.AObjectS204S0300000_22 r11 = new Y.AObjectS204S0300000_22
            Y.AObjectS365S0100000_22 r13 = (Y.AObjectS365S0100000_22) r13
            r0 = 1
            r11.<init>(r12, r5, r13, r0)
            r3.LJI(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L62:
            com.ss.android.vesdk.VESize r0 = r3.getInitSize()
            int r0 = r0.width
            float r2 = (float) r0
            if (r10 == 0) goto L6e
            if (r1 == 0) goto L6e
            goto L43
        L6e:
            com.ss.android.vesdk.VESize r0 = r3.getInitSize()
            int r0 = r0.height
            float r1 = (float) r0
            goto L4b
        L76:
            r8 = 1
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment.WR(kotlin.jvm.functions.Function1):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        VideoPublishEditModel videoPublishEditModelLJI;
        super.onActivityCreated(bundle);
        if (C1447250nlT.LIZLLL()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJJJJLIIL.getLayoutParams();
            marginLayoutParams.setMarginStart(Math.round(getResources().getDisplayMetrics().density * 20));
            marginLayoutParams.setMarginEnd(Math.round(getResources().getDisplayMetrics().density * 4));
            C786410Ut5.X5(marginLayoutParams, this.LLJJJJLIIL);
        }
        C1447150nlJ c1447150nlJ = this.LLILLJJLI;
        if (c1447150nlJ != null) {
            c1447150nlJ.setOnScrollListener(this);
            this.LLILLJJLI.setItemCount(this.LLLFZ);
            this.LLILLJJLI.setTotalPage(1);
        }
        InterfaceC1447120nlG interfaceC1447120nlG = this.LLJLL;
        if (interfaceC1447120nlG == null || (videoPublishEditModelLJI = interfaceC1447120nlG.LJI()) == null) {
            return;
        }
        this.LLJLLIL = videoPublishEditModelLJI.getVideoCoverStartTm() * 1000.0f;
        if (videoPublishEditModelLJI.getCoverPublishModel() != null) {
            this.LLJLLL.put(0, videoPublishEditModelLJI.getCoverPublishModel().getEffectTextModel());
        }
        if (this.LLILLJJLI != null) {
            C430110Gtl.LIZ(this.LLILLJJLI, new AObjectS295S0200000_22(this, videoPublishEditModelLJI, 1));
        }
        this.LLLFFI.observe(this, new Observer() { // from class: X.0nlS
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
            }
        });
        C786410Ut5.Y7(this.LLILZ, new AkS53S0200000_8(videoPublishEditModelLJI, this, 2));
        C786410Ut5.Q7(this.LLJ, new AkS60S0200000_22(videoPublishEditModelLJI, this, 3));
        C786410Ut5.O7(this.LLJI, new AkS60S0200000_22(videoPublishEditModelLJI, this, 4));
        C786410Ut5.T7(this.LLJILJILJ, new AkS90S0100000_22(this, 7));
        C786410Ut5.I7(new AkS90S0100000_22(this, 6), this.LLJILLL);
        HandlerHook.viewPostDelay(this.LLJILLL, new ARunnableS122S0100000_22(this, 109), 500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC1447120nlG) {
            this.LLJLL = (InterfaceC1447120nlG) context;
            SettingsManager.LIZLLL().getClass();
            this.LLJZIJLIL = SettingsManager.LIZ("is_low_memory_machine_for_tools", false);
            C1741940vQm.LIZJ(C1388190mED.LIZ(context));
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cS();
        C1447110nlF c1447110nlF = this.LLLIILIL;
        c1447110nlF.LIZ = c1447110nlF.LIZIZ;
    }

    public final void ZR(InterfaceC1452170ntP interfaceC1452170ntP, final VideoPublishEditModel videoPublishEditModel) {
        float showPreviewWidth;
        float showPreviewHeight;
        final boolean z = true;
        if (!PR()) {
            C1447110nlF c1447110nlF = this.LLLIILIL;
            if (!(!Intrinsics.LJFF(c1447110nlF.LIZ, c1447110nlF.LIZIZ)) && !SR()) {
                z = false;
            }
        }
        final EffectTextModel effectTextModel = new EffectTextModel();
        boolean zLIZ = C1447250nlT.LIZ();
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (zLIZ && coverPublishModel != null) {
            showPreviewWidth = coverPublishModel.getCoverPreviewInfo().getShowPreviewWidth();
        } else {
            showPreviewWidth = interfaceC1452170ntP.getInitSize().width;
            if (!zLIZ || coverPublishModel == null) {
                showPreviewHeight = interfaceC1452170ntP.getInitSize().height;
            }
            C0CHQ.LIZ().LIZ().LJI(videoPublishEditModel, effectTextModel, (int) showPreviewWidth, (int) showPreviewHeight, z, true, zLIZ, new Function0() { // from class: X.0ngI
                /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v19 */
                /* JADX WARN: Type inference failed for: r1v9 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Bitmap bitmapLLLZLZ;
                    PostPageModel postPageModel;
                    InterfaceC1447120nlG interfaceC1447120nlG;
                    final VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this.LL;
                    EffectTextModel effectTextModel2 = effectTextModel;
                    boolean z2 = z;
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    vEChooseVideoCoverFragment.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("performSaveAction.compile: hasCoverText=");
                    sbLIZ.append(effectTextModel2.getHasCoverText());
                    sbLIZ.append(", hasTextSticker=");
                    sbLIZ.append(effectTextModel2.getTextSticker() != null);
                    sbLIZ.append(", textStickerPath=");
                    sbLIZ.append(effectTextModel2.getTextSticker() == null ? "" : effectTextModel2.getTextSticker().path);
                    sbLIZ.append(", isPicChange=");
                    sbLIZ.append(z2);
                    VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ));
                    if (effectTextModel2.getTextSticker() == null || !effectTextModel2.getHasCoverText()) {
                        vEChooseVideoCoverFragment.LLJLLL.put(0, new EffectTextModel());
                    } else {
                        vEChooseVideoCoverFragment.LLJLLL.put(0, effectTextModel2);
                    }
                    if (effectTextModel2.getTextSticker() != null) {
                        C1440950nbJ.LIZJ(videoPublishEditModel2, effectTextModel2.getTextSticker().path);
                    }
                    VideoPublishEditModel videoPublishEditModelLJI = vEChooseVideoCoverFragment.LLJLL.LJI();
                    EffectTextModel effectTextModel3 = vEChooseVideoCoverFragment.LLJLLL.get(0);
                    if (videoPublishEditModelLJI.getCoverPublishModel() != null) {
                        EffectTextModel effectTextModel4 = videoPublishEditModelLJI.getCoverPublishModel().getEffectTextModel();
                        effectTextModel4.setHasCoverText(effectTextModel3.getHasCoverText());
                        effectTextModel4.setTextSticker(effectTextModel3.getTextSticker());
                        effectTextModel4.setCreateAwemeCoverInfo(effectTextModel3.getCreateAwemeCoverInfo());
                        effectTextModel4.setCoverSelectedFrom(effectTextModel3.getCoverSelectedFrom());
                        effectTextModel4.setCoverFrameIndex(effectTextModel3.getCoverFrameIndex());
                    }
                    if (vEChooseVideoCoverFragment.LLILLJJLI != null && videoPublishEditModel2.getCoverPublishModel() != null) {
                        videoPublishEditModel2.getCoverPublishModel().setVideoCoverViewX(vEChooseVideoCoverFragment.LLILLJJLI.getVideoCoverViewX());
                    }
                    EditPostModel editPostModel = videoPublishEditModel2.creativeModel.editPostModel;
                    if (editPostModel != null) {
                        editPostModel.setChangeCover(true);
                    }
                    videoPublishEditModel2.setVideoCoverStartTm(vEChooseVideoCoverFragment.LLJLLIL / 1000.0f);
                    Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(videoPublishEditModel2, false, null, true, 2);
                    String first = pairLJJIIJZLJL != null ? pairLJJIIJZLJL.getFirst() : null;
                    String strLJI = C1443400nfG.LJI(videoPublishEditModel2);
                    Boolean boolValueOf = Boolean.valueOf((C1443400nfG.LJIILIIL(videoPublishEditModel2) || C1429320nIY.LIZJ(videoPublishEditModel2)) && C2286708xd.LIZJ(strLJI));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("beforeFinishChooseCover: targetCoverPath=");
                    sbLIZ2.append(first);
                    sbLIZ2.append(", customPath=");
                    sbLIZ2.append(strLJI);
                    sbLIZ2.append(", supportCustomCover=");
                    sbLIZ2.append(boolValueOf);
                    sbLIZ2.append(", videoCoverPath(current)=");
                    sbLIZ2.append(videoPublishEditModel2.getVideoCoverPath());
                    VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ2));
                    Context context = vEChooseVideoCoverFragment.getContext();
                    if (TextUtils.isEmpty(first) || (interfaceC1447120nlG = vEChooseVideoCoverFragment.LLJLL) == null || interfaceC1447120nlG.LLFII() == null || boolValueOf.booleanValue() || context == null) {
                        vEChooseVideoCoverFragment.NR();
                    } else {
                        ProgressDialogC1397800mTi progressDialogC1397800mTiLIZJ = ProgressDialogC1397800mTi.LIZJ(context, "");
                        vEChooseVideoCoverFragment.LLL = progressDialogC1397800mTiLIZJ;
                        progressDialogC1397800mTiLIZJ.setIndeterminate(true);
                        vEChooseVideoCoverFragment.VR(true);
                        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel2);
                        InterfaceC1452170ntP interfaceC1452170ntPLLFII = vEChooseVideoCoverFragment.LLJLL.LLFII();
                        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
                        c1457050o1H.LJIIIIZZ = interfaceC1452170ntPLLFII;
                        c1457050o1H.LIZIZ = first;
                        c1457050o1H.LJFF = (int) vEChooseVideoCoverFragment.LLJLLIL;
                        c1457050o1H.LJIIIZ = new AObjectS357S0100000_14(videoPublishEditModel2, 22);
                        c1457050o1H.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0ngM
                            @Override // X.InterfaceC1457180o1U
                            public final void onError(int i, String str) {
                                C201955140j.LJ(str);
                            }
                        };
                        c1457050o1H.LIZJ = new C0MBV() { // from class: X.0ngN
                            @Override // X.C0MBV
                            public final void LIZLLL() {
                                vEChooseVideoCoverFragment.NR();
                            }
                        };
                        C1457060o1I.LIZIZ(c1457050o1H);
                    }
                    if (C1447250nlT.LIZ() || C1447250nlT.LIZLLL()) {
                        VideoPublishEditModel videoPublishEditModelLJI2 = vEChooseVideoCoverFragment.LLJLL.LJI();
                        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) vEChooseVideoCoverFragment.getActivity();
                        if (videoPublishEditModelLJI2 != null && chooseCoverActivity != null && (bitmapLLLZLZ = chooseCoverActivity.LLLZLZ()) != null) {
                            Bitmap bitmapDirectMergeCoverText = videoPublishEditModelLJI2.getCoverPublishModel().getEffectTextModel().directMergeCoverText(bitmapLLLZLZ);
                            if (bitmapDirectMergeCoverText != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("saveCoverWithTextStickerWithoutCompile: merged cover success, startTm=");
                                sbLIZ3.append(vEChooseVideoCoverFragment.LLJLLIL);
                                sbLIZ3.append(", videoCoverPath(before)=");
                                sbLIZ3.append(videoPublishEditModelLJI2.getVideoCoverPath());
                                VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ3));
                                C1444060ngK.LIZ = bitmapDirectMergeCoverText;
                                String strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModelLJI2);
                                if ((C1447250nlT.LIZ() || C1447250nlT.LIZLLL()) && C2286708xd.LIZJ(strLIZIZ) && !bitmapDirectMergeCoverText.isRecycled()) {
                                    C259800zU c259800zU = new C259800zU();
                                    ?? LJJIFFI = strLIZIZ != null ? u.LJJIFFI(strLIZIZ, "_cover_img_custom.png", "_cover_img_custom_with_sticker.png", false) : 0;
                                    c259800zU.element = LJJIFFI;
                                    if (LJJIFFI != 0) {
                                        CreativeModel creativeModel = videoPublishEditModelLJI2.creativeModel;
                                        if (creativeModel != null && (postPageModel = creativeModel.postPageModel) != null) {
                                            postPageModel.customCoverWithStickerPath = LJJIFFI;
                                        }
                                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C493301w3(videoPublishEditModelLJI2, c259800zU, bitmapDirectMergeCoverText, null, null), 3);
                                    }
                                }
                                if (C889340Yui.LIZ()) {
                                    final String videoCoverPath = videoPublishEditModelLJI2.getVideoCoverPath();
                                    if (TextUtils.isEmpty(videoCoverPath)) {
                                        videoPublishEditModelLJI2.generateVideoCoverPath();
                                        videoCoverPath = videoPublishEditModelLJI2.getVideoCoverPath();
                                    }
                                    if (TextUtils.isEmpty(videoCoverPath)) {
                                        VEChooseVideoCoverFragment.UR("saveTextStickerCoverToVideoCoverPath: empty target path, skip");
                                    } else {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("saveTextStickerCoverToVideoCoverPath: save merged cover to ");
                                        sbLIZ4.append(videoCoverPath);
                                        VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ4));
                                        C0MH8 c0mh8 = C0MH8.LIZ;
                                        Function1 function1 = new Function1() { // from class: X.0ngJ
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                VEChooseVideoCoverFragment vEChooseVideoCoverFragment2 = vEChooseVideoCoverFragment;
                                                String str = videoCoverPath;
                                                vEChooseVideoCoverFragment2.getClass();
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("saveTextStickerCoverToVideoCoverPath: save result=");
                                                sbLIZ5.append(obj);
                                                sbLIZ5.append(", path=");
                                                sbLIZ5.append(str);
                                                VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ5));
                                                return null;
                                            }
                                        };
                                        c0mh8.getClass();
                                        C0MH8.LJIIZILJ(c0mh8, videoPublishEditModelLJI2, bitmapDirectMergeCoverText, LSPassThroughRecordSizeConfig.DEFAULT, 3, videoCoverPath, 0, null, function1, 96);
                                    }
                                }
                            } else {
                                VEChooseVideoCoverFragment.UR("saveCoverWithTextStickerWithoutCompile: merged cover is null");
                            }
                        }
                    }
                    return Unit.LIZ;
                }
            });
        }
        showPreviewHeight = coverPublishModel.getCoverPreviewInfo().getShowPreviewHeight();
        C0CHQ.LIZ().LIZ().LJI(videoPublishEditModel, effectTextModel, (int) showPreviewWidth, (int) showPreviewHeight, z, true, zLIZ, new Function0() { // from class: X.0ngI
            /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v19 */
            /* JADX WARN: Type inference failed for: r1v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bitmap bitmapLLLZLZ;
                PostPageModel postPageModel;
                InterfaceC1447120nlG interfaceC1447120nlG;
                final VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this.LL;
                EffectTextModel effectTextModel2 = effectTextModel;
                boolean z2 = z;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                vEChooseVideoCoverFragment.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("performSaveAction.compile: hasCoverText=");
                sbLIZ.append(effectTextModel2.getHasCoverText());
                sbLIZ.append(", hasTextSticker=");
                sbLIZ.append(effectTextModel2.getTextSticker() != null);
                sbLIZ.append(", textStickerPath=");
                sbLIZ.append(effectTextModel2.getTextSticker() == null ? "" : effectTextModel2.getTextSticker().path);
                sbLIZ.append(", isPicChange=");
                sbLIZ.append(z2);
                VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ));
                if (effectTextModel2.getTextSticker() == null || !effectTextModel2.getHasCoverText()) {
                    vEChooseVideoCoverFragment.LLJLLL.put(0, new EffectTextModel());
                } else {
                    vEChooseVideoCoverFragment.LLJLLL.put(0, effectTextModel2);
                }
                if (effectTextModel2.getTextSticker() != null) {
                    C1440950nbJ.LIZJ(videoPublishEditModel2, effectTextModel2.getTextSticker().path);
                }
                VideoPublishEditModel videoPublishEditModelLJI = vEChooseVideoCoverFragment.LLJLL.LJI();
                EffectTextModel effectTextModel3 = vEChooseVideoCoverFragment.LLJLLL.get(0);
                if (videoPublishEditModelLJI.getCoverPublishModel() != null) {
                    EffectTextModel effectTextModel4 = videoPublishEditModelLJI.getCoverPublishModel().getEffectTextModel();
                    effectTextModel4.setHasCoverText(effectTextModel3.getHasCoverText());
                    effectTextModel4.setTextSticker(effectTextModel3.getTextSticker());
                    effectTextModel4.setCreateAwemeCoverInfo(effectTextModel3.getCreateAwemeCoverInfo());
                    effectTextModel4.setCoverSelectedFrom(effectTextModel3.getCoverSelectedFrom());
                    effectTextModel4.setCoverFrameIndex(effectTextModel3.getCoverFrameIndex());
                }
                if (vEChooseVideoCoverFragment.LLILLJJLI != null && videoPublishEditModel2.getCoverPublishModel() != null) {
                    videoPublishEditModel2.getCoverPublishModel().setVideoCoverViewX(vEChooseVideoCoverFragment.LLILLJJLI.getVideoCoverViewX());
                }
                EditPostModel editPostModel = videoPublishEditModel2.creativeModel.editPostModel;
                if (editPostModel != null) {
                    editPostModel.setChangeCover(true);
                }
                videoPublishEditModel2.setVideoCoverStartTm(vEChooseVideoCoverFragment.LLJLLIL / 1000.0f);
                Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(videoPublishEditModel2, false, null, true, 2);
                String first = pairLJJIIJZLJL != null ? pairLJJIIJZLJL.getFirst() : null;
                String strLJI = C1443400nfG.LJI(videoPublishEditModel2);
                Boolean boolValueOf = Boolean.valueOf((C1443400nfG.LJIILIIL(videoPublishEditModel2) || C1429320nIY.LIZJ(videoPublishEditModel2)) && C2286708xd.LIZJ(strLJI));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("beforeFinishChooseCover: targetCoverPath=");
                sbLIZ2.append(first);
                sbLIZ2.append(", customPath=");
                sbLIZ2.append(strLJI);
                sbLIZ2.append(", supportCustomCover=");
                sbLIZ2.append(boolValueOf);
                sbLIZ2.append(", videoCoverPath(current)=");
                sbLIZ2.append(videoPublishEditModel2.getVideoCoverPath());
                VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ2));
                Context context = vEChooseVideoCoverFragment.getContext();
                if (TextUtils.isEmpty(first) || (interfaceC1447120nlG = vEChooseVideoCoverFragment.LLJLL) == null || interfaceC1447120nlG.LLFII() == null || boolValueOf.booleanValue() || context == null) {
                    vEChooseVideoCoverFragment.NR();
                } else {
                    ProgressDialogC1397800mTi progressDialogC1397800mTiLIZJ = ProgressDialogC1397800mTi.LIZJ(context, "");
                    vEChooseVideoCoverFragment.LLL = progressDialogC1397800mTiLIZJ;
                    progressDialogC1397800mTiLIZJ.setIndeterminate(true);
                    vEChooseVideoCoverFragment.VR(true);
                    C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel2);
                    InterfaceC1452170ntP interfaceC1452170ntPLLFII = vEChooseVideoCoverFragment.LLJLL.LLFII();
                    C1457050o1H c1457050o1H = c1456230nzx.LIZ;
                    c1457050o1H.LJIIIIZZ = interfaceC1452170ntPLLFII;
                    c1457050o1H.LIZIZ = first;
                    c1457050o1H.LJFF = (int) vEChooseVideoCoverFragment.LLJLLIL;
                    c1457050o1H.LJIIIZ = new AObjectS357S0100000_14(videoPublishEditModel2, 22);
                    c1457050o1H.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0ngM
                        @Override // X.InterfaceC1457180o1U
                        public final void onError(int i, String str) {
                            C201955140j.LJ(str);
                        }
                    };
                    c1457050o1H.LIZJ = new C0MBV() { // from class: X.0ngN
                        @Override // X.C0MBV
                        public final void LIZLLL() {
                            vEChooseVideoCoverFragment.NR();
                        }
                    };
                    C1457060o1I.LIZIZ(c1457050o1H);
                }
                if (C1447250nlT.LIZ() || C1447250nlT.LIZLLL()) {
                    VideoPublishEditModel videoPublishEditModelLJI2 = vEChooseVideoCoverFragment.LLJLL.LJI();
                    ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) vEChooseVideoCoverFragment.getActivity();
                    if (videoPublishEditModelLJI2 != null && chooseCoverActivity != null && (bitmapLLLZLZ = chooseCoverActivity.LLLZLZ()) != null) {
                        Bitmap bitmapDirectMergeCoverText = videoPublishEditModelLJI2.getCoverPublishModel().getEffectTextModel().directMergeCoverText(bitmapLLLZLZ);
                        if (bitmapDirectMergeCoverText != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("saveCoverWithTextStickerWithoutCompile: merged cover success, startTm=");
                            sbLIZ3.append(vEChooseVideoCoverFragment.LLJLLIL);
                            sbLIZ3.append(", videoCoverPath(before)=");
                            sbLIZ3.append(videoPublishEditModelLJI2.getVideoCoverPath());
                            VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ3));
                            C1444060ngK.LIZ = bitmapDirectMergeCoverText;
                            String strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModelLJI2);
                            if ((C1447250nlT.LIZ() || C1447250nlT.LIZLLL()) && C2286708xd.LIZJ(strLIZIZ) && !bitmapDirectMergeCoverText.isRecycled()) {
                                C259800zU c259800zU = new C259800zU();
                                ?? LJJIFFI = strLIZIZ != null ? u.LJJIFFI(strLIZIZ, "_cover_img_custom.png", "_cover_img_custom_with_sticker.png", false) : 0;
                                c259800zU.element = LJJIFFI;
                                if (LJJIFFI != 0) {
                                    CreativeModel creativeModel = videoPublishEditModelLJI2.creativeModel;
                                    if (creativeModel != null && (postPageModel = creativeModel.postPageModel) != null) {
                                        postPageModel.customCoverWithStickerPath = LJJIFFI;
                                    }
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C493301w3(videoPublishEditModelLJI2, c259800zU, bitmapDirectMergeCoverText, null, null), 3);
                                }
                            }
                            if (C889340Yui.LIZ()) {
                                final String videoCoverPath = videoPublishEditModelLJI2.getVideoCoverPath();
                                if (TextUtils.isEmpty(videoCoverPath)) {
                                    videoPublishEditModelLJI2.generateVideoCoverPath();
                                    videoCoverPath = videoPublishEditModelLJI2.getVideoCoverPath();
                                }
                                if (TextUtils.isEmpty(videoCoverPath)) {
                                    VEChooseVideoCoverFragment.UR("saveTextStickerCoverToVideoCoverPath: empty target path, skip");
                                } else {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("saveTextStickerCoverToVideoCoverPath: save merged cover to ");
                                    sbLIZ4.append(videoCoverPath);
                                    VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ4));
                                    C0MH8 c0mh8 = C0MH8.LIZ;
                                    Function1 function1 = new Function1() { // from class: X.0ngJ
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            VEChooseVideoCoverFragment vEChooseVideoCoverFragment2 = vEChooseVideoCoverFragment;
                                            String str = videoCoverPath;
                                            vEChooseVideoCoverFragment2.getClass();
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("saveTextStickerCoverToVideoCoverPath: save result=");
                                            sbLIZ5.append(obj);
                                            sbLIZ5.append(", path=");
                                            sbLIZ5.append(str);
                                            VEChooseVideoCoverFragment.UR(C2188811AlT.LIZIZ(sbLIZ5));
                                            return null;
                                        }
                                    };
                                    c0mh8.getClass();
                                    C0MH8.LJIIZILJ(c0mh8, videoPublishEditModelLJI2, bitmapDirectMergeCoverText, LSPassThroughRecordSizeConfig.DEFAULT, 3, videoCoverPath, 0, null, function1, 96);
                                }
                            }
                        } else {
                            VEChooseVideoCoverFragment.UR("saveCoverWithTextStickerWithoutCompile: merged cover is null");
                        }
                    }
                }
                return Unit.LIZ;
            }
        });
    }

    public final void aS(float f, boolean z) {
        this.LLJZ = z;
        C1452730nuJ c1452730nuJLIZLLL = C1452730nuJ.LIZLLL(OR(f));
        InterfaceC1447120nlG interfaceC1447120nlG = this.LLJLL;
        if (interfaceC1447120nlG != null) {
            interfaceC1447120nlG.LLIIII().setValue(c1452730nuJLIZLLL);
        }
        if (this.LLJL != null) {
            long j = c1452730nuJLIZLLL.LIZIZ;
            if (this.LLJLL != null) {
                this.LLJLIL.postDelayed(new ARunnableS22S0100100_22(this, j, 4), 1000L);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0FEW c0few;
        final AnonymousClass1231 anonymousClass1231LJII;
        VideoPublishEditModel videoPublishEditModelLJI;
        super.onViewCreated(view, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) q0.LJIILLIIL(R.id.view_root, view);
        this.LL = relativeLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams();
        int iLIZJ = this.LLLI;
        if (iLIZJ == -1) {
            iLIZJ = C497820Jfg.LIZJ(getActivity());
            this.LLLI = iLIZJ;
        }
        marginLayoutParams.topMargin = iLIZJ;
        this.LL.requestLayout();
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(this.LL, new C0TVI() { // from class: X.0DRG
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), c20246014Ju.LIZ(2).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        C372580EjA c372580EjA = new C372580EjA(getContext());
        boolean z = true;
        c372580EjA.LJII = true;
        ArrayList arrayList = new ArrayList();
        if (C1447250nlT.LIZJ()) {
            arrayList.add(new C372880Eje(C366700EZg.LIZ(236.0d), -1.0f));
        } else {
            arrayList.add(new C372880Eje(C366700EZg.LIZ(200.0d), -1.0f));
        }
        c372580EjA.LIZLLL = arrayList;
        int i = 0;
        c372580EjA.LJI = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d2d, this.LL, false);
        c372580EjA.LJ = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d2b, this.LL, false);
        c372580EjA.LJFF = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d2e, this.LL, false);
        this.LL.addView(new C372830EjZ(c372580EjA), 0, new RelativeLayout.LayoutParams(-1, -1));
        this.LLJIJIL = (C19M4) q0.LJIILLIIL(R.id.zdo, view);
        if (!C1447250nlT.LIZJ() || ((videoPublishEditModelLJI = this.LLJLL.LJI()) != null && videoPublishEditModelLJI.isPcsPaidVideo())) {
            C786410Ut5.LLLLLZIL(this.LLJIJIL, 8);
        } else {
            C786410Ut5.LLLLLZIL(this.LLJIJIL, 0);
            C786410Ut5.c9(this.LLJIJIL, new AkS90S0100000_22(this, 8));
        }
        this.LLILLL = (FrameLayout) q0.LJIILLIIL(R.id.ds7, view);
        if (C1447250nlT.LIZLLL()) {
            C786410Ut5.LJZ(0, this.LLILLL);
        } else {
            C786410Ut5.LJZ(8, this.LLILLL);
        }
        this.LLILLJJLI = (C1447150nlJ) q0.LJIILLIIL(R.id.dt4, view);
        this.LLILZ = (ConstraintLayout) q0.LJIILLIIL(R.id.dsa, view);
        this.LLIZ = (FrameLayout) q0.LJIILLIIL(R.id.wrapped_album_iv, view);
        this.LLIZLLLIL = (FrameLayout) q0.LJIILLIIL(R.id.avq, view);
        ImageView imageView = (ImageView) q0.LJIILLIIL(R.id.avp, view);
        this.LLJ = imageView;
        imageView.setClipToOutline(true);
        this.LLJ.setOutlineProvider(new C1447460nlo(0.0f, Float.valueOf(C366700EZg.LIZIZ(6, getContext()))));
        this.LLJI = (FrameLayout) q0.LJIILLIIL(R.id.e1l, view);
        if (C1429320nIY.LIZJ(this.LLJLL.LJI())) {
            C1447150nlJ c1447150nlJ = this.LLILLJJLI;
            if (c1447150nlJ.indexOfChild(c1447150nlJ.LLILZIL) != -1) {
                C0GZU c0gzu = c1447150nlJ.LLILZIL;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1447150nlJ, c0gzu);
                c1447150nlJ.removeView(c0gzu);
            }
        }
        if (C1447250nlT.LIZLLL()) {
            this.LLILZIL = (TuxIconView) q0.LJIILLIIL(R.id.dsb, view);
            this.LLILZLL = (TextView) q0.LJIILLIIL(R.id.dsc, view);
            if (C298250BmZ.LIZ()) {
                this.LLILZLL.setText(2131857955);
            }
            C786410Ut5.x3(this.LLILZLL.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 6));
        }
        this.LLJILJILJ = (TextView) q0.LJIILLIIL(R.id.zdj, view);
        this.LLJILLL = q0.LJIILLIIL(R.id.zdi, view);
        this.LLJJI = (FrameLayout) q0.LJIILLIIL(R.id.video_texture_container, view);
        this.LLJJIII = (FrameLayout) q0.LJIILLIIL(R.id.i43, view);
        this.LLJJ = (ViewGroup) q0.LJIILLIIL(R.id.jit, view);
        this.LLJJJJLIIL = (ViewGroup) q0.LJIILLIIL(R.id.t0j, view);
        this.LLJJL = (FrameLayout) q0.LJIILLIIL(R.id.i42, view);
        this.LLJJLIIIJLLLLLLLZ = (FrameLayout) q0.LJIILLIIL(R.id.i41, view);
        C786410Ut5.LLIL((TextView) q0.LJIILLIIL(R.id.zdn, view), 8);
        VideoPublishEditModel videoPublishEditModelLJI2 = this.LLJLL.LJI();
        if (videoPublishEditModelLJI2 == null) {
            return;
        }
        AVETParameter avetParameter = videoPublishEditModelLJI2.getAvetParameter();
        avetParameter.setEnterFrom(videoPublishEditModelLJI2.creativeModel.postPageModel.coverEnterFrom);
        avetParameter.setVideoLength(videoPublishEditModelLJI2.getPreviewInfo().getPreviewVideoLength());
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModelLJI2);
        avetParameter.setVideoCnt(pairLJIIJJI.getFirst().intValue());
        avetParameter.setPicCnt(pairLJIIJJI.getSecond().intValue());
        avetParameter.setShootTabName(C1428470nHB.LJJIIZI(videoPublishEditModelLJI2));
        EffectTextModel effectTextModel = videoPublishEditModelLJI2.getCoverPublishModel().getEffectTextModel();
        PublishCustomCoverModel publishCustomCoverModel = videoPublishEditModelLJI2.getCreativeModel().publishCustomCoverModel;
        C1447190nlN c1447190nlN = new C1447190nlN(this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJJIII);
        c1447190nlN.LIZLLL = effectTextModel;
        c1447190nlN.LJ = publishCustomCoverModel;
        c1447190nlN.LJFF = avetParameter;
        c1447190nlN.LJII = C0BWE.LIZ();
        c1447190nlN.LJI = new AObjectS365S0100000_22(this, 5);
        C0CHQ.LIZ().LIZ().LJ((C19GS) getActivity(), c1447190nlN);
        q0.LJIILLIIL(R.id.view_root, view).setOnTouchListener(new View.OnTouchListener() { // from class: X.0nlQ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        AnonymousClass1231 anonymousClass1231LJII2 = this.LLJJIJI.LJII();
        if (anonymousClass1231LJII2 != null) {
            this.LLJJJJ = anonymousClass1231LJII2;
        }
        if (!C1447250nlT.LJ().enableClickPreviewArea || !(!C0CHQ.LIZ().getAccountService().LIZ())) {
            z = false;
        }
        C0FEW c0few2 = null;
        if (z) {
            FrameLayout frameLayout = this.LLJJIII;
            int childCount = frameLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = frameLayout.getChildAt(i2);
                    if (childAt instanceof C0FEW) {
                        c0few = (C0FEW) childAt;
                        break;
                    }
                    i2++;
                } else {
                    c0few = null;
                    break;
                }
            }
            this.LLJJIJIIJIL = c0few;
            if (c0few != null && (anonymousClass1231LJII = this.LLJJIJI.LJII()) != null) {
                final GestureLayout$OnGestureListener onGestureListener = this.LLJJIJIIJIL.getOnGestureListener();
                this.LLJJIJIIJIL.setOnGestureListener(new OnGestureListenerProxy(onGestureListener) { // from class: X.0nlX
                    @Override // com.ss.android.ugc.aweme.shortvideo.vechoosecover.OnGestureListenerProxy, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean onSingleTapUp(MotionEvent motionEvent) {
                        boolean zOnSingleTapUp = super.onSingleTapUp(motionEvent);
                        if (!zOnSingleTapUp && anonymousClass1231LJII.LJIILIIL.getCurrentPos() == 0) {
                            this.LLILLL.LLJJIJI.LIZIZ();
                            AnonymousClass1231 anonymousClass1231 = anonymousClass1231LJII;
                            anonymousClass1231.LJI().LJJJI(true, anonymousClass1231.LJFF);
                        }
                        return zOnSingleTapUp;
                    }
                });
            }
        }
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) getActivity();
        if (chooseCoverActivity != null) {
            if (this.LLJJJIL == null) {
                this.LLJJJIL = chooseCoverActivity.LLILZIL;
            }
            if (C1447250nlT.LIZ()) {
                FrameLayout frameLayout2 = this.LLJJIII;
                int childCount2 = frameLayout2.getChildCount();
                while (true) {
                    if (i >= childCount2) {
                        break;
                    }
                    View childAt2 = frameLayout2.getChildAt(i);
                    if (childAt2 instanceof C0FEW) {
                        c0few2 = (C0FEW) childAt2;
                        break;
                    }
                    i++;
                }
                this.LLJJIJIIJIL = c0few2;
                if (c0few2 != null && this.LLJJJIL != null && this.LLJJIJI.LJII() != null) {
                    this.LLJJJIL.setTouchChangedListeners(new C1447230nlR(this));
                    final GestureLayout$OnGestureListener onGestureListener2 = this.LLJJIJIIJIL.getOnGestureListener();
                    this.LLJJIJIIJIL.setOnGestureListener(new OnGestureListenerProxy(onGestureListener2) { // from class: X.0nlW
                        /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
                        @Override // com.ss.android.ugc.aweme.shortvideo.vechoosecover.OnGestureListenerProxy, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onTouchEvent(android.view.MotionEvent r5) {
                            /*
                                r4 = this;
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r1 = r4.LLILLJJLI
                                X.1231 r0 = r1.LLJJJJ
                                if (r0 == 0) goto La4
                                android.widget.FrameLayout r0 = r1.LLJJIII
                                if (r0 == 0) goto La4
                                X.123X r0 = X.C1443400nfG.LIZLLL(r0)
                                r1.LLJJIJIL = r0
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                X.1231 r0 = r0.LLJJJJ
                                X.115x r0 = r0.LJIILIIL
                                int r0 = r0.getCurrentPos()
                                r3 = 1
                                r2 = 0
                                if (r0 == r3) goto L1f
                                r3 = 0
                            L1f:
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r1 = r4.LLILLJJLI
                                X.1231 r0 = r1.LLJJJJ
                                X.1230 r0 = r0.LJI()
                                X.122x r0 = r0.LLJJJJ
                                r1.LLJJJ = r0
                                if (r3 == 0) goto L55
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                X.122x r0 = r0.LLJJJ
                                if (r0 == 0) goto L6d
                                android.graphics.RectF r3 = r0.getTextRect()
                                r0 = -1027080192(0xffffffffc2c80000, float:-100.0)
                                r3.inset(r0, r0)
                            L3c:
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                boolean r0 = r0.LLJJJJJIL
                                if (r0 == 0) goto L6f
                                if (r3 == 0) goto L6f
                                if (r5 == 0) goto L6f
                                float r1 = r5.getX()
                                float r0 = r5.getY()
                                boolean r0 = r3.contains(r1, r0)
                                if (r0 == 0) goto L6f
                                return
                            L55:
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                X.123X r0 = r0.LLJJIJIL
                                if (r0 == 0) goto L6d
                                android.graphics.RectF r3 = new android.graphics.RectF
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                X.123X r1 = r0.LLJJIJIL
                                android.graphics.Rect r0 = new android.graphics.Rect
                                r0.<init>()
                                r1.getHitRect(r0)
                                r3.<init>(r0)
                                goto L3c
                            L6d:
                                r3 = 0
                                goto L3c
                            L6f:
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                r0.LLJJJJJIL = r2
                                X.122x r0 = r0.LLJJJ
                                if (r0 == 0) goto L9c
                                int r0 = r0.getVisibility()
                                if (r0 != 0) goto L8d
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                X.122x r3 = r0.LLJJJ
                                int r1 = r3.getVisibility()
                                r0 = 8
                                r3.setVisibility(r0)
                                X.C1602160rnK.LIZIZ(r1, r0, r3)
                            L8d:
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                X.1231 r0 = r0.LLJJJJ
                                X.1230 r0 = r0.LJI()
                                X.122Q r0 = r0.LJIIL()
                                r0.setEnable(r2)
                            L9c:
                                com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = r4.LLILLJJLI
                                X.12Ga r0 = r0.LLJJJIL
                                r0.onTouchEvent(r5)
                                return
                            La4:
                                X.12Ga r0 = r1.LLJJJIL
                                r0.onTouchEvent(r5)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1447280nlW.onTouchEvent(android.view.MotionEvent):void");
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.tw, viewGroup, false);
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
