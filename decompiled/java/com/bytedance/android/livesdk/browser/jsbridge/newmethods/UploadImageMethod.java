package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC1835360xrS;
import X.C08P1;
import X.C09CT;
import X.C0UO0;
import X.C0VSJ;
import X.C11NZ;
import X.C1500830p9t;
import X.C1500860p9w;
import X.C1515210pX5;
import X.C19487811Me;
import X.C19748512Ol;
import X.C1CC2;
import X.C20750116Hr;
import X.C2188811AlT;
import X.C2204771BQt;
import X.C470590Icr;
import X.C786410Ut5;
import X.InterfaceC1478005qU;
import X.InterfaceC420801kM;
import Y.AkS47S1000000_31;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadImageMethod;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridUploadImageJsbDisableUriSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class UploadImageMethod extends AbstractC1835360xrS<JSONObject, Result> {
    public InterfaceC420801kM LLILZIL;
    public JSONObject LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;

    @Override // X.AbstractC1835360xrS
    public final void LJIIIZ() {
        InterfaceC420801kM interfaceC420801kM = this.LLILZIL;
        if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
            return;
        }
        this.LLILZIL.dispose();
    }

    public static final class Result {

        @C09CT("imageList")
        public ImageResult[] imageList;

        public static final class ImageResult {

            @C09CT("path")
            public String path;

            @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
            public int status = 1;

            @C09CT("url")
            public String url;
        }

        public Result(ImageResult[] imageResultArr) {
            this.imageList = imageResultArr;
        }
    }

    @Override // X.AbstractC1835360xrS
    public final void LJII(JSONObject jSONObject, C2204771BQt c2204771BQt) {
        String string;
        final Result.ImageResult imageResult;
        final byte[] bArrDecode;
        final String strLIZIZ;
        JSONObject jSONObject2 = jSONObject;
        this.LLILZLL = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "params");
        this.LLIZ = JSONObjectProtectorUtils.getString(jSONObject2, "url");
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "imageList");
        String string2 = JSONObjectProtectorUtils.getString(jSONObject2, "type");
        this.LLIZLLLIL = 0;
        ArrayList arrayList = new ArrayList();
        Result.ImageResult[] imageResultArr = new Result.ImageResult[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                string = JSONArrayProtectorUtils.getString(jSONArray, i);
                imageResult = new Result.ImageResult();
                imageResult.path = string;
                imageResultArr[i] = imageResult;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (string2.equals("path")) {
                if (LiveHybridUploadImageJsbDisableUriSetting.INSTANCE.getValue()) {
                    LJFF();
                    return;
                }
                JSONObject jSONObject3 = new JSONObject(string);
                String string3 = JSONObjectProtectorUtils.getString(jSONObject3, "uri");
                bArrDecode = C08P1.LIZIZ(new C0VSJ(string3));
                strLIZIZ = JSONObjectProtectorUtils.getString(jSONObject3, "file_name");
                if (!TextUtils.isEmpty(string3)) {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("uri_path", string3);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    C1CC2.LJ("livesdk_hybrid_jsb_upload_image_uri_path", jSONObject4, new JSONObject(), new JSONObject());
                }
                TryCatchGuardChecker.doCheck(e);
            } else {
                bArrDecode = Base64.decode(string, 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("upload_photo_");
                sbLIZ.append(i);
                sbLIZ.append("_");
                sbLIZ.append(System.currentTimeMillis());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (bArrDecode != null) {
                arrayList.add(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.167X
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ c09aj) {
                        final UploadImageMethod uploadImageMethod = this.LIZ;
                        final byte[] bArr = bArrDecode;
                        final String str = strLIZIZ;
                        final UploadImageMethod.Result.ImageResult imageResult2 = imageResult;
                        uploadImageMethod.getClass();
                        C1C7U.LIZ("UploadImageMethod@6eb7.invoke$1L");
                        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                        C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.167W
                            @Override // java.lang.Runnable
                            public final void run() {
                                UploadImageMethod uploadImageMethod2 = uploadImageMethod;
                                C09AJ c09aj2 = c19482611Ke;
                                byte[] bArr2 = bArr;
                                String str2 = str;
                                UploadImageMethod.Result.ImageResult imageResult3 = imageResult2;
                                uploadImageMethod2.getClass();
                                C1C7U.LIZ("UploadImageMethod@6eb7.invoke$1L$1L");
                                try {
                                    c09aj2.onNext(uploadImageMethod2.LJIIJ(uploadImageMethod2.LLIZ, bArr2, str2, imageResult3));
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    c09aj2.onError(e3);
                                }
                                C1C7U.LIZIZ("UploadImageMethod@6eb7.invoke$1L$1L");
                            }
                        });
                        C1C7U.LIZIZ("UploadImageMethod@6eb7.invoke$1L");
                    }
                }).LJJJJZI(new AkS47S1000000_31(string, 0)));
            }
        }
        C11NZ.LJJJJIZL(arrayList).LJJJ(C19487811Me.LIZ, true).LJIILIIL(new C0UO0()).LIZIZ(new C20750116Hr(this, imageResultArr, 0));
    }

    public final C470590Icr<UploadResult> LJIIJ(String str, byte[] bArr, String str2, Result.ImageResult imageResult) throws Exception {
        JSONObject jSONObject = this.LLILZLL;
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, str2));
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                builderBuildUpon.appendQueryParameter(next, String.valueOf(jSONObject.opt(next)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String string = builderBuildUpon.build().toString();
        C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
        ArrayList arrayList = new ArrayList(1);
        String strMimeType = multipartTypedOutput.mimeType();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = multipartTypedOutput.length();
        String strMd5Stub = multipartTypedOutput.md5Stub();
        c1515210pX5LIZLLL.getClass();
        C1500830p9t c1500830p9tLIZ = ((C1500860p9w) C1515210pX5.LJIIIIZZ(-1, string, arrayList, strMimeType, byteArray, length, strMd5Stub)).LIZ();
        String str3 = new String(c1500830p9tLIZ.LJ);
        if (c1500830p9tLIZ.LIZIZ == 200) {
            Gson gson = C19748512Ol.LIZIZ;
            C470590Icr<UploadResult> c470590Icr = (C470590Icr) GsonProtectorUtils.fromJson(gson, str3, new TypeToken<C470590Icr<UploadResult>>() { // from class: X.167a
            }.getType());
            try {
                if (c470590Icr.statusCode != 0) {
                    c470590Icr.LJ = (RequestError) GsonProtectorUtils.fromJson(gson, C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str3), "data")), RequestError.class);
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            UploadResult uploadResult = c470590Icr.data;
            if (uploadResult != null && !TextUtils.isEmpty(uploadResult.uri)) {
                imageResult.url = c470590Icr.data.uri;
                imageResult.status = 0;
            }
            return c470590Icr;
        }
        throw new Exception();
    }
}
