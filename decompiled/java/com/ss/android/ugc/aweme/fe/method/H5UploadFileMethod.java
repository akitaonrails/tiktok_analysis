package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC201966140u;
import X.AbstractC848400XPy;
import X.C09N1;
import X.C09N2;
import X.C09N5;
import X.C0VSJ;
import X.C0WZX;
import X.C0XIR;
import X.C0XQ7;
import X.C1058910df7;
import X.C1233040iBy;
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
import X.InterfaceC1051760dTa;
import X.InterfaceC19772112Xn;
import X.InterfaceC342470Dbh;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
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
public class H5UploadFileMethod implements InterfaceC1051760dTa, C14U0, InterfaceC342470Dbh {
    public boolean isCancelUpload;
    public boolean isMultiSelect;
    public SparseArray<AvatarUri> mAvatarUriList;
    public WeakReference<Context> mContextRef;
    public String mFrom;
    public List<WeakHandler.IHandler> mIHandlerList;
    public int mImageWidth;
    public IESJsBridge mJsBridge;
    public AtomicInteger mMultiUploadFailNum;
    public AtomicInteger mMultiUploadSuccessNum;
    public Function0<Unit> mOnUploadFinishedListener;
    public boolean mSkipImgBase64;
    public String mUploadFileName;
    public int maxSelectNum;
    public boolean shouldWithCamera;
    public String mImageSource = "";
    public List<String> mFileNameList = new ArrayList();
    public List<String> mFileBase64List = new ArrayList();
    public boolean needBase64Response = false;
    public long originalImageMaxSize = Long.MAX_VALUE;
    public boolean needCrop = false;
    public float rectRatio = 1.0f;
    public int minImageWidth = 0;
    public int minImageHeight = 0;

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
            X.14U9 r0 = new X.14U9     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5f
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.H5UploadFileMethod.compressUploadImageTask():X.15O7");
    }

    @Override // X.C14U0
    public void cancelMultiUpload() {
        sendCancelEventToJsBridge("image", "1");
        this.isCancelUpload = true;
    }

    private JSONArray buildMultiObject(SparseArray<AvatarUri> sparseArray) {
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

    private void openChooseUploadActivity(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) ImageChooseUploadActivity.class);
        intent.putExtra("shouldWithCamera", this.shouldWithCamera);
        intent.putExtra("maxSelectNum", this.maxSelectNum);
        intent.putExtra("maxFileSize", this.originalImageMaxSize);
        intent.putExtra("needBase64Response", this.needBase64Response);
        intent.putExtra("enter_from", this.mFrom);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intent);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.mFrom);
        C20684815ws.LJIILLIIL("enter_image_choose", c2344009Gk.LIZ);
        ImageChooseUploadActivity.LLJILLL = this;
    }

    private void prepareIHandler(int i) {
        this.mIHandlerList = new ArrayList();
        for (final int i2 = 0; i2 < i; i2++) {
            this.mIHandlerList.add(new WeakHandler.IHandler() { // from class: X.14U8
                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    this.LL.lambda$prepareIHandler$2(i2, message);
                }
            });
        }
    }

    public Context getContext(Context context) {
        while (context != null) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                return activityLIZ;
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return context;
            }
        }
        return null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        JSONObject jSONObjectBuildObject;
        AvatarUri avatarUri;
        List<String> list;
        Context context = getContext(this.mContextRef.get());
        if (context != null) {
            if (HandlerHook.getMessageObj(message.obj) instanceof C0XIR) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZJ(((C0XIR) HandlerHook.getMessageObj(message.obj)).getErrorMsg());
                c1233040iBy.LIZLLL();
                jSONObjectBuildObject = buildObject(0, "", "");
            } else if ((HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) && (list = (avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj)).urlList) != null && !list.isEmpty()) {
                jSONObjectBuildObject = buildObject(1, (String) ListProtector.get(avatarUri.urlList, 0), avatarUri.uri);
            } else {
                jSONObjectBuildObject = buildObject(0, "", "");
            }
            sendEventToJsBridge("image", jSONObjectBuildObject);
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
            C19771812Xk.LIZIZ(activity, TokenCert.with("bpea-h5_upload_file_write_storage_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new InterfaceC19772112Xn() { // from class: X.14U5
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
            openChooseUploadActivity(activity);
        } else {
            C19771812Xk.LIZIZ(activity, TokenCert.with("bpea-h5_upload_file_write_storage_2_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new InterfaceC19772112Xn() { // from class: X.14U6
                @Override // X.InterfaceC19772112Xn
                public final void LIZ(int[] iArr, String[] strArr) {
                    this.LIZ.lambda$startMultiUploadActivity$1(activity, strArr, iArr);
                }
            });
        }
    }

    public H5UploadFileMethod(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        this.mContextRef = weakReference;
        this.mJsBridge = iESJsBridge;
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkRzCMgqVCZHaNFpfZ3SsmAwENg=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareIHandler$2(int i, Message message) {
        if (this.mAvatarUriList != null && this.mMultiUploadFailNum != null && this.mMultiUploadSuccessNum != null && this.mFileNameList != null && this.mContextRef != null && !this.isCancelUpload) {
            if (HandlerHook.getMessageObj(message.obj) instanceof C0XIR) {
                Context context = getContext(this.mContextRef.get());
                if (context != null) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZJ(((C0XIR) HandlerHook.getMessageObj(message.obj)).getErrorMsg());
                    c1233040iBy.LIZLLL();
                }
                this.mAvatarUriList.put(i, new AvatarUri());
                this.mMultiUploadFailNum.incrementAndGet();
            } else if (HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj);
                if (C1256140inE.LIZIZ(avatarUri.urlList)) {
                    this.mAvatarUriList.put(i, avatarUri);
                    this.mMultiUploadSuccessNum.incrementAndGet();
                } else {
                    this.mAvatarUriList.put(i, new AvatarUri());
                    this.mMultiUploadFailNum.incrementAndGet();
                }
            } else {
                this.mAvatarUriList.put(i, new AvatarUri());
                this.mMultiUploadFailNum.incrementAndGet();
            }
            if (this.mMultiUploadFailNum.get() + this.mMultiUploadSuccessNum.get() == this.mFileNameList.size()) {
                if (this.mMultiUploadFailNum.get() == this.mFileNameList.size()) {
                    sendEventToJsBridge("image", buildObject(0, "", ""));
                } else {
                    sendEventToJsBridge("image", buildMultiObject(this.mAvatarUriList));
                }
                Function0<Unit> function0 = this.mOnUploadFinishedListener;
                if (function0 != null) {
                    function0.invoke();
                }
                C2478309nR.LIZJ(this.mImageWidth);
            }
        }
    }

    private void sendCancelEventToJsBridge(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileCancel");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IESJsBridge iESJsBridge = this.mJsBridge;
        if (iESJsBridge != null) {
            iESJsBridge.LJ("H5_uploadFileCancel", jSONObject2);
        }
    }

    private void sendEventToJsBridge(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("args", jSONArray);
            jSONObject.put("msg", "H5_uploadFile");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IESJsBridge iESJsBridge = this.mJsBridge;
        if (iESJsBridge != null) {
            iESJsBridge.LJ("H5_uploadFile", jSONObject);
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
            c201964140s.LIZ(new AbstractC201966140u() { // from class: X.14Ty
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

    @Override // X.InterfaceC1051760dTa
    public void call(C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
        Context context;
        String string = JSONObjectProtectorUtils.getString(c1058910df7.LIZLLL, "type");
        this.mImageSource = "";
        if (TextUtils.equals("image", string)) {
            this.mImageSource = c1058910df7.LIZLLL.optString("source");
            this.mSkipImgBase64 = c1058910df7.LIZLLL.optBoolean("skip_img_base64", false);
            this.maxSelectNum = c1058910df7.LIZLLL.optInt("maxSelectNum", 1);
            this.isMultiSelect = c1058910df7.LIZLLL.optBoolean("isMultiSelect", false);
            this.shouldWithCamera = c1058910df7.LIZLLL.optBoolean("shouldWithCamera", false);
            this.mImageWidth = c1058910df7.LIZLLL.optInt("image_width", -1);
            this.mFrom = c1058910df7.LIZLLL.optString("from", "");
            long jOptLong = c1058910df7.LIZLLL.optLong("maxFileSize", Long.MAX_VALUE);
            this.originalImageMaxSize = jOptLong;
            if (jOptLong == 0) {
                this.originalImageMaxSize = Long.MAX_VALUE;
            }
            this.needBase64Response = c1058910df7.LIZLLL.optBoolean("needBase64Response", false);
            this.needCrop = c1058910df7.LIZLLL.optBoolean("isNeedCut", false);
            this.minImageWidth = c1058910df7.LIZLLL.optInt("minImageWidth");
            this.minImageHeight = c1058910df7.LIZLLL.optInt("minImageHeight");
            int iOptInt = c1058910df7.LIZLLL.optInt("cropRatioWidth", 0);
            int iOptInt2 = c1058910df7.LIZLLL.optInt("cropRatioHeight", 0);
            if (iOptInt * iOptInt2 != 0) {
                this.rectRatio = (iOptInt2 * 1.0f) / iOptInt;
            }
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null) {
                context = getContext(weakReference.get());
            } else {
                context = null;
            }
            if (C142C.LIZ(context, this)) {
                jSONObject.put("code", 1);
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
                    String strLIZIZ2 = C09N2.LIZIZ(str);
                    if (strLIZIZ2 != null && !strLIZIZ2.isEmpty()) {
                        C0XQ7.LJ();
                        C0XQ7.LIZ.LJIIJ().LJJZ(new WeakHandler((WeakHandler.IHandler) ListProtector.get(this.mIHandlerList, i2)), strLIZIZ, 4194304, C2478309nR.LIZIZ(strLIZIZ2, new C0VSJ(strLIZIZ2), this.mImageWidth), null);
                    }
                }
            }
        }
    }

    private void sendEventToJsBridge(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IESJsBridge iESJsBridge = this.mJsBridge;
        if (iESJsBridge != null) {
            iESJsBridge.LJ("H5_uploadFile", jSONObject2);
        }
    }

    private JSONObject buildObject(int i, String str, String str2) {
        String strLIZ;
        JSONObject jSONObject = new JSONObject();
        C15O7<String> c15o7CompressUploadImageTask = compressUploadImageTask();
        try {
            c15o7CompressUploadImageTask.LJIJJLI();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c15o7CompressUploadImageTask.LJIIL() != null) {
            try {
                C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                String strLJIIL = c15o7CompressUploadImageTask.LJIIL();
                c2137908Zd.getClass();
                strLIZ = C1796580wqu.LIZ(C2137908Zd.LJ(strLJIIL));
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                strLIZ = "";
            }
        } else {
            strLIZ = "";
        }
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("url", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str2);
            }
            if (!TextUtils.isEmpty(strLIZ)) {
                jSONObject.put("img_base64", strLIZ);
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
            C1233040iBy c1233040iBy = new C1233040iBy(activity);
            c1233040iBy.LIZJ(activity.getString(2131839204));
            c1233040iBy.LIZLLL();
            cancelMultiUpload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMultiUploadActivity$1(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                openChooseUploadActivity(activity);
                return;
            }
            if (Build.VERSION.SDK_INT >= 34 && iArr.length >= 3 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                openChooseUploadActivity(activity);
                return;
            }
            C1233040iBy c1233040iBy = new C1233040iBy(activity);
            c1233040iBy.LIZJ(activity.getString(2131839204));
            c1233040iBy.LIZLLL();
            sendCancelEventToJsBridge("image", CardStruct.IStatusCode.DEFAULT);
        }
    }

    @Override // X.InterfaceC342470Dbh
    public boolean onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int i3;
        if (i == 10003) {
            if (i2 != 0 && intent != null) {
                Context context = getContext(this.mContextRef.get());
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
                            C1389890mGx c1389890mGx = new C1389890mGx(this.mJsBridge.LIZ);
                            c1389890mGx.LJFF(2130970439);
                            c1389890mGx.LJIIIZ(2131839843);
                            c1389890mGx.LJIIJJI();
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
                    this.mUploadFileName = data.toString();
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
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LJIIJ().LJJZ(new WeakHandler(this), strLIZIZ, 4194304, this.mUploadFileName, null);
                    return true;
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(this.mJsBridge.LIZ);
                c1389890mGx2.LJFF(2130970439);
                c1389890mGx2.LJIIIZ(2131839843);
                c1389890mGx2.LJIIJJI();
                return true;
            }
            sendCancelEventToJsBridge("image", "1");
            return true;
        }
        if (i == 10004) {
            if (i2 != 0 && intent != null) {
                Context context2 = getContext(this.mContextRef.get());
                if (context2 == null) {
                    return true;
                }
                String strLIZ = C09N5.LIZ(context2, intent.getData());
                if (C2093608Ic.LJ(strLIZ)) {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(this.mJsBridge.LIZ);
                    c1389890mGx3.LJFF(2130970439);
                    c1389890mGx3.LJIIIZ(2131839843);
                    c1389890mGx3.LJIIJJI();
                    return true;
                }
                if (!new C0VSJ(strLIZ).exists()) {
                    C1389890mGx c1389890mGx4 = new C1389890mGx(this.mJsBridge.LIZ);
                    c1389890mGx4.LJFF(2130970439);
                    c1389890mGx4.LJIIIZ(2131839843);
                    c1389890mGx4.LJIIJJI();
                    return true;
                }
                this.mUploadFileName = strLIZ;
                String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "uri");
                String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "url");
                if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra) && !TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2)) {
                    sendEventToJsBridge("image", buildObject(1, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_H5UploadFileMethod_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra));
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
                C0XQ7.LJ();
                C0XQ7.LIZ.LJIIJ().LJJZ(new WeakHandler(this), strLIZIZ2, 4194304, this.mUploadFileName, null);
                return true;
            }
            sendCancelEventToJsBridge("image", "1");
        }
        return true;
    }
}
