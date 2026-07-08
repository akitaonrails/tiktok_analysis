package com.ss.android.vesdk;

import X.C1E8B;
import X.C1E8C;
import X.C1E8D;
import com.ss.android.ttve.nativePort.TEImageALGCallbackInterface;
import com.ss.android.vesdk.algorithm.SceneDetectInfo;
import com.ss.android.vesdk.algorithm.VEImageSkeleton;
import com.ss.android.vesdk.algorithm.model.FAttribute;
import com.ss.android.vesdk.algorithm.model.FAttributeInfo;
import com.ss.android.vesdk.algorithm.model.FDetect;
import com.ss.android.vesdk.algorithm.model.FDetectInfo;
import com.ss.android.vesdk.algorithm.model.Skeleton;
import com.ss.android.vesdk.algorithm.model.SkeletonInfo;

/* JADX INFO: loaded from: classes36.dex */
public class VEImageALGCallbackInvoker {
    public TEImageALGCallbackInterface.FInfoCallback mFInfoCallback;
    public TEImageALGCallbackInterface mNativeBrushHandler;
    public TEImageALGCallbackInterface.SceneInfoCallback mSceneInfoCallback;
    public TEImageALGCallbackInterface.SkeletonInfoCallback mSkeletonInfoCallback;

    public void unRegSceneDetectCallback() {
        this.mNativeBrushHandler.unRegisterSceneDetectCallback();
        this.mSceneInfoCallback = null;
    }

    public void unRegSkeletonDetectCallback() {
        this.mNativeBrushHandler.unRegisterSkeletonDetectCallback();
        this.mSkeletonInfoCallback = null;
    }

    public void unregFaceInfoCallback() {
        this.mNativeBrushHandler.unRegisterFaceInfoUpload();
        this.mFInfoCallback = null;
    }

    public VEImageALGCallbackInvoker(VEImage vEImage) {
        throw null;
    }

    public void regFaceInfoCallback(C1E8B c1e8b) {
        if (this.mFInfoCallback == null) {
            this.mFInfoCallback = new TEImageALGCallbackInterface.FInfoCallback() { // from class: X.1ESY
                @Override // com.ss.android.ttve.nativePort.TEImageALGCallbackInterface.FInfoCallback
                public final void onResult(FAttributeInfo fAttributeInfo, FDetectInfo fDetectInfo) {
                    FAttribute[] info;
                    if (fAttributeInfo != null && (info = fAttributeInfo.getInfo()) != null) {
                        for (FAttribute fAttribute : info) {
                            new Object() { // from class: X.1ESZ
                            };
                            if (fAttribute != null) {
                                fAttribute.getAge();
                                fAttribute.getAngryScore();
                                fAttribute.getArousal();
                                fAttribute.getAngryScore();
                                fAttribute.getAttractive();
                                fAttribute.getBlurScore();
                                fAttribute.getBoyProb();
                                fAttribute.getExpProbs();
                                fAttribute.getExpType();
                                fAttribute.getHappyScore();
                                fAttribute.getIllumination();
                                fAttribute.getLipstickProb();
                                fAttribute.getMaskProb();
                                fAttribute.getMustacheProb();
                                fAttribute.getQuality();
                                fAttribute.getRealFaceProb();
                                fAttribute.getSadScore();
                                fAttribute.getSurpriseScore();
                                fAttribute.getValence();
                                fAttribute.getWearGlassProb();
                                fAttribute.getWearHatProb();
                                fAttribute.getWearSunglassProb();
                            }
                        }
                    }
                    if (fDetectInfo != null && fDetectInfo.getInfo() != null) {
                        fDetectInfo.getInfo();
                        for (FDetect fDetect : fDetectInfo.getInfo()) {
                            new Object() { // from class: X.1EP1
                            };
                            fDetect.getRect();
                            fDetect.getPoints();
                            fDetect.getAction();
                            fDetect.getED();
                            if (fDetect.getFaceExtInfo() != null) {
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                                fDetect.getFaceExtInfo();
                            }
                            fDetect.getFID();
                            fDetect.getPitch();
                            fDetect.getPointVisibility();
                            fDetect.getRoll();
                            fDetect.getYaw();
                            fDetect.getScore();
                            fDetect.getTrackCount();
                        }
                    }
                    throw null;
                }
            };
        }
        this.mNativeBrushHandler.registerFaceInfoUpload(this.mFInfoCallback);
    }

    public void regSceneDetectCallback(C1E8C c1e8c) {
        if (this.mSceneInfoCallback == null) {
            this.mSceneInfoCallback = new TEImageALGCallbackInterface.SceneInfoCallback() { // from class: X.1ESW
                @Override // com.ss.android.ttve.nativePort.TEImageALGCallbackInterface.SceneInfoCallback
                public final void onResult(SceneDetectInfo sceneDetectInfo) {
                    throw null;
                }
            };
        }
        this.mNativeBrushHandler.registerSceneDetectCallback(this.mSceneInfoCallback);
    }

    public void regSkeletonDetectCallback(C1E8D c1e8d) {
        if (this.mSkeletonInfoCallback == null) {
            this.mSkeletonInfoCallback = new TEImageALGCallbackInterface.SkeletonInfoCallback() { // from class: X.1ESX
                @Override // com.ss.android.ttve.nativePort.TEImageALGCallbackInterface.SkeletonInfoCallback
                public final void onResult(SkeletonInfo skeletonInfo) {
                    if (skeletonInfo != null) {
                        skeletonInfo.getInfo();
                        for (Skeleton skeleton : skeletonInfo.getInfo()) {
                            VEImageSkeleton vEImageSkeleton = new VEImageSkeleton();
                            vEImageSkeleton.setID(skeleton.getID());
                            vEImageSkeleton.setRect(skeleton.getRect());
                            vEImageSkeleton.setPoints(skeleton.getPoints());
                        }
                    }
                    throw null;
                }
            };
        }
        this.mNativeBrushHandler.registerSkeletonDetectCallback(this.mSkeletonInfoCallback);
    }
}
