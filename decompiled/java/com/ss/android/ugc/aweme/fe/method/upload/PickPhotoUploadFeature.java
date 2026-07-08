package com.ss.android.ugc.aweme.fe.method.upload;

import X.C098200Yq;
import X.C09N1;
import X.C09N2;
import X.C0VSJ;
import X.C0WZX;
import X.C0XI4;
import X.C0XIR;
import X.C0XQ7;
import X.C1233040iBy;
import X.C1389890mGx;
import X.C13LQ;
import X.C14U0;
import X.C15438062q;
import X.C15O7;
import X.C1701330uNH;
import X.C1796580wqu;
import X.C189200o6;
import X.C19771812Xk;
import X.C20272214Tw;
import X.C20276014Vi;
import X.C20276314Vl;
import X.C20277714Vz;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2137908Zd;
import X.C2204961BRm;
import X.C2259691DcV;
import X.C2344009Gk;
import X.C2431009fo;
import X.C2478309nR;
import X.C838410Wul;
import X.C844470XAv;
import X.InterfaceC19772112Xn;
import X.InterfaceC20276114Vj;
import X.InterfaceC20277514Vx;
import X.InterfaceC2385309Wh;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.o;

/* JADX INFO: loaded from: classes31.dex */
public final class PickPhotoUploadFeature implements WeakHandler.IHandler, C14U0, InterfaceC20277514Vx {
    public static final C20276314Vl Companion = new Object() { // from class: X.14Vl
    };
    public final WeakReference<Activity> contextRef;
    public boolean isCancelUpload;
    public boolean isMultiSelect;
    public HashMap<Integer, AvatarUri> mAvatarUriList;
    public List<String> mFileNameList;
    public List<WeakHandler.IHandler> mIHandlerList;
    public int mImageWidth;
    public AtomicInteger mMultiUploadFailNum;
    public AtomicInteger mMultiUploadSuccessNum;
    public Function0<Unit> mOnUploadFinishedListener;
    public final InterfaceC20276114Vj onFileSelected;
    public final C20277714Vz upLoadDialog;
    public int maxSelectNum = 1;
    public String mImageSource = "";
    public String mFrom = "";
    public boolean mNeedResize = true;
    public String mImageFilePath = "";
    public String mEncryptUrl = "";
    public String mNameSpace = "";

    @Override // X.InterfaceC20277514Vx
    public void cancelUpload() {
    }

    @Override // X.C14U0
    public void releaseListener() {
        this.mOnUploadFinishedListener = null;
    }

    @Override // X.C14U0
    public void cancelMultiUpload() {
        this.onFileSelected.LIZ(0, "uploadCancel");
        this.isCancelUpload = true;
    }

    private final C15O7<String> compressUploadImageTask(String str) {
        final o oVar = new o();
        try {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService().compressPhoto(str, 216, 384, new IAVProcessService.IProcessCallback<String>() { // from class: X.14Va
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
                public final void finish(String str2) {
                    oVar.LJ(str2);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            oVar.LJ(null);
        }
        return oVar.LIZ;
    }

    private final void prepareIHandler(int i) {
        this.mIHandlerList = new ArrayList();
        for (final int i2 = 0; i2 < i; i2++) {
            WeakHandler.IHandler iHandler = new WeakHandler.IHandler() { // from class: X.14Vc
                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    boolean z;
                    if (this.LL.isCancelUpload) {
                        return;
                    }
                    if (HandlerHook.getMessageObj(message.obj) instanceof C0XIR) {
                        Activity activity = this.LL.contextRef.get();
                        if (activity != null) {
                            C1233040iBy c1233040iBy = new C1233040iBy(activity);
                            c1233040iBy.LIZJ(((C0XIR) HandlerHook.getMessageObj(message.obj)).getErrorMsg());
                            c1233040iBy.LIZLLL();
                        }
                        AtomicInteger atomicInteger = this.LL.mMultiUploadFailNum;
                        if (atomicInteger == null) {
                            atomicInteger = null;
                        }
                        atomicInteger.incrementAndGet();
                    } else if (HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) {
                        AvatarUri avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj);
                        if (C1256140inE.LIZIZ(avatarUri.urlList)) {
                            HashMap<Integer, AvatarUri> map = this.LL.mAvatarUriList;
                            if (map == null) {
                                map = null;
                            }
                            map.put(Integer.valueOf(i2), avatarUri);
                            AtomicInteger atomicInteger2 = this.LL.mMultiUploadSuccessNum;
                            if (atomicInteger2 == null) {
                                atomicInteger2 = null;
                            }
                            atomicInteger2.incrementAndGet();
                        } else {
                            AtomicInteger atomicInteger3 = this.LL.mMultiUploadFailNum;
                            if (atomicInteger3 == null) {
                                atomicInteger3 = null;
                            }
                            atomicInteger3.incrementAndGet();
                        }
                    } else {
                        AtomicInteger atomicInteger4 = this.LL.mMultiUploadFailNum;
                        if (atomicInteger4 == null) {
                            atomicInteger4 = null;
                        }
                        atomicInteger4.incrementAndGet();
                    }
                    AtomicInteger atomicInteger5 = this.LL.mMultiUploadFailNum;
                    if (atomicInteger5 == null) {
                        atomicInteger5 = null;
                    }
                    int i3 = atomicInteger5.get();
                    AtomicInteger atomicInteger6 = this.LL.mMultiUploadSuccessNum;
                    if (atomicInteger6 == null) {
                        atomicInteger6 = null;
                    }
                    int i4 = i3 + atomicInteger6.get();
                    List<String> list = this.LL.mFileNameList;
                    if (list == null) {
                        list = null;
                    }
                    if (i4 == list.size()) {
                        List<String> list2 = this.LL.mFileNameList;
                        if (list2 == null) {
                            list2 = null;
                        }
                        int size = list2.size();
                        AtomicInteger atomicInteger7 = this.LL.mMultiUploadSuccessNum;
                        if (atomicInteger7 == null) {
                            atomicInteger7 = null;
                        }
                        int i5 = atomicInteger7.get();
                        if (i5 == 0) {
                            this.LL.onFileSelected.LIZ(0, "uploadFailedAll");
                            Function0<Unit> function0 = this.LL.mOnUploadFinishedListener;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            C2478309nR.LIZJ(this.LL.mImageWidth);
                            return;
                        }
                        if (i5 >= 0 && i5 < size) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            this.LL.onFileSelected.LIZ(0, "uploadFailed");
                            Function0<Unit> function02 = this.LL.mOnUploadFinishedListener;
                            if (function02 != null) {
                                function02.invoke();
                            }
                            C2478309nR.LIZJ(this.LL.mImageWidth);
                            return;
                        }
                        if (i5 != size) {
                            return;
                        }
                        ArrayList<C20276014Vi> arrayList = new ArrayList<>();
                        List<String> list3 = this.LL.mFileNameList;
                        if (list3 == null) {
                            list3 = null;
                        }
                        int size2 = list3.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            HashMap<Integer, AvatarUri> map2 = this.LL.mAvatarUriList;
                            if (map2 == null) {
                                map2 = null;
                            }
                            AvatarUri avatarUri2 = map2.get(Integer.valueOf(i6));
                            if (avatarUri2 != null && avatarUri2.urlList != null && (!avatarUri2.urlList.isEmpty())) {
                                String str = (String) ListProtector.get(avatarUri2.urlList, 0);
                                String str2 = avatarUri2.uri;
                                List<String> list4 = this.LL.mFileNameList;
                                if (list4 == null) {
                                    list4 = null;
                                }
                                arrayList.add(new C20276014Vi(str, str2, (String) ListProtector.get(list4, i6)));
                            }
                        }
                        int size3 = arrayList.size();
                        HashMap<Integer, AvatarUri> map3 = this.LL.mAvatarUriList;
                        if (map3 == null) {
                            map3 = null;
                        }
                        if (size3 == map3.size()) {
                            this.LL.uploadData(null, arrayList);
                            return;
                        }
                        this.LL.onFileSelected.LIZ(0, "uploadFailed");
                        Function0<Unit> function03 = this.LL.mOnUploadFinishedListener;
                        if (function03 != null) {
                            function03.invoke();
                        }
                        C2478309nR.LIZJ(this.LL.mImageWidth);
                    }
                }
            };
            List<WeakHandler.IHandler> list = this.mIHandlerList;
            if (list == null) {
                list = null;
            }
            list.add(iHandler);
        }
    }

    private final void startGalleryActivity(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_IMAGES") == 0) {
                C2431009fo.LIZLLL(activity);
                return;
            } else if (i >= 34 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                C2431009fo.LIZLLL(activity);
                return;
            } else {
                requestPermissions(activity, new AwS574S0100000_30(activity, 49));
                return;
            }
        }
        if (C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            C2431009fo.LIZLLL(activity);
        } else {
            requestPermissions(activity, new AwS574S0100000_30(activity, 50));
        }
    }

    private final void startMultiUploadActivity(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_IMAGES") == 0) {
                openImageChooseUpload(activity);
                return;
            } else if (i >= 34 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                openImageChooseUpload(activity);
                return;
            } else {
                requestPermissions(activity, new AwS431S0200000_30(this, activity, 15));
                return;
            }
        }
        if (C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            openImageChooseUpload(activity);
        } else {
            requestPermissions(activity, new AwS431S0200000_30(this, activity, 16));
        }
    }

    public final JSONArray buildObject(List<C20276014Vi> list) {
        String strLIZ;
        try {
            JSONArray jSONArray = new JSONArray();
            for (C20276014Vi c20276014Vi : list) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(c20276014Vi.LIZ)) {
                    jSONObject.put("url", c20276014Vi.LIZ);
                }
                if (!TextUtils.isEmpty(c20276014Vi.LIZIZ)) {
                    jSONObject.put("uri", c20276014Vi.LIZIZ);
                }
                C15O7<String> c15o7CompressUploadImageTask = compressUploadImageTask(c20276014Vi.LIZJ);
                try {
                    c15o7CompressUploadImageTask.LJIJJLI();
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                    String strLJIIL = c15o7CompressUploadImageTask.LJIIL();
                    if (strLJIIL == null) {
                        strLJIIL = "";
                    }
                    c2137908Zd.getClass();
                    strLIZ = C1796580wqu.LIZ(C2137908Zd.LJ(strLJIIL));
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    strLIZ = "";
                }
                jSONObject.put("base64", strLIZ);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) throws JSONException {
        this.upLoadDialog.LIZ();
        Activity activity = this.contextRef.get();
        if (activity != null && message != null) {
            if (HandlerHook.getMessageObj(message.obj) instanceof C0XIR) {
                C1233040iBy c1233040iBy = new C1233040iBy(activity);
                c1233040iBy.LIZJ(((C0XIR) HandlerHook.getMessageObj(message.obj)).getErrorMsg());
                c1233040iBy.LIZLLL();
                this.onFileSelected.LIZ(0, "uploadFailed");
                return;
            }
            if (HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj);
                if (avatarUri.urlList != null && (!r0.isEmpty())) {
                    uploadData(new C20276014Vi((String) ListProtector.get(avatarUri.urlList, 0), avatarUri.uri, this.mImageFilePath), new ArrayList<>());
                    return;
                } else {
                    this.onFileSelected.LIZ(0, "uploadFailed");
                    return;
                }
            }
            if (HandlerHook.getMessageObj(message.obj) instanceof TcmImage) {
                TcmImage tcmImage = (TcmImage) HandlerHook.getMessageObj(message.obj);
                String mid = tcmImage.getMid();
                if (mid != null && mid.length() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mid", tcmImage.getMid());
                    jSONArray.put(jSONObject);
                    this.onFileSelected.LIZJ(jSONArray);
                    return;
                }
                this.onFileSelected.LIZ(0, "uploadFailed");
                return;
            }
            this.onFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        this.onFileSelected.LIZ(0, "uploadFailed");
    }

    public final void openImageChooseUpload(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) ImageChooseUploadActivity.class);
        intent.putExtra("maxSelectNum", this.maxSelectNum);
        intent.putExtra("enter_from", this.mFrom);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_upload_PickPhotoUploadFeature_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intent);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.mFrom);
        C20684815ws.LJIILLIIL("enter_image_choose", c2344009Gk.LIZ);
        ImageChooseUploadActivity.LLJILLL = this;
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_upload_PickPhotoUploadFeature_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkROTfE1WS0IXP5jeqj3mw+Vkwc0TGUHai00vYnnww==", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_upload_PickPhotoUploadFeature_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_fe_method_upload_PickPhotoUploadFeature_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    private final void requestPermissions(final Activity activity, final Function0<Unit> function0) {
        String[] strArr;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String[] strArr2 = new String[2];
            strArr2[0] = "android.permission.READ_MEDIA_IMAGES";
            if (i >= 34) {
                str = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            } else {
                str = null;
            }
            strArr2[1] = str;
            strArr = (String[]) ((ArrayList) C13LQ.LJIJI(strArr2)).toArray(new String[0]);
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        C19771812Xk.LIZIZ(activity, TokenCert.Companion.with("bpea-pick_photo_upload_write_storage_permission"), strArr, new InterfaceC19772112Xn() { // from class: X.14Ve
            @Override // X.InterfaceC19772112Xn
            public final void LIZ(int[] iArr, String[] strArr3) {
                if (iArr.length != 0) {
                    if (iArr[0] == 0) {
                        function0.invoke();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                        function0.invoke();
                        return;
                    }
                    C1233040iBy c1233040iBy = new C1233040iBy(activity);
                    c1233040iBy.LIZJ(activity.getString(2131839204));
                    c1233040iBy.LIZLLL();
                    this.onFileSelected.LIZ(-1, "uploadFailed");
                }
            }
        });
    }

    @Override // X.InterfaceC20277514Vx
    public void handleJsInvoke(JSONObject jSONObject, boolean z) {
        this.maxSelectNum = jSONObject.optInt("maxSelectNum", 1);
        this.mImageSource = jSONObject.optString("source", "");
        this.isMultiSelect = jSONObject.optBoolean("isMultiSelect", false);
        this.mFrom = jSONObject.optString("from", "");
        this.mImageWidth = jSONObject.optInt("image_width", 216);
        this.mNeedResize = jSONObject.optBoolean("need_resize", true);
        this.mEncryptUrl = jSONObject.optString("encryptURL", "");
        this.mNameSpace = jSONObject.optString("nameSpace", "");
        if (this.contextRef.get() == null) {
            return;
        }
        if (this.isMultiSelect) {
            startMultiUploadActivity(this.contextRef.get());
        } else {
            startGalleryActivity(this.contextRef.get());
        }
    }

    @Override // X.C14U0
    public void multiUploadImages(List<C20272214Tw> list, Function0<Unit> function0) {
        Object c098200Yq;
        if (list == null) {
            return;
        }
        this.mOnUploadFinishedListener = function0;
        this.mMultiUploadSuccessNum = new AtomicInteger(0);
        this.mMultiUploadFailNum = new AtomicInteger(0);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C20272214Tw> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        this.mFileNameList = arrayList;
        this.mAvatarUriList = new HashMap<>();
        List<String> list2 = this.mFileNameList;
        if (list2 == null) {
            list2 = null;
        }
        prepareIHandler(list2.size());
        List<String> list3 = this.mFileNameList;
        if (list3 == null) {
            list3 = null;
        }
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            List<String> list4 = this.mFileNameList;
            if (list4 == null) {
                list4 = null;
            }
            String strLIZIZ = (String) ListProtector.get(list4, i);
            if (C2093608Ic.LJ(strLIZIZ)) {
                AtomicInteger atomicInteger = this.mMultiUploadFailNum;
                if (atomicInteger == null) {
                    atomicInteger = null;
                }
                atomicInteger.incrementAndGet();
            } else {
                try {
                    C844470XAv.LIZ.getClass();
                    c098200Yq = C09N1.LJFF(C844470XAv.LIZ(), UriProtector.parse(strLIZIZ));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                    C0XI4 c0xi4 = new C0XI4(Api.LIZIZ);
                    C0XQ7.LJ();
                    c0xi4.LJ("uid", C0XQ7.LIZ.LJIIJ().getCurUserId());
                    c0xi4.LJ("source", this.mImageSource);
                    String strLJFF = c0xi4.LJFF();
                    String strLIZIZ2 = C09N2.LIZIZ(strLIZIZ);
                    if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
                        C0XQ7.LJ();
                        AccountUserService accountUserServiceLJIIJ = C0XQ7.LIZ.LJIIJ();
                        List<WeakHandler.IHandler> list5 = this.mIHandlerList;
                        if (list5 == null) {
                            list5 = null;
                        }
                        WeakHandler weakHandler = new WeakHandler((WeakHandler.IHandler) ListProtector.get(list5, i));
                        if (this.mNeedResize) {
                            strLIZIZ = C2478309nR.LIZIZ(strLIZIZ2, new C0VSJ(strLIZIZ2), this.mImageWidth);
                        }
                        accountUserServiceLJIIJ.LJJZ(weakHandler, strLJFF, 8388608, strLIZIZ, null);
                    }
                } else {
                    AtomicInteger atomicInteger2 = this.mMultiUploadFailNum;
                    if (atomicInteger2 == null) {
                        atomicInteger2 = null;
                    }
                    atomicInteger2.incrementAndGet();
                }
            }
        }
    }

    public final void uploadData(final C20276014Vi c20276014Vi, final ArrayList<C20276014Vi> arrayList) {
        C15O7.LIZJ(new Callable() { // from class: X.14Vf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PickPhotoUploadFeature@bb2e.uploadData$1");
                C20276014Vi c20276014Vi2 = c20276014Vi;
                if (c20276014Vi2 != null) {
                    arrayList.add(c20276014Vi2);
                }
                JSONArray jSONArrayBuildObject = this.buildObject(arrayList);
                C1C7U.LIZIZ("PickPhotoUploadFeature@bb2e.uploadData$1");
                return jSONArrayBuildObject;
            }
        }).LJ(new InterfaceC2385309Wh() { // from class: X.14Vd
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<JSONArray> c15o7) {
                C1C7U.LIZ("PickPhotoUploadFeature@bb2e.uploadData$2");
                if (!this.LIZ.isCancelUpload) {
                    if (c15o7.LJIIL() != null) {
                        this.LIZ.onFileSelected.LIZJ(c15o7.LJIIL());
                    } else {
                        this.LIZ.onFileSelected.LIZ(0, "uploadFailed");
                    }
                    if (c20276014Vi == null) {
                        Function0<Unit> function0 = this.LIZ.mOnUploadFinishedListener;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        C2478309nR.LIZJ(this.LIZ.mImageWidth);
                    }
                }
                C1C7U.LIZIZ("PickPhotoUploadFeature@bb2e.uploadData$2");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public PickPhotoUploadFeature(WeakReference<Activity> weakReference, C20277714Vz c20277714Vz, InterfaceC20276114Vj interfaceC20276114Vj) {
        this.contextRef = weakReference;
        this.upLoadDialog = c20277714Vz;
        this.onFileSelected = interfaceC20276114Vj;
    }

    @Override // X.InterfaceC20277514Vx
    public boolean onActivityResult(int i, int i2, Intent intent) {
        Object c098200Yq;
        String strLJFF;
        if (i2 != 0 && intent != null) {
            Activity activity = this.contextRef.get();
            if (activity == null) {
                this.onFileSelected.LIZ(0, "uploadFailed");
                return true;
            }
            Uri data = intent.getData();
            if (data != null && !C2093608Ic.LJ(data.toString())) {
                this.mImageFilePath = data.toString();
                try {
                    C844470XAv.LIZ.getClass();
                    c098200Yq = C09N1.LJFF(C844470XAv.LIZ(), data);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                    if (this.mEncryptUrl.length() > 0) {
                        strLJFF = new C0XI4(Api.LIZ + '/' + this.mEncryptUrl).LJFF();
                    } else {
                        C0XI4 c0xi4 = new C0XI4(Api.LIZIZ);
                        C0XQ7.LJ();
                        c0xi4.LJ("uid", C0XQ7.LIZ.LJIIJ().getCurUserId());
                        c0xi4.LJ("source", this.mImageSource);
                        strLJFF = c0xi4.LJFF();
                    }
                    this.upLoadDialog.LIZIZ(activity);
                    if (this.mEncryptUrl.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C2259691DcV("NS", this.mNameSpace));
                        C0XQ7.LJ();
                        C0XQ7.LIZ.LJIIJ().LJJZZI(new WeakHandler(this), strLJFF, this.mImageFilePath, arrayList);
                        return true;
                    }
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LJIIJ().LJJZ(new WeakHandler(this), strLJFF, 8388608, this.mImageFilePath, null);
                    return true;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJFF(2130970439);
                c1389890mGx.LJIIIZ(2131839843);
                c1389890mGx.LJIIJJI();
                this.onFileSelected.LIZ(0, "uploadFailed");
                return true;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJFF(2130970439);
            c1389890mGx2.LJIIIZ(2131839843);
            c1389890mGx2.LJIIJJI();
            this.onFileSelected.LIZ(0, "uploadFailed");
            return true;
        }
        this.onFileSelected.LIZ(0, "uploadCancel");
        return true;
    }
}
