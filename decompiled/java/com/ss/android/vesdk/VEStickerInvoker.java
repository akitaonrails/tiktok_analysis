package com.ss.android.vesdk;

import X.C1DOB;
import X.C1DOC;
import X.C20334714hV;
import X.C2188811AlT;
import X.C2484209oO;
import X.InterfaceC2255161DOo;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import com.ss.android.vesdk.jni.TEStikcerInterface;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public class VEStickerInvoker implements InterfaceC2255161DOo {
    public final TEInterface mNativeEditor;
    public final TEStikcerInterface mNativeStickerHandler;
    public int mStickerAnimationPreviewDuration = LivePreCreateNextRoomPlayer.ENABLE;
    public float mStickerAnimationPreviewFps = 30.0f;
    public final VEEditor mVEEditor;

    public int addInfoStickerWithBuffer() {
        int iLIZIZ;
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "addInfoStickerWithBuffer...");
                iLIZIZ = this.mNativeStickerHandler.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLIZIZ;
    }

    @Override // X.InterfaceC2255161DOo
    public void clearNativeFromSticker() {
        this.mNativeStickerHandler.LIZ = 0L;
    }

    public int getTextLimitCount() {
        return this.mNativeStickerHandler.LJIL();
    }

    public int stopStickerAnimationPreview() {
        int iLJFF;
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "stopStickerAnimationPreview");
                iLJFF = this.mNativeStickerHandler.LJFF(false, 0, 0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJFF;
    }

    public VEStickerInvoker(VEEditor vEEditor) {
        this.mVEEditor = vEEditor;
        TEInterface tEInterface = vEEditor.LLJLLIL;
        this.mNativeEditor = tEInterface;
        this.mNativeStickerHandler = new TEStikcerInterface(tEInterface.getNativeHandler());
    }

    public int addEmojiSticker(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addEmojiSticker... utf8Code: ");
        sbLIZ.append(str);
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LIZJ("VEEditor_VEStickerInvoker", "addEmojiSticker error, utf8Code is null");
            return -100;
        }
        return addInfoSticker(str, new String[]{"lv_emoji"});
    }

    public int addTextSticker(String str) {
        int iAddInfoSticker;
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LIZJ("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            return -100;
        }
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "addTextSticker...");
                iAddInfoSticker = addInfoSticker(str, new String[]{"lv_new_text"});
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iAddInfoSticker;
    }

    public int beginInfoStickerPin(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin beginInfoStickerPin... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLIZLLL = this.mNativeStickerHandler.LIZLLL(i);
                if (iLIZLLL < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin beginInfoStickerPin... faild ret:");
                    sbLIZ2.append(iLIZLLL);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iLIZLLL;
                }
                return iLIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int cancelInfoStickerPin(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin cancelInfoStickerPin... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLJ = this.mNativeStickerHandler.LJ(i);
                if (iLJ < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin cancelInfoStickerPin... faild ret:");
                    sbLIZ2.append(iLJ);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iLJ;
                }
                return iLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int deleteSticker(int i) {
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", "deleteSticker...");
        if (i < 0) {
            return -100;
        }
        return this.mNativeStickerHandler.LJI(i);
    }

    public float[] getInfoStickerBoundingBox(int i) {
        float[] fArrLJIIIIZZ;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getInfoStickerBoundingBox... index: ");
                sbLIZ.append(i);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i >= 0) {
                    fArrLJIIIIZZ = this.mNativeStickerHandler.LJIIIIZZ(i, true);
                } else {
                    throw new VEException(-100, "");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return fArrLJIIIIZZ;
    }

    public float[] getInfoStickerBoundingBoxWithoutRotate(int i) {
        float[] fArrLJIIIIZZ;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getInfoStickerBoundingBox... index:");
                sbLIZ.append(i);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i >= 0) {
                    fArrLJIIIIZZ = this.mNativeStickerHandler.LJIIIIZZ(i, false);
                } else {
                    throw new VEException(-100, "");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return fArrLJIIIIZZ;
    }

    public boolean getInfoStickerIsDynamic(int i) {
        return this.mNativeStickerHandler.LJIIJ(i);
    }

    public int getInfoStickerPinState(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin getInfoStickerPinState... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLJIIL = this.mNativeStickerHandler.LJIIL(i);
                if (iLJIIL < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin getInfoStickerPinState... faild ret:");
                    sbLIZ2.append(iLJIIL);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iLJIIL;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("infoStickerPin getInfoStickerPinState... state:");
                sbLIZ3.append(iLJIIL);
                C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                return iLJIIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public float getInfoStickerRotate(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin getInfoStickerRotate... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100.0f;
                }
                float fLJIILJJIL = this.mNativeStickerHandler.LJIILJJIL(i);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("infoStickerPin getInfoStickerRotate... ret:");
                sbLIZ2.append(fLJIILJJIL);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                return fLJIILJJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public float getInfoStickerScale(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin getInfoStickerScale... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100.0f;
                }
                float fLJIILL = this.mNativeStickerHandler.LJIILL(i);
                if (fLJIILL < 0.0f) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin getInfoStickerScale... faild ret:");
                    sbLIZ2.append(fLJIILL);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return fLJIILL;
                }
                return fLJIILL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public String getInfoStickerTemplateParams(String str) {
        String strLJIIZILJ;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[getInfoStickerTemplateParams] path: ");
                sbLIZ.append(str);
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (str.trim().length() != 0) {
                    strLJIIZILJ = this.mNativeStickerHandler.LJIIZILJ(str);
                } else {
                    throw new VEException(-100, "empty or blank path");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strLJIIZILJ;
    }

    public boolean getInfoStickerVisible(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin getInfoStickerVisible... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return true;
                }
                boolean zLJIJ = this.mNativeStickerHandler.LJIJ(i);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("infoStickerPin  getInfoStickerVisible... ret:");
                sbLIZ2.append(zLJIJ);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                return zLJIJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int getTextContent(C1DOC c1doc) {
        return this.mNativeStickerHandler.LJIJJLI();
    }

    public boolean isInfoStickerAnimatable(int i) {
        boolean zLJJ;
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "isInfoStickerAnimatable...");
                zLJJ = this.mNativeStickerHandler.LJJ(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLJJ;
    }

    public int notifyHideKeyBoard(boolean z) {
        return this.mNativeStickerHandler.LJJI(z);
    }

    public int pauseEffectAudio(boolean z) {
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", "pauseEffectAudio");
        int iLJJIFFI = this.mNativeStickerHandler.LJJIFFI(z);
        if (iLJJIFFI != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pauseEffectAudio failed, ret = ");
            sbLIZ.append(iLJJIFFI);
            C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iLJJIFFI;
    }

    public int pauseInfoStickerAnimation(boolean z) {
        int iLJJII;
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "pauseInfoStickerAnimation...");
                iLJJII = this.mNativeStickerHandler.LJJII(z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJII;
    }

    public int removeInfoSticker(int i) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeInfoSticker... index: ");
                sbLIZ.append(i);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                this.mVEEditor.LLLLIIL.LIZIZ(1, i);
                return this.mNativeStickerHandler.LJJIII(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setEffectBgmEnable(boolean z) {
        int iLJJIIJZLJL = this.mNativeStickerHandler.LJJIIJZLJL(z);
        if (iLJJIIJZLJL != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setEffectBgmEnable failed, ret = ");
            sbLIZ.append(iLJJIIJZLJL);
            C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iLJJIIJZLJL;
    }

    public int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", "setInfoStickerBufferCallback...");
        return this.mNativeStickerHandler.LJJIJ(vEInfoStickerBufferListener);
    }

    public int setInfoStickerCallSync(boolean z) {
        int iLJJIJIIJI;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerCallSync... ");
                sbLIZ.append(z);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                iLJJIJIIJI = this.mNativeStickerHandler.LJJIJIIJI(z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJIJIIJI;
    }

    @Override // X.InterfaceC2255161DOo
    public int setInfoStickerRestoreMode(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin setInfoStickerRestoreMode... index:");
        sbLIZ.append(i);
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLJJIJIIJIL = this.mNativeStickerHandler.LJJIJIIJIL(i);
                if (iLJJIJIIJIL < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin setInfoStickerRestoreMode... faild ret:");
                    sbLIZ2.append(iLJJIJIIJIL);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iLJJIJIIJIL;
                }
                return iLJJIJIIJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setLanguage(String str) {
        return this.mNativeStickerHandler.LJJIJL(str);
    }

    public int setTextBitmapCallback(C1DOB c1dob) {
        return this.mNativeStickerHandler.LJJIZ();
    }

    public int stopInfoStickerPin(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin stopInfoStickerPin... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLJJJ = this.mNativeStickerHandler.LJJJ(i);
                if (iLJJJ < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin stopInfoStickerPin... faild ret:");
                    sbLIZ2.append(iLJJJ);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iLJJJ;
                }
                return iLJJJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public String getInfoStickerTemplateParams(int i) {
        String strLJIILLIIL;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getInfoStickerTemplateParams... index: ");
                sbLIZ.append(i);
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i >= 0) {
                    strLJIILLIIL = this.mNativeStickerHandler.LJIILLIIL(i);
                } else {
                    throw new VEException(-100, "");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strLJIILLIIL;
    }

    public int addInfoSticker(String str, String[] strArr) {
        int iLIZ;
        int i;
        C2484209oO.LJI("VEEditor_VEStickerInvoker", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        synchronized (this.mVEEditor) {
            try {
                iLIZ = this.mNativeStickerHandler.LIZ(str, strArr);
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.mVEEditor.LLLLIIL.LIZ(1, iLIZ, new C20334714hV());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addInfoSticker success with index ");
        sbLIZ.append(iLIZ);
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (iLIZ >= 0) {
                i = 0;
            } else {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            b.LIZ("vesdk_event_editor_info_sticker", "business", jSONObject);
            return iLIZ;
        } catch (JSONException e) {
            return iLIZ;
        }
    }

    public int addInfoStickerOrEmoji(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addInfoStickerOrEmoji... path: ");
        sbLIZ.append(str);
        sbLIZ.append(", utf8Code: ");
        sbLIZ.append(str2);
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            return addEmojiSticker(str2);
        }
        return addInfoSticker(str, new String[]{"default"});
    }

    public int addInfoStickerTemplate(String str, String str2) {
        int iLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addInfoStickerTemplate ... path : ");
        sbLIZ.append(str);
        sbLIZ.append(" params: ");
        sbLIZ.append(str2);
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        int i = 0;
        String[] strArr = {"lv_info_sticker_template", str2};
        synchronized (this.mVEEditor) {
            try {
                iLIZ = this.mNativeStickerHandler.LIZ(str, strArr);
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.mVEEditor.LLLLIIL.LIZ(1, iLIZ, new C20334714hV());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addInfoStickerTemplate success with index ");
        sbLIZ2.append(iLIZ);
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (iLIZ < 0) {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            b.LIZ("vesdk_event_editor_info_sticker", "business", jSONObject);
            return iLIZ;
        } catch (JSONException e) {
            return iLIZ;
        }
    }

    public int addTextStickerWithInitInfo(String str, String str2) {
        int iAddInfoStickerWithInitInfo;
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LIZJ("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            return -100;
        }
        if (TextUtils.isEmpty(str2)) {
            C2484209oO.LIZJ("VEEditor_VEStickerInvoker", "addTextSticker error, initInfoJson is null");
            return -100;
        }
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "addTextSticker...");
                iAddInfoStickerWithInitInfo = addInfoStickerWithInitInfo(str, new String[]{"lv_new_text"}, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iAddInfoStickerWithInitInfo;
    }

    public int enableStickerAnimationPreview(int i, boolean z) {
        int iLJII;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enableStickerAnimationPreview index:");
                sbLIZ.append(i);
                sbLIZ.append(", enable:");
                sbLIZ.append(z);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                iLJII = this.mNativeStickerHandler.LJII(i, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJII;
    }

    public int enableStickerResourceLoadSync(int i, boolean z) {
        return this.mNativeEditor.setFilterParam(i, "effect sync load resource", String.valueOf(z));
    }

    public int forceUpdateInfoSticker(int i, boolean z) {
        String str;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("forceUpdateInfoSticker... index: ");
                sbLIZ.append(i);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                TEInterface tEInterface = this.mNativeEditor;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                return tEInterface.setFilterParam(i, "entity data force update", str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int getInfoStickerFlip(int i, boolean[] zArr) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "getInfoStickerFlip...");
                if (i >= 0 && zArr.length == 2) {
                    return this.mNativeStickerHandler.LJIIIZ(i, zArr);
                }
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int getInfoStickerPinData(int i, ByteBuffer[] byteBufferArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin getInfoStickerPinData... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLJIIJJI = this.mNativeStickerHandler.LJIIJJI(i, byteBufferArr);
                if (iLJIIJJI < 0) {
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinData... faild ");
                    return iLJIIJJI;
                }
                return iLJIIJJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int getInfoStickerPosition(int i, float[] fArr) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "getInfoStickerPosition...");
                if (i >= 0 && fArr.length == 2) {
                    return this.mNativeStickerHandler.LJIILIIL(i, fArr);
                }
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int getSrtInfoStickerInitPosition(int i, float[] fArr) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEStickerInvoker", "getSrtInfoStickerInitPosition...");
                if (i >= 0 && fArr.length == 2) {
                    return this.mNativeStickerHandler.LJIJI(i, fArr);
                }
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int restoreInfoStickerPinWithData(int i, ByteBuffer byteBuffer) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin setInfoStickerPinWithFile... index:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLJJIIJ = this.mNativeStickerHandler.LJJIIJ(i, byteBuffer);
                if (iLJJIIJ < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin setInfoStickerPinWithFile... faild ret:");
                    sbLIZ2.append(iLJJIIJ);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iLJJIIJ;
                }
                return iLJJIIJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2255161DOo
    public int setInfoStickerAlpha(int i, float f) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerAlpha... index: ");
                sbLIZ.append(i);
                sbLIZ.append("alpha: ");
                sbLIZ.append(f);
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity alpha", String.valueOf(f));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInfoStickerLayer(int i, int i2) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerLayer... index: ");
                sbLIZ.append(i);
                sbLIZ.append("layer: ");
                sbLIZ.append(i2);
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity layer", String.valueOf(i2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInfoStickerRotation(int i, float f) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerRotation... index: ");
                sbLIZ.append(i);
                sbLIZ.append("degree: ");
                sbLIZ.append(f);
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity rotation", String.valueOf(f));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInfoStickerScale(int i, float f) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerScale... index: ");
                sbLIZ.append(i);
                sbLIZ.append("scale: ");
                sbLIZ.append(f);
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity scale x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity scale y", String.valueOf(f));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public float setInfoStickerScaleSync(int i, float f) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerScaleSync... index: ");
                sbLIZ.append(i);
                sbLIZ.append("scale: ");
                sbLIZ.append(f);
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100.0f;
                }
                return this.mNativeStickerHandler.LJJIJIL(f, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInfoStickerTemplateParams(int i, String str) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerTemplateParams... index: ");
                sbLIZ.append(i);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity template param", str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInfoStickerVisible(int i, boolean z) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerVisible... index: ");
                sbLIZ.append(i);
                sbLIZ.append(" visible: ");
                sbLIZ.append(z);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity visible", String.valueOf(z));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setSrtColor(int i, int i2) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", "setSrtColor");
                if (i < 0) {
                    return -100;
                }
                C2484209oO.LIZJ("VEEditor_VEStickerInvoker", "");
                int i3 = (i2 >>> 24) & 255;
                int i4 = (i2 >>> 16) & 255;
                int i5 = (i2 >>> 8) & 255;
                int i6 = i2 & 255;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aa=");
                sbLIZ.append(i3);
                sbLIZ.append(", rr=");
                sbLIZ.append(i4);
                sbLIZ.append(", gg=");
                sbLIZ.append(i5);
                sbLIZ.append(", bb=");
                sbLIZ.append(i6);
                C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                float f = i3 * 0.003921569f;
                float f2 = i4 * 0.003921569f;
                float f3 = i5 * 0.003921569f;
                float f4 = i6 * 0.003921569f;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("a=");
                sbLIZ2.append(f);
                sbLIZ2.append(", r=");
                sbLIZ2.append(f2);
                sbLIZ2.append(", g=");
                sbLIZ2.append(f3);
                sbLIZ2.append(", b=");
                sbLIZ2.append(f4);
                C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                return this.mNativeEditor.setFilterParam(i, "entity srt color a", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity srt color r", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i, "entity srt color g", String.valueOf(f3)) + this.mNativeEditor.setFilterParam(i, "entity srt color b", String.valueOf(f4));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setSrtFont(int i, String str) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", "setSrtFont");
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity srt font", str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setSrtManipulateState(int i, boolean z) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", "setSrtManipulateState");
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity srt manipulate state", String.valueOf(z));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setStickerAnimator(int i, VEStickerAnimator vEStickerAnimator) {
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", "addAnimator...");
        if (i >= 0 && vEStickerAnimator != null) {
            int iLJIJJ = this.mNativeStickerHandler.LJIJJ(i);
            if (iLJIJJ < 0) {
                return iLJIJJ;
            }
            return this.mNativeEditor.setFilterParam(iLJIJJ, "animator", vEStickerAnimator);
        }
        return -100;
    }

    public int setStickerPinArea(int i, VEStickerPinAreaParam vEStickerPinAreaParam) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infoStickerPin, setStickerPinArea, index: ");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                if (i < 0) {
                    return -100;
                }
                int iLJJIL = this.mNativeStickerHandler.LJJIL(i, vEStickerPinAreaParam);
                if (iLJJIL < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("infoStickerPin, setStickerPinArea, fail, ret: ");
                    sbLIZ2.append(iLJJIL);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                }
                return iLJJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int startStickerAnimationPreview(int i, int i2) {
        int iLJFF;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startStickerAnimationPreview duration:");
                sbLIZ.append(i);
                sbLIZ.append(", mode:");
                sbLIZ.append(i2);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                this.mStickerAnimationPreviewDuration = i;
                iLJFF = this.mNativeStickerHandler.LJFF(true, i, i2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJFF;
    }

    public int updateTextSticker(int i, String str) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateTextSticker... index: ");
                sbLIZ.append(i);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeStickerHandler.LJJJI(i, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int addInfoStickerWithInitInfo(String str, String[] strArr, String str2) {
        int length;
        int iLIZ;
        C2484209oO.LJI("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo ...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        LinkedList linkedList = new LinkedList();
        int i = 0;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        int iMax = Math.max(5, length);
        for (int i2 = 0; i2 < iMax; i2++) {
            if (i2 < length) {
                linkedList.add(strArr[i2]);
            } else {
                linkedList.add("");
            }
        }
        linkedList.add(4, str2);
        String[] strArr2 = (String[]) linkedList.toArray(new String[0]);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addInfoStickerWithInitInfo ... params: ");
        sbLIZ.append(linkedList.toString());
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mVEEditor) {
            try {
                iLIZ = this.mNativeStickerHandler.LIZ(str, strArr2);
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.mVEEditor.LLLLIIL.LIZ(1, iLIZ, new C20334714hV());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addInfoStickerWithInitInfo success with index ");
        sbLIZ2.append(iLIZ);
        C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (iLIZ < 0) {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            b.LIZ("vesdk_event_editor_info_sticker", "business", jSONObject);
            return iLIZ;
        } catch (JSONException e) {
            return iLIZ;
        }
    }

    public int setEffectFontPath(int i, String str, int i2) {
        int iLJJIIZ;
        synchronized (this.mVEEditor) {
            try {
                iLJJIIZ = this.mNativeStickerHandler.LJJIIZ(i2, str);
                if (iLJJIIZ != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setEffectFontPath failed, ret = ");
                    sbLIZ.append(iLJJIIZ);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.mNativeEditor.setFilterParam(i, "effect font path", str);
                TEInterface tEInterface = this.mNativeEditor;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i2);
                sbLIZ2.append("");
                tEInterface.setFilterParam(i, "effect face index", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJIIZ;
    }

    public int setInfoStickerFlip(int i, boolean z, boolean z2) {
        String str;
        String str2;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerFlip... index: ");
                sbLIZ.append(i);
                sbLIZ.append("flipX: ");
                sbLIZ.append(z);
                sbLIZ.append("flipY: ");
                sbLIZ.append(z2);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setInfoStickerFlip... failed index is wrong : ");
                    sbLIZ2.append(i);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return -100;
                }
                TEInterface tEInterface = this.mNativeEditor;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                int filterParam = tEInterface.setFilterParam(i, "entity flip x", str);
                TEInterface tEInterface2 = this.mNativeEditor;
                if (z2) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                return filterParam + tEInterface2.setFilterParam(i, "entity flip y", str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInfoStickerPosition(int i, float f, float f2) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerPosition... index: ");
                sbLIZ.append(i);
                sbLIZ.append("offsetX: ");
                sbLIZ.append(f);
                sbLIZ.append("offsetY: ");
                sbLIZ.append(f2);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity position x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity position y", String.valueOf(f2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInfoStickerTime(int i, int i2, int i3) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInfoStickerTime... index: ");
                sbLIZ.append(i);
                sbLIZ.append("startTime: ");
                sbLIZ.append(i2);
                sbLIZ.append("endTime: ");
                sbLIZ.append(i3);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity start time", String.valueOf(i2)) + this.mNativeEditor.setFilterParam(i, "entity end time", String.valueOf(i3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setSrtInfo(int i, int i2, String str) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", "setSrtInfo");
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity audio start time", String.valueOf(i2)) + this.mNativeEditor.setFilterParam(i, "entity srt info", str) + this.mNativeEditor.setFilterParam(i, "entity srt", String.valueOf(true));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setSrtInitialPosition(int i, float f, float f2) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", "setSrtInitialPosition");
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity srt initial position x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity srt initial position y", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i, "entity srt first", String.valueOf(true));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int addImageSticker(String str, float f, float f2, float f3, float f4) {
        int iLIZ;
        C2484209oO.LJI("VEEditor_VEStickerInvoker", "addImageSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(0)};
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", str);
                jSONObject.put("width", f3);
                jSONObject.put("height", f4);
                b.LIZ("vesdk_event_editor_image_sticker", "behavior", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        synchronized (this.mVEEditor) {
            try {
                iLIZ = this.mNativeStickerHandler.LIZ(str, strArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLIZ;
    }

    public int addImageStickerWithRatio(String str, float f, float f2, float f3, float f4) {
        int iLIZ;
        C2484209oO.LJI("VEEditor_VEStickerInvoker", "addImageStickerWithRatio...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(1)};
        synchronized (this.mVEEditor) {
            try {
                iLIZ = this.mNativeStickerHandler.LIZ(str, strArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLIZ;
    }

    public int setEffectInputText(int i, String str, int i2, int i3, String str2) {
        int iLJJIIZI;
        synchronized (this.mVEEditor) {
            try {
                iLJJIIZI = this.mNativeStickerHandler.LJJIIZI(i2, i3, str, str2);
                if (iLJJIIZI != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setEffectInputText failed, ret = ");
                    sbLIZ.append(iLJJIIZI);
                    C2484209oO.LIZJ("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.mNativeEditor.setFilterParam(i, "effect inputtext", str);
                TEInterface tEInterface = this.mNativeEditor;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i2);
                sbLIZ2.append("");
                tEInterface.setFilterParam(i, "effect inputtext arg1", C2188811AlT.LIZIZ(sbLIZ2));
                TEInterface tEInterface2 = this.mNativeEditor;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(i3);
                sbLIZ3.append("");
                tEInterface2.setFilterParam(i, "effect inputtext arg2", C2188811AlT.LIZIZ(sbLIZ3));
                this.mNativeEditor.setFilterParam(i, "effect inputtext arg3", str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJIIZI;
    }

    public int setSrtAudioInfo(int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LIZ("VEEditor_VEStickerInvoker", "setSrtAudioInfo");
                if (i < 0) {
                    return -100;
                }
                return this.mNativeEditor.setFilterParam(i, "entity srt audio index", String.valueOf(i2)) + this.mNativeEditor.setFilterParam(i, "entity srt audio seqIn", String.valueOf(i3)) + this.mNativeEditor.setFilterParam(i, "entity srt audio trimIn", String.valueOf(i4)) + this.mNativeEditor.setFilterParam(i, "entity srt audio trimOut", String.valueOf(i5)) + this.mNativeEditor.setFilterParam(i, "entity srt audio cycle", String.valueOf(z));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int addSticker(String str, int i, int i2, float f, float f2, float f3, float f4) {
        return addSticker(str, i, i2, 0, i2 - i, f, f2, f3, f4);
    }

    public int addExtRes(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", "addSticker...");
        if (i <= i2 && i >= 0 && !TextUtils.isEmpty(str)) {
            return this.mNativeStickerHandler.LIZJ(new String[]{str}, new int[]{i}, new int[]{i2}, new int[]{i3}, new int[]{i4}, f3, f4, f, f2);
        }
        return -100;
    }

    public int addSticker(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        C2484209oO.LJIIIIZZ("VEEditor_VEStickerInvoker", "addSticker...");
        if (i <= i2 && i >= 0 && !TextUtils.isEmpty(str)) {
            return this.mNativeStickerHandler.LIZJ(new String[]{str}, new int[]{i}, new int[]{i2}, new int[]{i3}, new int[]{i4}, f3, f4, f, f2);
        }
        return -100;
    }

    public int setStickerAnimation(int i, boolean z, String str, int i2, String str2, int i3, String str3, int i4, int i5, int i6) {
        int iLJJIJLIJ;
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setStickerAnimation... index:");
                sbLIZ.append(i);
                sbLIZ.append(", loop:");
                sbLIZ.append(z);
                sbLIZ.append(", inPath:");
                sbLIZ.append(str);
                sbLIZ.append(", inDuration:");
                sbLIZ.append(i2);
                sbLIZ.append(", outPath:");
                sbLIZ.append(str2);
                sbLIZ.append(", outDuration:");
                sbLIZ.append(i3);
                C2484209oO.LJI("VEEditor_VEStickerInvoker", C2188811AlT.LIZIZ(sbLIZ));
                iLJJIJLIJ = this.mNativeStickerHandler.LJJIJLIJ(i, z, str, i2, str2, i3, str3, i4, i5, i6);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJIJLIJ;
    }
}
