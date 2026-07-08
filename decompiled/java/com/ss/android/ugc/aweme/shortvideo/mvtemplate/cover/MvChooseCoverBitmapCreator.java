package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import X.C0FNT;
import X.C0MBV;
import X.C0VSJ;
import X.C1322200kVm;
import X.C15O7;
import X.C19774412Yk;
import X.C19774512Yl;
import X.C1C7U;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2475009mu;
import X.C301620Bs0;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.InterfaceC1452170ntP;
import X.InterfaceC1457170o1T;
import X.InterfaceC1457180o1U;
import X.InterfaceC1464140oCi;
import X.InterfaceC1464200oCo;
import X.InterfaceC1487280oo2;
import X.InterfaceC741260T5w;
import X.ProgressDialogC1397810mTj;
import Y.ACallableS1S1302000_29;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes30.dex */
public class MvChooseCoverBitmapCreator {
    public List<Bitmap> bitmapList;
    public InterfaceC1464200oCo callback;
    public ProgressDialogC1397810mTj concatDialog;
    public InterfaceC1457170o1T coverSaveDelegate;
    public int coverSize;
    public AtomicInteger curSize;
    public InterfaceC1457180o1U errorListener;
    public MutableLiveData<Bitmap> firstFrameBitmap;
    public MutableLiveData<Boolean> firstFrameVisible;
    public HandlerThread handlerThread;
    public int imgHeight;
    public int imgWidth;
    public boolean isChooseSingleCoverFinish;
    public boolean isFirstSeekDone;
    public InterfaceC741260T5w listener;
    public Handler mCoverHandler;
    public Handler mMainHandler;
    public boolean needCompileFrame;
    public int[] seekPosAry;
    public long targetSeekTime;
    public InterfaceC1452170ntP veEditor;
    public boolean withoutDialog;

    private boolean bitmapFetchingDone() {
        int i = this.curSize.get();
        int[] iArr = this.seekPosAry;
        return i >= (iArr == null ? 0 : iArr.length);
    }

    private Bitmap getCurrDisplayImage() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.veEditor;
        if (interfaceC1452170ntP == null) {
            return null;
        }
        int i = this.imgWidth;
        return i == 0 ? interfaceC1452170ntP.getCurrDisplayImage() : interfaceC1452170ntP.getCurrDisplayImage(i);
    }

    public void finish() {
        InterfaceC1464200oCo interfaceC1464200oCo;
        InterfaceC741260T5w interfaceC741260T5w = this.listener;
        if (interfaceC741260T5w != null) {
            interfaceC741260T5w.LIZ(this.bitmapList);
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.veEditor;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.veEditor;
        if (interfaceC1452170ntP2 != null && (interfaceC1464200oCo = this.callback) != null) {
            interfaceC1452170ntP2.Gf(interfaceC1464200oCo);
        }
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        ProgressDialogC1397810mTj progressDialogC1397810mTj = this.concatDialog;
        if (progressDialogC1397810mTj != null) {
            progressDialogC1397810mTj.dismiss();
            C785410UrT.LIZ(progressDialogC1397810mTj);
        }
        MutableLiveData<Boolean> mutableLiveData = this.firstFrameVisible;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        this.listener = null;
    }

    public MvChooseCoverBitmapCreator() {
        this.bitmapList = Collections.synchronizedList(new ArrayList());
        this.coverSize = 7;
        this.isFirstSeekDone = false;
        this.withoutDialog = false;
        this.needCompileFrame = false;
        this.targetSeekTime = -1L;
        this.curSize = new AtomicInteger(0);
        this.coverSaveDelegate = null;
        HandlerThread handlerThread = new HandlerThread("mv_cover_creator");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.mCoverHandler = new BPEAHandler(C786410Ut5.W2(this.handlerThread)) { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.<init>$1");
                MvChooseCoverBitmapCreator.this.handleGetCoverMessage(message);
                C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.<init>$1");
            }
        };
        this.mMainHandler = new MainHandler(this);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static class MainHandler extends BPEAHandler {
        public WeakReference<MvChooseCoverBitmapCreator> creatorObj;

        public MainHandler(MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator) {
            this.creatorObj = new WeakReference<>(mvChooseCoverBitmapCreator);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1C7U.LIZ("MvChooseCoverBitmapCreator$MainHandler@fae8.handleMessage");
            if (this.creatorObj.get() == null) {
                C1C7U.LIZIZ("MvChooseCoverBitmapCreator$MainHandler@fae8.handleMessage");
                return;
            }
            int i = message.what;
            if (i == 1002) {
                List<Bitmap> list = (List) HandlerHook.getMessageObj(message.obj);
                if (this.creatorObj.get().listener == null) {
                    C1C7U.LIZIZ("MvChooseCoverBitmapCreator$MainHandler@fae8.handleMessage");
                    return;
                }
                this.creatorObj.get().listener.LIZ(list);
                if (list != null && !list.isEmpty() && ListProtector.get(list, 0) != null) {
                    if (this.creatorObj.get().firstFrameVisible != null) {
                        Boolean value = this.creatorObj.get().firstFrameVisible.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (bool.equals(value)) {
                            C1C7U.LIZIZ("MvChooseCoverBitmapCreator$MainHandler@fae8.handleMessage");
                            return;
                        }
                        this.creatorObj.get().firstFrameVisible.setValue(bool);
                    }
                    if (this.creatorObj.get().firstFrameBitmap != null) {
                        this.creatorObj.get().firstFrameBitmap.setValue((Bitmap) ListProtector.get(list, 0));
                    }
                } else {
                    C1C7U.LIZIZ("MvChooseCoverBitmapCreator$MainHandler@fae8.handleMessage");
                    return;
                }
            } else if (i == 1003) {
                this.creatorObj.get().finish();
            }
            C1C7U.LIZIZ("MvChooseCoverBitmapCreator$MainHandler@fae8.handleMessage");
        }
    }

    private boolean isValidActivity(Context context) {
        if (context == null) {
            C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            return false;
        }
        if (context instanceof Activity) {
            if (((Activity) context).isFinishing()) {
                C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
                return false;
            }
            return true;
        }
        Activity activityLIZ = C0FNT.LIZ(context);
        if (activityLIZ == null || activityLIZ.isFinishing()) {
            C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            return false;
        }
        return true;
    }

    private Bitmap resizeBitmapForCover(Bitmap bitmap) {
        if (((Number) C301620Bs0.LIZ.getValue()).intValue() == 1 && bitmap != null) {
            System.currentTimeMillis();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (480 <= width && 720 <= height) {
                float fMax = Math.max(width / 480, height / 720);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), true);
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                return bitmapCreateScaledBitmap;
            }
        }
        return bitmap;
    }

    public void handleGetCoverMessage(Message message) {
        int iMax;
        if (message.what != 1001) {
            C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            return;
        }
        if (this.veEditor == null) {
            C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            return;
        }
        if (bitmapFetchingDone()) {
            C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            return;
        }
        if (this.needCompileFrame) {
            iMax = Math.max(this.imgWidth, 240);
        } else {
            iMax = -1;
        }
        this.veEditor.Cf(this.seekPosAry[this.curSize.get()], iMax, new InterfaceC1464140oCi() { // from class: X.12Tr
            @Override // X.InterfaceC1464140oCi
            public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f) {
                return this.LIZ.lambda$handleGetCoverMessage$8(bArr, i, i2, i3, f);
            }
        });
    }

    public void setCoverSaveDelegate(InterfaceC1457170o1T interfaceC1457170o1T) {
        this.coverSaveDelegate = interfaceC1457170o1T;
    }

    public MvChooseCoverBitmapCreator setFirstFrameBitmapLiveData(MutableLiveData<Bitmap> mutableLiveData) {
        this.firstFrameBitmap = mutableLiveData;
        return this;
    }

    public MvChooseCoverBitmapCreator setFirstFrameVisibleLiveData(MutableLiveData<Boolean> mutableLiveData) {
        this.firstFrameVisible = mutableLiveData;
        return this;
    }

    public MvChooseCoverBitmapCreator setMvThemeVideoCoverErrorListener(InterfaceC1457180o1U interfaceC1457180o1U) {
        this.errorListener = interfaceC1457180o1U;
        return this;
    }

    public MvChooseCoverBitmapCreator setNeedCompileFrame(boolean z) {
        this.needCompileFrame = z;
        return this;
    }

    public MvChooseCoverBitmapCreator withoutDialog(boolean z) {
        this.withoutDialog = z;
        return this;
    }

    private int[] getCoverPosition(int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int i4 = i2 > 1 ? i2 - 1 : i2;
        if (i4 > 0) {
            i3 = i / i4;
        } else {
            i3 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = i3 * i5;
        }
        return iArr;
    }

    public static /* synthetic */ Object lambda$getCoverWithSeekWithResult$10(C0MBV c0mbv, C15O7 c15o7) {
        C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithSeekWithResult$11$2L");
        if (c0mbv != null) {
            c0mbv.LIZLLL();
        }
        C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithSeekWithResult$11$2L");
        return null;
    }

    public static /* synthetic */ Object lambda$getCoverWithoutSeek$2(C0MBV c0mbv, C15O7 c15o7) {
        C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithoutSeek$3$2L");
        if (c0mbv != null) {
            c0mbv.LIZLLL();
        }
        C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithoutSeek$3$2L");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onCoverSeekDone$5(InterfaceC1487280oo2 interfaceC1487280oo2, String str) {
        boolean zLJFF;
        C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.onCoverSeekDone$1L");
        try {
            Bitmap currDisplayImage = getCurrDisplayImage();
            if (currDisplayImage != null) {
                if (interfaceC1487280oo2 != null) {
                    try {
                        currDisplayImage = (Bitmap) interfaceC1487280oo2.apply(currDisplayImage);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        onGetCoverError(-700, "MvChooseCoverBitmap onCoverSeekDone converter error");
                    }
                }
                currDisplayImage = resizeBitmapForCover(currDisplayImage);
                System.currentTimeMillis();
                InterfaceC1457170o1T interfaceC1457170o1T = this.coverSaveDelegate;
                if (interfaceC1457170o1T != null) {
                    zLJFF = interfaceC1457170o1T.LIZ(currDisplayImage, str);
                } else {
                    zLJFF = C2475009mu.LJFF(60, Bitmap.CompressFormat.PNG, currDisplayImage, new C0VSJ(str));
                }
                if (!zLJFF) {
                    onGetCoverError(-600, "MvChooseCoverBitmap onCoverSeekDone saveImageBitmap error");
                }
                InterfaceC1457170o1T interfaceC1457170o1T2 = this.coverSaveDelegate;
                if (interfaceC1457170o1T2 == null || !interfaceC1457170o1T2.LIZIZ()) {
                    C2475009mu.LJ(currDisplayImage);
                }
            } else {
                onGetCoverError(-500, "MvChooseCoverBitmap getCurrDisplayImage return null");
            }
            C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.onCoverSeekDone$1L");
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MvChooseCoverBitmap getCurrDisplayImage exception");
            sbLIZ.append(e2);
            onGetCoverError(-500, C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.onCoverSeekDone$1L");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCoverSeekDone$6(C0MBV c0mbv, C15O7 c15o7) {
        InterfaceC1464200oCo interfaceC1464200oCo;
        C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.onCoverSeekDone$2L");
        InterfaceC1452170ntP interfaceC1452170ntP = this.veEditor;
        if (interfaceC1452170ntP != null && (interfaceC1464200oCo = this.callback) != null) {
            interfaceC1452170ntP.Gf(interfaceC1464200oCo);
        }
        if (c0mbv != null) {
            c0mbv.LIZLLL();
        }
        C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.onCoverSeekDone$2L");
        return null;
    }

    private void onGetCoverError(int i, String str) {
        InterfaceC1457180o1U interfaceC1457180o1U = this.errorListener;
        if (interfaceC1457180o1U != null) {
            interfaceC1457180o1U.onError(i, str);
        }
    }

    public MvChooseCoverBitmapCreator setImgSize(int i, int i2) {
        this.imgWidth = i;
        this.imgHeight = i2;
        return this;
    }

    private int getCoverWithSeekWithResult(final int i, final String str, final InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, final C0MBV c0mbv) {
        InterfaceC1464140oCi interfaceC1464140oCi = new InterfaceC1464140oCi() { // from class: X.12To
            @Override // X.InterfaceC1464140oCi
            public final int onGetImageData(byte[] bArr, int i2, int i3, int i4, float f) {
                return this.LIZ.lambda$getCoverWithSeekWithResult$11(i, interfaceC1487280oo2, str, c0mbv, bArr, i2, i3, i4, f);
            }
        };
        int i2 = this.imgWidth;
        if (i2 == 0) {
            return this.veEditor.Ue(i, interfaceC1464140oCi);
        }
        return this.veEditor.Cf(i, i2, interfaceC1464140oCi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBitmapList$7(int i, int i2, float f, String str) {
        if (i == 4101) {
            if (this.bitmapList.size() >= this.coverSize) {
                C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            } else {
                if (this.isFirstSeekDone) {
                    return;
                }
                this.isFirstSeekDone = true;
                C786410Ut5.LJLILLLLZI(this.mCoverHandler, 1001);
            }
        }
    }

    private void onCoverSeekDone(long j, final String str, final InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, C0MBV c0mbv) {
        C15O7.LIZJ(new Callable() { // from class: X.12Ts
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.LL.lambda$onCoverSeekDone$5(interfaceC1487280oo2, str);
            }
        }).LJ(new C19774412Yk(this, c0mbv, 0), C15O7.LJIIIIZZ, null);
    }

    public void getBitmapList(Context context, InterfaceC1452170ntP interfaceC1452170ntP, int i, InterfaceC741260T5w interfaceC741260T5w) {
        if (!isValidActivity(context) || i <= 0) {
            return;
        }
        if (!this.withoutDialog) {
            String string = context.getString(R.string.txr);
            ProgressDialogC1397810mTj progressDialogC1397810mTj = new ProgressDialogC1397810mTj(context);
            progressDialogC1397810mTj.setCancelable(false);
            progressDialogC1397810mTj.setIndeterminate(false);
            progressDialogC1397810mTj.setMax(100);
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                progressDialogC1397810mTj.show();
                C785410UrT.LIZIZ(progressDialogC1397810mTj);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(progressDialogC1397810mTj);
                C816490W1f.LIZ(progressDialogC1397810mTj);
            }
            progressDialogC1397810mTj.setMessage(string);
            View viewFindViewById = progressDialogC1397810mTj.findViewById(R.id.s8j);
            if (viewFindViewById != null) {
                if (progressDialogC1397810mTj.LL) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                } else {
                    C786410Ut5.LJLLLLLL(4, viewFindViewById);
                }
            }
            this.concatDialog = progressDialogC1397810mTj;
            progressDialogC1397810mTj.setIndeterminate(true);
        }
        this.listener = interfaceC741260T5w;
        this.coverSize = i;
        this.veEditor = interfaceC1452170ntP;
        if (interfaceC1452170ntP == null) {
            C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            return;
        }
        this.seekPosAry = getCoverPosition(interfaceC1452170ntP.getDuration(), this.coverSize);
        this.callback = new InterfaceC1464200oCo() { // from class: X.12Tt
            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i2, int i3, float f, String str) {
                this.LL.lambda$getBitmapList$7(i2, i3, f, str);
            }
        };
        interfaceC1452170ntP.pause();
        interfaceC1452170ntP.df(this.callback);
        this.isFirstSeekDone = false;
        interfaceC1452170ntP.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
    }

    public MvChooseCoverBitmapCreator(InterfaceC1452170ntP interfaceC1452170ntP, String str, int i, InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, C0MBV c0mbv) {
        this(interfaceC1452170ntP, str, i, interfaceC1487280oo2, null, c0mbv, false, false, true);
    }

    private int handleImage(byte[] bArr, int i, int i2, String str, InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2) {
        boolean zLJFF;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            if (interfaceC1487280oo2 != null) {
                try {
                    bitmapCreateBitmap = interfaceC1487280oo2.apply(bitmapCreateBitmap);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    onGetCoverError(-700, "MvChooseCoverBitmap getCoverWithoutSeek converter error");
                    return -1;
                }
            }
            System.currentTimeMillis();
            InterfaceC1457170o1T interfaceC1457170o1T = this.coverSaveDelegate;
            if (interfaceC1457170o1T != null) {
                zLJFF = interfaceC1457170o1T.LIZ(bitmapCreateBitmap, str);
            } else {
                zLJFF = C2475009mu.LJFF(60, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, new C0VSJ(str));
            }
            InterfaceC1457170o1T interfaceC1457170o1T2 = this.coverSaveDelegate;
            if (interfaceC1457170o1T2 == null || !interfaceC1457170o1T2.LIZIZ()) {
                C2475009mu.LJ(bitmapCreateBitmap);
            }
            if (!zLJFF) {
                onGetCoverError(-600, "MvChooseCoverBitmap getCoverWithoutSeek saveImageBitmap error");
                return -1;
            }
            return 0;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MvChooseCoverBitmap getCoverWithoutSeek exception");
            sbLIZ.append(e2);
            onGetCoverError(-500, C2188811AlT.LIZIZ(sbLIZ));
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$getCoverWithSeekWithResult$9(int i, int i2, byte[] bArr, InterfaceC1487280oo2 interfaceC1487280oo2, String str) {
        boolean zLJFF;
        C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithSeekWithResult$11$1L");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        if (interfaceC1487280oo2 != null) {
            try {
                bitmapCreateBitmap = (Bitmap) interfaceC1487280oo2.apply(bitmapCreateBitmap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                onGetCoverError(-700, "MvChooseCoverBitmap seekWithResult converter error");
            }
        }
        bitmapCreateBitmap = resizeBitmapForCover(bitmapCreateBitmap);
        System.currentTimeMillis();
        InterfaceC1457170o1T interfaceC1457170o1T = this.coverSaveDelegate;
        if (interfaceC1457170o1T != null) {
            zLJFF = interfaceC1457170o1T.LIZ(bitmapCreateBitmap, str);
        } else {
            zLJFF = C2475009mu.LJFF(60, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, new C0VSJ(str));
        }
        if (!zLJFF) {
            onGetCoverError(-600, "MvChooseCoverBitmap seekWithResult saveImageBitmap error");
        }
        InterfaceC1457170o1T interfaceC1457170o1T2 = this.coverSaveDelegate;
        if (interfaceC1457170o1T2 == null || !interfaceC1457170o1T2.LIZIZ()) {
            C2475009mu.LJ(bitmapCreateBitmap);
        }
        C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithSeekWithResult$11$1L");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getCoverWithoutSeek$1(byte[] bArr, int i, int i2, String str, InterfaceC1487280oo2 interfaceC1487280oo2) {
        C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithoutSeek$3$1L");
        Integer numValueOf = Integer.valueOf(handleImage(bArr, i, i2, str, interfaceC1487280oo2));
        C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.lambda$getCoverWithoutSeek$3$1L");
        return numValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$handleGetCoverMessage$8(byte[] bArr, int i, int i2, int i3, float f) {
        if (bitmapFetchingDone()) {
            C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
            return 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        this.bitmapList.add(bitmapCreateBitmap);
        this.curSize.incrementAndGet();
        if (this.curSize.get() == 1) {
            ArrayList arrayList = new ArrayList(this.coverSize);
            for (int i4 = 0; i4 < this.coverSize; i4++) {
                arrayList.add(bitmapCreateBitmap);
            }
            Message message = new Message();
            message.obj = arrayList;
            message.what = 1002;
            C786410Ut5.LJLJJL(this.mMainHandler, message);
        }
        if (this.curSize.get() < this.coverSize) {
            C786410Ut5.LJLILLLLZI(this.mCoverHandler, 1001);
            return 0;
        }
        C786410Ut5.LJLILLLLZI(this.mMainHandler, 1003);
        return 0;
    }

    public MvChooseCoverBitmapCreator(InterfaceC1452170ntP interfaceC1452170ntP, String str, int i, InterfaceC1457180o1U interfaceC1457180o1U, C0MBV c0mbv, boolean z) {
        this(interfaceC1452170ntP, str, i, null, interfaceC1457180o1U, c0mbv, false, z, true);
    }

    private int getCoverWithoutSeek(InterfaceC1452170ntP interfaceC1452170ntP, final String str, int i, final InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, final C0MBV c0mbv, final boolean z) {
        interfaceC1452170ntP.cancelGetVideoFrames();
        return interfaceC1452170ntP.lg(new int[]{i}, -1, -1, VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL, new InterfaceC1464140oCi() { // from class: X.12Tq
            @Override // X.InterfaceC1464140oCi
            public final int onGetImageData(byte[] bArr, int i2, int i3, int i4, float f) {
                return this.LIZ.lambda$getCoverWithoutSeek$3(z, str, interfaceC1487280oo2, c0mbv, bArr, i2, i3, i4, f);
            }
        });
    }

    private void initVECallback(final long j, long j2, final String str, final InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, final C0MBV c0mbv, final InterfaceC1452170ntP interfaceC1452170ntP) {
        this.targetSeekTime = j2;
        this.callback = new InterfaceC1464200oCo() { // from class: X.12Tp
            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i, int i2, float f, String str2) {
                this.LL.lambda$initVECallback$4(interfaceC1452170ntP, j, str, interfaceC1487280oo2, c0mbv, i, i2, f, str2);
            }
        };
    }

    public MvChooseCoverBitmapCreator(InterfaceC1452170ntP interfaceC1452170ntP, String str, int i, InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, InterfaceC1457180o1U interfaceC1457180o1U, C0MBV c0mbv) {
        this(interfaceC1452170ntP, str, i, interfaceC1487280oo2, interfaceC1457180o1U, c0mbv, false, false, true);
    }

    public MvChooseCoverBitmapCreator(InterfaceC1452170ntP interfaceC1452170ntP, String str, int i, InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, InterfaceC1457180o1U interfaceC1457180o1U, C0MBV c0mbv, boolean z, boolean z2) {
        this(interfaceC1452170ntP, str, i, interfaceC1487280oo2, interfaceC1457180o1U, c0mbv, z, z2, true, -1L);
    }

    public MvChooseCoverBitmapCreator(InterfaceC1452170ntP interfaceC1452170ntP, String str, int i, InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, InterfaceC1457180o1U interfaceC1457180o1U, C0MBV c0mbv, boolean z, boolean z2, boolean z3) {
        this(interfaceC1452170ntP, str, i, interfaceC1487280oo2, interfaceC1457180o1U, c0mbv, z, z2, z3, -1L);
    }

    private void getCoverInternal(InterfaceC1452170ntP interfaceC1452170ntP, String str, long j, int i, InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, C0MBV c0mbv, boolean z, boolean z2, boolean z3) {
        int coverWithoutSeek;
        if (z3) {
            coverWithoutSeek = getCoverWithSeekWithResult(i, str, interfaceC1487280oo2, c0mbv);
        } else if (!z) {
            initVECallback(j, i, str, interfaceC1487280oo2, c0mbv, interfaceC1452170ntP);
            interfaceC1452170ntP.pause();
            interfaceC1452170ntP.df(this.callback);
            coverWithoutSeek = interfaceC1452170ntP.nf(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        } else {
            coverWithoutSeek = getCoverWithoutSeek(interfaceC1452170ntP, str, i, interfaceC1487280oo2, c0mbv, z2);
        }
        if (coverWithoutSeek != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MvChooseCoverBitmap start time ");
            sbLIZ.append(i);
            sbLIZ.append(", seek error ");
            sbLIZ.append(coverWithoutSeek);
            onGetCoverError(-300, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int lambda$getCoverWithSeekWithResult$11(int i, InterfaceC1487280oo2 interfaceC1487280oo2, String str, C0MBV c0mbv, byte[] bArr, int i2, int i3, int i4, float f) {
        C15O7.LIZJ(new ACallableS1S1302000_29(i3, i4, this, interfaceC1487280oo2, str, bArr, 1)).LJ(new C19774512Yl(c0mbv, 9), C15O7.LJIIIIZZ, null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int lambda$getCoverWithoutSeek$3(boolean z, String str, InterfaceC1487280oo2 interfaceC1487280oo2, C0MBV c0mbv, byte[] bArr, int i, int i2, int i3, float f) {
        if (bArr == null) {
            return -1;
        }
        if (!z) {
            handleImage(bArr, i2, i3, str, interfaceC1487280oo2);
            if (c0mbv != null) {
                c0mbv.LIZLLL();
                return 0;
            }
            return 0;
        }
        C15O7.LIZJ(new ACallableS1S1302000_29(i2, i3, this, interfaceC1487280oo2, str, bArr, 0)).LJ(new C19774512Yl(c0mbv, 10), C15O7.LJIIIIZZ, null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVECallback$4(InterfaceC1452170ntP interfaceC1452170ntP, long j, String str, InterfaceC1487280oo2 interfaceC1487280oo2, C0MBV c0mbv, int i, int i2, float f, String str2) {
        if (i != 4101 || interfaceC1452170ntP.LLL() != this.targetSeekTime || this.isChooseSingleCoverFinish) {
            return;
        }
        this.isChooseSingleCoverFinish = true;
        onCoverSeekDone(j, str, interfaceC1487280oo2, c0mbv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$new$0(InterfaceC1452170ntP interfaceC1452170ntP, String str, long j, int i, InterfaceC1487280oo2 interfaceC1487280oo2, C0MBV c0mbv, boolean z, boolean z2, boolean z3) {
        C1C7U.LIZ("MvChooseCoverBitmapCreator@9caa.<init>$1L");
        getCoverInternal(interfaceC1452170ntP, str, j, i, interfaceC1487280oo2, c0mbv, z, z2, z3);
        C1C7U.LIZIZ("MvChooseCoverBitmapCreator@9caa.<init>$1L");
        return null;
    }

    public MvChooseCoverBitmapCreator(InterfaceC1452170ntP interfaceC1452170ntP, String str, int i, InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, InterfaceC1457180o1U interfaceC1457180o1U, C0MBV c0mbv, boolean z, boolean z2, boolean z3, long j) {
        this(interfaceC1452170ntP, str, i, interfaceC1487280oo2, interfaceC1457180o1U, c0mbv, z, z2, z3, j, false, null);
    }

    public MvChooseCoverBitmapCreator(final InterfaceC1452170ntP interfaceC1452170ntP, final String str, final int i, final InterfaceC1487280oo2<Bitmap, Bitmap> interfaceC1487280oo2, InterfaceC1457180o1U interfaceC1457180o1U, final C0MBV c0mbv, final boolean z, boolean z2, final boolean z3, long j, final boolean z4, InterfaceC1457170o1T interfaceC1457170o1T) {
        final long jCurrentTimeMillis = j;
        this.bitmapList = Collections.synchronizedList(new ArrayList());
        this.coverSize = 7;
        this.isFirstSeekDone = false;
        this.withoutDialog = false;
        this.needCompileFrame = false;
        this.targetSeekTime = -1L;
        this.curSize = new AtomicInteger(0);
        this.coverSaveDelegate = null;
        setCoverSaveDelegate(interfaceC1457170o1T);
        jCurrentTimeMillis = jCurrentTimeMillis <= 0 ? System.currentTimeMillis() : jCurrentTimeMillis;
        this.errorListener = interfaceC1457180o1U;
        if (interfaceC1452170ntP == null) {
            onGetCoverError(-100, "MvChooseCoverBitmap veEditor is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            onGetCoverError(-200, "MvChooseCoverBitmap imgPath is null");
            return;
        }
        this.veEditor = interfaceC1452170ntP;
        try {
            if (C2286708xd.LIZJ(str)) {
                C1322200kVm.LIZ().LIZJ(Uri.fromFile(new C0VSJ(str)));
                new C0VSJ(str).delete();
            }
            if (z2) {
                C15O7.LIZJ(new Callable() { // from class: X.12Tn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.LL.lambda$new$0(interfaceC1452170ntP, str, jCurrentTimeMillis, i, interfaceC1487280oo2, c0mbv, z, z3, z4);
                    }
                });
            } else {
                getCoverInternal(interfaceC1452170ntP, str, jCurrentTimeMillis, i, interfaceC1487280oo2, c0mbv, z, z3, z4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MvChooseCoverBitmap exception");
            sbLIZ.append(e);
            onGetCoverError(-400, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
