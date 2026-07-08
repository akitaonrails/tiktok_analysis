package com.ss.android.ttve.nativePort;

import X.C1AM2;
import X.C1AM3;
import X.C1AM4;
import X.C1AM5;
import X.C1AM6;
import X.C2177801ALa;
import X.C2177971ALr;
import X.C2178011ALv;
import X.C2178031ALx;
import X.C2178041ALy;
import X.C2178051ALz;
import X.C2188811AlT;
import X.C2484209oO;
import X.EnumC2177961ALq;
import X.InterfaceC21621119jV;
import X.InterfaceC2177811ALb;
import X.InterfaceC2177851ALf;
import X.InterfaceC2177981ALs;
import X.InterfaceC2177991ALt;
import X.InterfaceC2178021ALw;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.bachfaceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;
import com.ss.android.vesdk.faceinfo.VESkeletonInfo;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public class TEEffectCallback {
    public InterfaceC21621119jV mARTextBitmapCallback;
    public InterfaceC2177981ALs mARTextCallback;
    public InterfaceC2177981ALs mARTextLimitCountCallback;
    public List<C2178031ALx> mBachAlgorithmCallbacks;
    public C1AM2 mEffectAlgorithmCallback;
    public C1AM6 mFaceDetectListener;
    public C1AM3 mFaceInfoCallback;
    public C1AM5 mLandMarkDetectCallback;
    public byte[][] mResult;
    public InterfaceC2178021ALw mSkeletonDetectCallback;
    public C1AM4 mSmartBeautyListener;
    public IStickerRequestCallback mStickerRequestCallback;

    public void setOnSmartBeautyListener(C1AM4 c1am4) {
    }

    public void unregBachAlgorithmCallback() {
        this.mBachAlgorithmCallbacks = null;
    }

    public void regBachAlgorithmCallback(List<C2178031ALx> list) {
        this.mBachAlgorithmCallbacks = list;
    }

    public void setARTextBitmapCallback(InterfaceC21621119jV interfaceC21621119jV) {
        this.mARTextBitmapCallback = interfaceC21621119jV;
    }

    public void setARTextLimitCountCallback(InterfaceC2177981ALs interfaceC2177981ALs) {
        this.mARTextLimitCountCallback = interfaceC2177981ALs;
    }

    public void setARTextParagraphContentCallback(InterfaceC2177981ALs interfaceC2177981ALs) {
        this.mARTextCallback = interfaceC2177981ALs;
    }

    public void setEffectAlgorithmInfoCallback(C1AM2 c1am2) {
        this.mEffectAlgorithmCallback = c1am2;
    }

    public void setFaceDetectListener(C1AM6 c1am6) {
        this.mFaceDetectListener = c1am6;
    }

    public void setFaceInfoCallback(C1AM3 c1am3) {
        this.mFaceInfoCallback = c1am3;
    }

    public void setLandmarkDetectListener(C1AM5 c1am5) {
        this.mLandMarkDetectCallback = c1am5;
    }

    public void setSkeletonDetectCallback(InterfaceC2178021ALw interfaceC2178021ALw) {
        this.mSkeletonDetectCallback = interfaceC2178021ALw;
    }

    public void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        this.mStickerRequestCallback = iStickerRequestCallback;
    }

    public void nativeCallback(byte[][] bArr, int i) {
        InterfaceC2177811ALb interfaceC2177811ALb;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 5:
                            if (this.mARTextCallback == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "artext content listener is null");
                            } else if (bArr != null && bArr.length != 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("artext param.length is ");
                                sbLIZ.append(bArr.length);
                                C2484209oO.LJI("TEEffectCallback", C2188811AlT.LIZIZ(sbLIZ));
                                String[] strArr = new String[bArr.length];
                                while (i2 < bArr.length) {
                                    strArr[i2] = new TEParcelWrapper(bArr[i2]).readString();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("artext param[");
                                    sbLIZ2.append(i2);
                                    sbLIZ2.append("] ");
                                    sbLIZ2.append(strArr[i2]);
                                    sbLIZ2.append(", ");
                                    sbLIZ2.append(bArr[i2].length);
                                    C2484209oO.LJI("TEEffectCallback", C2188811AlT.LIZIZ(sbLIZ2));
                                    i2++;
                                }
                                this.mARTextCallback.LIZIZ(strArr);
                            } else {
                                C2484209oO.LIZJ("TEEffectCallback", "artext param is null");
                            }
                            break;
                        case 6:
                            if (this.mStickerRequestCallback == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "sticker request callback listener is null");
                                break;
                            } else if (bArr != null) {
                                TEParcelWrapper tEParcelWrapper = new TEParcelWrapper(bArr[0]);
                                try {
                                    this.mStickerRequestCallback.onStickerRequested(tEParcelWrapper.readLong().longValue(), tEParcelWrapper.readBoolean());
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2484209oO.LIZLLL("TEEffectCallback", "sticker request callback threw exception", th);
                                    return;
                                }
                                break;
                            }
                            break;
                        case 7:
                            List<C2178031ALx> list = this.mBachAlgorithmCallbacks;
                            if (list == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "bach algorithm callbacks is null");
                            } else {
                                Iterator<C2178031ALx> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().LIZ == EnumC2177961ALq.AFTER_EFFECT) {
                                        TEParcelWrapper tEParcelWrapper2 = new TEParcelWrapper(bArr[0]);
                                        C2178011ALv c2178011ALv = new C2178011ALv();
                                        c2178011ALv.LIZ = tEParcelWrapper2;
                                        tEParcelWrapper2.readInt();
                                        c2178011ALv.LIZ.readFloat();
                                        c2178011ALv.LIZ.readFloat();
                                        c2178011ALv.LIZ.readFloat();
                                        c2178011ALv.LIZ.readFloat();
                                        c2178011ALv.LIZ.readFloat();
                                        c2178011ALv.LIZ.readFloat();
                                        break;
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (this.mEffectAlgorithmCallback == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "effect algorithm listener is null");
                                break;
                            } else if (bArr != null) {
                                TEParcelWrapper tEParcelWrapper3 = new TEParcelWrapper(bArr[0]);
                                tEParcelWrapper3.readFloat();
                                int i3 = tEParcelWrapper3.readInt();
                                SparseArray sparseArray = new SparseArray();
                                while (i2 < i3) {
                                    sparseArray.put((int) tEParcelWrapper3.readLong().longValue(), Long.valueOf(tEParcelWrapper3.readLong().longValue()));
                                    i2++;
                                }
                                this.mEffectAlgorithmCallback.LIZ();
                                break;
                            }
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            InterfaceC2178021ALw interfaceC2178021ALw = this.mSkeletonDetectCallback;
                            if (interfaceC2178021ALw != null) {
                                interfaceC2178021ALw.LIZ(VESkeletonInfo.convert(bArr));
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            if (this.mARTextLimitCountCallback == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "artext limit callback is null");
                            } else if (bArr == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "artext limit param is null");
                            } else {
                                this.mARTextLimitCountCallback.LIZ(new TEParcelWrapper(bArr[0]).readInt());
                            }
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            List<C2178031ALx> list2 = this.mBachAlgorithmCallbacks;
                            if (list2 == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "bach algorithm callbacks is null");
                            } else {
                                Iterator<C2178031ALx> it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (it3.next().LIZ == EnumC2177961ALq.FACE) {
                                        TEParcelWrapper tEParcelWrapper4 = new TEParcelWrapper(bArr[0]);
                                        VEFaceDetectInfo vEFaceDetectInfo = new VEFaceDetectInfo();
                                        vEFaceDetectInfo.setParcelWrapper(tEParcelWrapper4);
                                        vEFaceDetectInfo.readFromParcel();
                                        break;
                                    }
                                }
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            List<C2178031ALx> list3 = this.mBachAlgorithmCallbacks;
                            if (list3 == null) {
                                C2484209oO.LIZJ("TEEffectCallback", "bach algorithm callbacks is null");
                            } else {
                                Iterator<C2178031ALx> it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    if (it4.next().LIZ == EnumC2177961ALq.EXPRESSION_DETECT) {
                                        TEParcelWrapper tEParcelWrapper5 = new TEParcelWrapper(bArr[0]);
                                        VEFaceAttributeInfo vEFaceAttributeInfo = new VEFaceAttributeInfo();
                                        vEFaceAttributeInfo.setParcelWrapper(tEParcelWrapper5);
                                        vEFaceAttributeInfo.readFromParcel();
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                    return;
                }
                if (this.mLandMarkDetectCallback == null) {
                    C2484209oO.LIZJ("TEEffectCallback", "detect listener is null");
                    return;
                } else {
                    if (bArr == null) {
                        return;
                    }
                    this.mLandMarkDetectCallback.LIZ(new TEParcelWrapper(bArr[0]).readBoolean());
                    return;
                }
            }
            if (this.mFaceDetectListener == null) {
                C2484209oO.LIZJ("TEEffectCallback", "detect listener is null");
                return;
            }
            if (bArr == null) {
                return;
            }
            TEParcelWrapper tEParcelWrapper6 = new TEParcelWrapper(bArr[0]);
            tEParcelWrapper6.readInt();
            int i4 = tEParcelWrapper6.readInt();
            InterfaceC2177851ALf interfaceC2177851ALf = ((C2178051ALz) this.mFaceDetectListener).LIZ;
            if (interfaceC2177851ALf == null || (interfaceC2177811ALb = ((C2177801ALa) interfaceC2177851ALf).LIZ) == null) {
                return;
            }
            interfaceC2177811ALb.onResult(i4);
            return;
        }
        C1AM3 c1am3 = this.mFaceInfoCallback;
        if (c1am3 == null) {
            C2484209oO.LIZJ("TEEffectCallback", "face info callback is null");
            return;
        }
        C2178041ALy c2178041ALy = (C2178041ALy) c1am3;
        if (bArr == null) {
            Iterator it5 = ((CopyOnWriteArrayList) c2178041ALy.LIZ.LLILLL).iterator();
            while (it5.hasNext()) {
                ((InterfaceC2177991ALt) it5.next()).LIZ(null, null);
            }
            return;
        }
        com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo vEFaceAttributeInfo2 = new com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo();
        vEFaceAttributeInfo2.setParcelWrapper(new TEParcelWrapper(bArr[0]));
        vEFaceAttributeInfo2.readFromParcel();
        com.ss.android.vesdk.faceinfo.VEFaceDetectInfo vEFaceDetectInfo2 = new com.ss.android.vesdk.faceinfo.VEFaceDetectInfo();
        vEFaceDetectInfo2.setParcelWrapper(new TEParcelWrapper(bArr[1]));
        vEFaceDetectInfo2.readFromParcel();
        Iterator it6 = ((CopyOnWriteArrayList) c2178041ALy.LIZ.LLILLL).iterator();
        while (it6.hasNext()) {
            ((InterfaceC2177991ALt) it6.next()).LIZ(vEFaceAttributeInfo2, vEFaceDetectInfo2);
        }
    }

    public ByteBuffer nativeCallbackWithResult(byte[][] bArr, int i) {
        if (i == 4) {
            if (this.mARTextBitmapCallback == null) {
                C2484209oO.LIZJ("TEEffectCallback", "artext bitmap listener is null");
                return null;
            }
            if (bArr == null) {
                return null;
            }
            boolean z = false;
            TEParcelWrapper tEParcelWrapper = new TEParcelWrapper(bArr[0]);
            BefTextLayout befTextLayout = new BefTextLayout();
            befTextLayout.setCharSize(tEParcelWrapper.readInt());
            befTextLayout.setLetterSpacing(tEParcelWrapper.readInt());
            befTextLayout.setLineWidth(tEParcelWrapper.readInt());
            befTextLayout.setLineHeight(tEParcelWrapper.readFloat());
            befTextLayout.setTextAlign(tEParcelWrapper.readInt());
            befTextLayout.setTextIndent(tEParcelWrapper.readInt());
            befTextLayout.setSplit(tEParcelWrapper.readInt());
            befTextLayout.setLineCount(tEParcelWrapper.readInt());
            befTextLayout.setTextColor(tEParcelWrapper.readInt());
            befTextLayout.setBackColor(tEParcelWrapper.readInt());
            if (1 == tEParcelWrapper.readInt()) {
                z = true;
            }
            befTextLayout.setPlaceholder(z);
            befTextLayout.setFamilyName(tEParcelWrapper.readString());
            String string = tEParcelWrapper.readString();
            if (string == null) {
                C2484209oO.LIZJ("TEEffectCallback", "Read content failed.");
                return null;
            }
            BefTextLayoutResult befTextLayoutResultLIZ = this.mARTextBitmapCallback.LIZ(string, befTextLayout);
            if (befTextLayoutResultLIZ != null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(befTextLayoutResultLIZ.getBitmap().getByteCount());
                befTextLayoutResultLIZ.getBitmap().copyPixelsToBuffer(byteBufferAllocate);
                C2177971ALr c2177971ALr = new C2177971ALr(befTextLayoutResultLIZ.getBitmap().getByteCount() + 16);
                c2177971ALr.LIZ(befTextLayoutResultLIZ.getWidth());
                c2177971ALr.LIZ(befTextLayoutResultLIZ.getHeight());
                c2177971ALr.LIZ(befTextLayoutResultLIZ.getLineCount());
                c2177971ALr.LIZ(befTextLayoutResultLIZ.getBitmap().getByteCount());
                c2177971ALr.LIZ.put(byteBufferAllocate.array());
                c2177971ALr.LIZ.rewind();
                return c2177971ALr.LIZ;
            }
        }
        return null;
    }
}
