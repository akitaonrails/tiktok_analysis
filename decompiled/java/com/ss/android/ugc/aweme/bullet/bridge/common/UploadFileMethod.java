package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.AbstractC201966140u;
import X.AbstractC848400XPy;
import X.C09N1;
import X.C09N5;
import X.C0VSJ;
import X.C0WZX;
import X.C0XIR;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C1058910df7;
import X.C1256140inE;
import X.C12ES;
import X.C1388190mED;
import X.C1389890mGx;
import X.C140W;
import X.C142C;
import X.C14U0;
import X.C15O7;
import X.C1701330uNH;
import X.C1737720vJy;
import X.C1796580wqu;
import X.C19771812Xk;
import X.C201963140r;
import X.C201964140s;
import X.C20272214Tw;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2137908Zd;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2277881EDy;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2431009fo;
import X.C2478309nR;
import X.C838410Wul;
import X.C844470XAv;
import X.EnumC1054630dYD;
import X.InterfaceC1019840ce6;
import X.InterfaceC19772112Xn;
import X.InterfaceC342470Dbh;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.fe.method.H5UploadFileMethod;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class UploadFileMethod extends BaseBridgeMethod implements C14U0, InterfaceC342470Dbh {
    public C1051660dTQ contextProviderFactory;
    public boolean isCancelUpload;
    public boolean isMultiSelect;
    public SparseArray<AvatarUri> mAvatarUriList;
    public WeakReference<Context> mContextRef;
    public List<String> mFileBase64List;
    public List<String> mFileNameList;
    public String mFrom;
    public List<WeakHandler.IHandler> mIHandlerList;
    public String mImageSource;
    public int mImageWidth;
    public AtomicInteger mMultiUploadFailNum;
    public AtomicInteger mMultiUploadSuccessNum;
    public Function0<Unit> mOnUploadFinishedListener;
    public InterfaceC1019840ce6 mReturn;
    public boolean mSkipImgBase64;
    public String mUploadFileName;
    public int maxSelectNum;
    public int minImageHeight;
    public int minImageWidth;
    public boolean needBase64Response;
    public boolean needCrop;
    public long originalImageMaxSize;
    public float rectRatio;
    public boolean shouldWithCamera;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "uploadFile";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C14U0
    public void releaseListener() {
        this.mOnUploadFinishedListener = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004d A[Catch: Exception -> 0x0051, all -> 0x005f, TRY_LEAVE, TryCatch #1 {Exception -> 0x0051, blocks: (B:3:0x0009, B:5:0x000d, B:7:0x0022, B:8:0x004d), top: B:16:0x0009, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.C15O7<java.lang.String> compressUploadImageTask() {
        /*
            r9 = this;
            java.lang.String r7 = ""
            v7.o r8 = new v7.o
            r8.<init>()
            r6 = 0
            r5 = 0
            boolean r0 = r9.mSkipImgBase64     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            if (r0 != 0) goto L4d
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            r0.getClass()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            android.content.Context r1 = X.C844470XAv.LIZ()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            java.lang.String r0 = r9.mUploadFileName     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            java.io.InputStream r0 = X.C09N1.LJFF(r1, r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r0 = com.ss.android.ugc.aweme.services.IExternalService.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.services.external.ability.IAbilityService r0 = r0.abilityService()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.services.external.ability.IAVProcessService r4 = r0.processService()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            java.lang.String r3 = r9.mUploadFileName     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            r0 = 216(0xd8, float:3.03E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            r0 = 384(0x180, float:5.38E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            X.14U7 r0 = new X.14U7     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            r4.compressPhoto(r3, r2, r1, r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            goto L58
        L4d:
            r8.LJ(r6)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
            goto L58
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5f
            r8.LJ(r6)     // Catch: java.lang.Throwable -> L5f
        L58:
            r9.mSkipImgBase64 = r5
            r9.mUploadFileName = r7
            X.15O7<TResult> r0 = r8.LIZ
            return r0
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r9.mSkipImgBase64 = r5
            r9.mUploadFileName = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod.compressUploadImageTask():X.15O7");
    }

    @Override // X.C14U0
    public void cancelMultiUpload() {
        this.mReturn.LIZ(0, "H5_uploadFileCancel");
        this.isCancelUpload = true;
    }

    public UploadFileMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.mImageSource = "";
        this.mFileNameList = new ArrayList();
        this.mFileBase64List = new ArrayList();
        this.originalImageMaxSize = Long.MAX_VALUE;
        this.needCrop = false;
        this.rectRatio = 1.0f;
        this.minImageWidth = 0;
        this.minImageHeight = 0;
        this.needBase64Response = false;
        this.contextProviderFactory = c1051660dTQ;
        if (getContext() != null) {
            this.mContextRef = new WeakReference<>(getContext());
        }
    }

    private boolean checkNeededPermissions(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return true;
            }
            return false;
        }
        if (C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_IMAGES") == 0 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VIDEO") == 0) {
            return true;
        }
        if (i >= 34 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            return true;
        }
        return false;
    }

    private void prepareIHandler(int i) {
        this.mIHandlerList = new ArrayList();
        for (final int i2 = 0; i2 < i; i2++) {
            this.mIHandlerList.add(new WeakHandler.IHandler() { // from class: X.14U2
                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    UploadFileMethod uploadFileMethod = this.LLILLJJLI;
                    if (uploadFileMethod.mAvatarUriList != null && uploadFileMethod.mMultiUploadFailNum != null && uploadFileMethod.mMultiUploadSuccessNum != null && uploadFileMethod.mFileNameList != null && uploadFileMethod.mReturn != null && uploadFileMethod.mContextRef != null && !uploadFileMethod.isCancelUpload) {
                        if (HandlerHook.getMessageObj(message.obj) instanceof C0XIR) {
                            Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.mContextRef.get());
                            if (activityLIZ != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                c1389890mGx.LJIIJ(((C0XIR) HandlerHook.getMessageObj(message.obj)).getErrorMsg());
                                c1389890mGx.LJIIJJI();
                            }
                            this.LLILLJJLI.mAvatarUriList.put(i2, new AvatarUri());
                            this.LLILLJJLI.mMultiUploadFailNum.incrementAndGet();
                        } else if (HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) {
                            AvatarUri avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj);
                            if (C1256140inE.LIZIZ(avatarUri.urlList)) {
                                this.LLILLJJLI.mAvatarUriList.put(i2, avatarUri);
                                this.LLILLJJLI.mMultiUploadSuccessNum.incrementAndGet();
                            } else {
                                this.LLILLJJLI.mAvatarUriList.put(i2, new AvatarUri());
                                this.LLILLJJLI.mMultiUploadFailNum.incrementAndGet();
                            }
                        } else {
                            this.LLILLJJLI.mAvatarUriList.put(i2, new AvatarUri());
                            this.LLILLJJLI.mMultiUploadFailNum.incrementAndGet();
                        }
                        if (this.LLILLJJLI.mMultiUploadFailNum.get() + this.LLILLJJLI.mMultiUploadSuccessNum.get() == this.LLILLJJLI.mFileNameList.size()) {
                            if (this.LLILLJJLI.mMultiUploadFailNum.get() == this.LLILLJJLI.mFileNameList.size()) {
                                UploadFileMethod uploadFileMethod2 = this.LLILLJJLI;
                                uploadFileMethod2.buildMultiObject(uploadFileMethod2.mAvatarUriList);
                                this.LLILLJJLI.mReturn.LIZ(0, "H5_uploadFileFailed");
                            } else {
                                UploadFileMethod uploadFileMethod3 = this.LLILLJJLI;
                                this.LLILLJJLI.mReturn.LIZJ(1, uploadFileMethod3.buildMultiObject(uploadFileMethod3.mAvatarUriList), "H5_uploadFile");
                            }
                            Function0<Unit> function0 = this.LLILLJJLI.mOnUploadFinishedListener;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            C2478309nR.LIZJ(this.LLILLJJLI.mImageWidth);
                        }
                    }
                }
            });
        }
    }

    public JSONArray buildMultiObject(SparseArray<AvatarUri> sparseArray) {
        String str;
        Object obj;
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            if (sparseArray.get(i) != null && C1256140inE.LIZIZ(sparseArray.get(i).urlList)) {
                str = sparseArray.get(i).uri;
                obj = ListProtector.get(sparseArray.get(i).urlList, 0);
            } else {
                str = "";
                obj = "";
            }
            try {
                jSONObject.put("url", obj);
                jSONObject.put("uri", str);
                if (i < this.mFileBase64List.size()) {
                    jSONObject.put("img_base64", ListProtector.get(this.mFileBase64List, i));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Context context = this.mContextRef.get();
        if (context != null) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if ((HandlerHook.getMessageObj(message.obj) instanceof C0XIR) && activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(((C0XIR) HandlerHook.getMessageObj(message.obj)).getErrorMsg());
                c1389890mGx.LJIIJJI();
                buildObject(0, "", "");
                return;
            }
            if (HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj);
                List<String> list = avatarUri.urlList;
                if (list != null && !list.isEmpty()) {
                    try {
                        this.mReturn.LIZJ(1, buildObject(1, (String) ListProtector.get(avatarUri.urlList, 0), avatarUri.uri), "H5_uploadFile");
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                buildObject(0, "", "");
                try {
                    this.mReturn.LIZ(0, "H5_uploadFileFailed");
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
            buildObject(0, "", "");
            try {
                this.mReturn.LIZ(0, "H5_uploadFileFailed");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public void startGalleryActivity(final Activity activity) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
            if (i >= 34) {
                arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            }
        } else {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (checkNeededPermissions(activity)) {
            startGalleryActivityReal(activity, 10003);
        } else {
            C19771812Xk.LIZIZ(activity, TokenCert.with("bpea-upload_file_bullet_start_gallery_activity_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new InterfaceC19772112Xn() { // from class: X.14U4
                @Override // X.InterfaceC19772112Xn
                public final void LIZ(int[] iArr, String[] strArr) {
                    this.LIZ.lambda$startGalleryActivity$0(activity, strArr, iArr);
                }
            });
        }
    }

    public void startMultiUploadActivity(final Activity activity) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
            if (i >= 34) {
                arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            }
        } else {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (checkNeededPermissions(activity)) {
            startMultiUploadActivityWithPermission(activity);
        } else {
            C19771812Xk.LIZIZ(activity, TokenCert.with("bpea-upload_file_bullet_start_multi_upload_activity_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new InterfaceC19772112Xn() { // from class: X.14U3
                @Override // X.InterfaceC19772112Xn
                public final void LIZ(int[] iArr, String[] strArr) {
                    if (iArr != null && iArr.length > 0) {
                        if (iArr[0] == 0) {
                            this.LIZIZ.startMultiUploadActivityWithPermission(activity);
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 34 && iArr.length >= 3 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                            this.LIZIZ.startMultiUploadActivityWithPermission(activity);
                            return;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        c1389890mGx.LJIIJ(activity.getString(2131839204));
                        c1389890mGx.LJIIJJI();
                        this.LIZIZ.cancelMultiUpload();
                    }
                }
            });
        }
    }

    public void startMultiUploadActivityWithPermission(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) ImageChooseUploadActivity.class);
        intent.putExtra("shouldWithCamera", this.shouldWithCamera);
        intent.putExtra("maxSelectNum", this.maxSelectNum);
        intent.putExtra("maxFileSize", this.originalImageMaxSize);
        intent.putExtra("needBase64Response", this.needBase64Response);
        intent.putExtra("enter_from", this.mFrom);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intent);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.mFrom);
        C20684815ws.LJIILLIIL("enter_image_choose", c2344009Gk.LIZ);
        ImageChooseUploadActivity.LLJILLL = this;
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrmno/MXbaoStAi3uaxXkPtvHFvjGh1hg=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private void startGalleryActivityReal(Activity activity, int i) {
        try {
            C201964140s c201964140s = new C201964140s(new C1737720vJy(activity), C140W.ofImage());
            C201963140r c201963140r = c201964140s.LIZIZ;
            c201963140r.LIZJ = true;
            c201963140r.LJFF = false;
            c201963140r.getClass();
            c201964140s.LIZIZ.getClass();
            C201963140r c201963140r2 = c201964140s.LIZIZ;
            c201963140r2.LJI = 1;
            c201963140r2.LJ = -1;
            c201963140r2.LIZLLL = R.style.k2;
            c201964140s.LIZ(new AbstractC201966140u() { // from class: X.14Tx
                @Override // X.AbstractC201966140u
                public final AnonymousClass1474 LIZ(Context context, Item item) {
                    Uri uri = item.uri;
                    if (uri != null && !C2093608Ic.LJ(uri.toString())) {
                        try {
                            C844470XAv.LIZ.getClass();
                            if (C09N1.LJFF(C844470XAv.LIZ(), uri) == null) {
                                return new AnonymousClass1474(context.getString(R.string.nfi), 0);
                            }
                        } catch (FileNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (this.LIZ.originalImageMaxSize != 0) {
                            C844470XAv.LIZ.getClass();
                            long jLJII = C2400409as.LJII(C844470XAv.LIZ(), uri);
                            long j = this.LIZ.originalImageMaxSize;
                            if (jLJII > j) {
                                return new AnonymousClass1474(context.getString(2131822005, C244200wy.LIZ(j)), 0);
                            }
                            return null;
                        }
                        return null;
                    }
                    return new AnonymousClass1474(context.getString(R.string.nfi), 0);
                }
            });
            c201964140s.LIZIZ(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
            C2431009fo.LIZLLL(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context context;
        if (getHybridType() == EnumC1054630dYD.WEB) {
            C1058910df7 webJsMsg = getWebJsMsg(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("res");
            IESJsBridge iESJsBridge = (IESJsBridge) this.contextProviderFactory.LIZIZ(IESJsBridge.class);
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null && iESJsBridge != null) {
                try {
                    new H5UploadFileMethod(weakReference, iESJsBridge).call(webJsMsg, jSONObjectOptJSONObject);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        this.mReturn = interfaceC1019840ce6;
        String strOptString = jSONObject.optString("type");
        this.mImageSource = jSONObject.optString("source");
        this.mSkipImgBase64 = jSONObject.optBoolean("skip_img_base64", false);
        this.maxSelectNum = jSONObject.optInt("maxSelectNum", 1);
        this.isMultiSelect = jSONObject.optBoolean("isMultiSelect", false);
        this.shouldWithCamera = jSONObject.optBoolean("shouldWithCamera", false);
        this.mImageWidth = jSONObject.optInt("image_width", -1);
        this.mFrom = jSONObject.optString("from", "");
        long jOptLong = jSONObject.optLong("maxFileSize", Long.MAX_VALUE);
        this.originalImageMaxSize = jOptLong;
        if (jOptLong == 0) {
            this.originalImageMaxSize = Long.MAX_VALUE;
        }
        this.needBase64Response = jSONObject.optBoolean("needBase64Response", false);
        this.needCrop = jSONObject.optBoolean("isNeedCut", false);
        this.minImageWidth = jSONObject.optInt("minImageWidth");
        this.minImageHeight = jSONObject.optInt("minImageHeight");
        int iOptInt = jSONObject.optInt("cropRatioWidth", 0);
        int iOptInt2 = jSONObject.optInt("cropRatioHeight", 0);
        if (iOptInt * iOptInt2 != 0) {
            this.rectRatio = (iOptInt2 * 1.0f) / iOptInt;
        }
        if ("image".equals(strOptString)) {
            WeakReference<Context> weakReference2 = this.mContextRef;
            if (weakReference2 != null) {
                context = weakReference2.get();
            } else {
                context = null;
            }
            if (C142C.LIZ(context, this)) {
                this.isCancelUpload = false;
                if (this.isMultiSelect) {
                    startMultiUploadActivity(C1388190mED.LIZ(context));
                } else {
                    startGalleryActivity(C1388190mED.LIZ(context));
                }
            }
        }
    }

    @Override // X.C14U0
    public void multiUploadImages(List<C20272214Tw> list, Function0<Unit> function0) {
        if (C1256140inE.LIZ(list)) {
            return;
        }
        this.mOnUploadFinishedListener = function0;
        this.mMultiUploadSuccessNum = new AtomicInteger(0);
        this.mMultiUploadFailNum = new AtomicInteger(0);
        this.mFileNameList.clear();
        this.mFileBase64List.clear();
        for (int i = 0; i < list.size(); i++) {
            this.mFileNameList.add(((C20272214Tw) ListProtector.get(list, i)).LIZ);
            this.mFileBase64List.add(((C20272214Tw) ListProtector.get(list, i)).LIZIZ);
        }
        this.mAvatarUriList = new SparseArray<>();
        prepareIHandler(this.mFileNameList.size());
        for (int i2 = 0; i2 < this.mFileNameList.size(); i2++) {
            String str = (String) ListProtector.get(this.mFileNameList, i2);
            if (C2093608Ic.LJ(str)) {
                this.mAvatarUriList.put(i2, new AvatarUri());
                this.mMultiUploadFailNum.incrementAndGet();
            } else {
                try {
                    C844470XAv.LIZ.getClass();
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (C09N1.LJFF(C844470XAv.LIZ(), UriProtector.parse(str)) == null) {
                    this.mAvatarUriList.put(i2, new AvatarUri());
                    this.mMultiUploadFailNum.incrementAndGet();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(Api.LIZIZ);
                    sbLIZ.append("?uid=");
                    sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (!TextUtils.isEmpty(this.mImageSource)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("&source=");
                        sbLIZ2.append(this.mImageSource);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    String strLIZ = C09N5.LIZ(getContext(), UriProtector.parse(str));
                    if (strLIZ != null && !strLIZ.isEmpty()) {
                        C0XQ7.LJ();
                        C0XQ7.LIZ.LJIIJ().LJJZ(new WeakHandler((WeakHandler.IHandler) ListProtector.get(this.mIHandlerList, i2)), strLIZIZ, 4194304, C2478309nR.LIZIZ(strLIZ, new C0VSJ(strLIZ), this.mImageWidth), null);
                    }
                }
            }
        }
    }

    private JSONObject buildObject(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C15O7<String> c15o7CompressUploadImageTask = compressUploadImageTask();
        try {
            c15o7CompressUploadImageTask.LJIJJLI();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strLJIIL = c15o7CompressUploadImageTask.LJIIL();
        if (strLJIIL != null) {
            try {
                C2137908Zd.LIZJ.getClass();
                strLJIIL = C1796580wqu.LIZ(C2137908Zd.LJ(strLJIIL));
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("url", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str2);
            }
            if (!TextUtils.isEmpty(strLJIIL)) {
                jSONObject.put("img_base64", strLJIIL);
                return jSONObject;
            }
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGalleryActivity$0(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                startGalleryActivityReal(activity, 10003);
                return;
            }
            if (Build.VERSION.SDK_INT >= 34 && iArr.length >= 3 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                startGalleryActivityReal(activity, 10003);
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(activity.getString(2131839204));
            c1389890mGx.LJIIJJI();
            cancelMultiUpload();
        }
    }

    @Override // X.InterfaceC342470Dbh
    public boolean onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int i3;
        if (i == 10003) {
            if (i2 != 0 && intent != null) {
                Context context = this.mContextRef.get();
                if (context == null) {
                    return true;
                }
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
                if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                    data = (Uri) ListProtector.get(parcelableArrayListExtra, 0);
                } else {
                    data = intent.getData();
                }
                if (data != null && !C2093608Ic.LJ(data.toString())) {
                    try {
                        C844470XAv.LIZ.getClass();
                        if (C09N1.LJFF(C844470XAv.LIZ(), data) == null) {
                            C12ES.LJ(context, 2130970439, context.getString(2131839843));
                            return true;
                        }
                    } catch (FileNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (this.needCrop) {
                        Activity activityLIZ = C1388190mED.LIZ(context);
                        if (activityLIZ != null) {
                            if (!TextUtils.isEmpty(this.mImageSource)) {
                                try {
                                    i3 = CastIntegerProtector.parseInt(this.mImageSource);
                                } catch (NumberFormatException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    i3 = -1;
                                }
                                C2277881EDy.LIZIZ.gotoCropActivity(activityLIZ, data.toString(), false, this.rectRatio, (int) C12ES.LIZJ(16.0f, activityLIZ), 10004, this.minImageWidth, this.minImageHeight, i3, false);
                            } else {
                                i3 = -1;
                                C2277881EDy.LIZIZ.gotoCropActivity(activityLIZ, data.toString(), false, this.rectRatio, (int) C12ES.LIZJ(16.0f, activityLIZ), 10004, this.minImageWidth, this.minImageHeight, i3, false);
                            }
                        }
                        return true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(Api.LIZIZ);
                    sbLIZ.append("?uid=");
                    sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (!TextUtils.isEmpty(this.mImageSource)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("&source=");
                        sbLIZ2.append(this.mImageSource);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    this.mUploadFileName = data.toString();
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LJIIJ().LJJZ(new WeakHandler(this), strLIZIZ, 4194304, this.mUploadFileName, null);
                    return true;
                }
                C12ES.LJ(context, 2130970439, context.getString(2131839843));
                return true;
            }
            cancelMultiUpload();
            return true;
        }
        if (i == 10004) {
            if (i2 != 0 && intent != null) {
                Context context2 = this.mContextRef.get();
                if (context2 == null) {
                    return true;
                }
                String strLIZ = C09N5.LIZ(context2, intent.getData());
                if (C2093608Ic.LJ(strLIZ)) {
                    C12ES.LJ(context2, 2130970439, context2.getString(2131839843));
                    return true;
                }
                if (!new C0VSJ(strLIZ).exists()) {
                    C12ES.LJ(context2, 2130970439, context2.getString(2131839843));
                    return true;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(Api.LIZIZ);
                sbLIZ3.append("?uid=");
                sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                if (!TextUtils.isEmpty(this.mImageSource)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ2);
                    sbLIZ4.append("&source=");
                    sbLIZ4.append(this.mImageSource);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                }
                this.mUploadFileName = strLIZ;
                String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "uri");
                String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "url");
                if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra) && !TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2)) {
                    this.mReturn.LIZJ(1, buildObject(1, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra), "uploadFile");
                    return true;
                }
                C0XQ7.LJ();
                C0XQ7.LIZ.LJIIJ().LJJZ(new WeakHandler(this), strLIZIZ2, 4194304, this.mUploadFileName, null);
                return true;
            }
            cancelMultiUpload();
        }
        return true;
    }
}
