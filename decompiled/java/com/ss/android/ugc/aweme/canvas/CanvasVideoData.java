package com.ss.android.ugc.aweme.canvas;

import X.C0MO9;
import X.C0MY0;
import X.C13LP;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CanvasVideoData implements Serializable {
    public static final C0MO9 Companion = new Object() { // from class: X.0MO9
    };
    public List<CanvasFilterParam> _transformList;
    public AIGCInfo aigcInfo;

    @C0MY0
    @InterfaceC2270808v4
    public List<String> auditFrames;
    public final CanvasBackground background;
    public int canvasType;
    public CropData cropData;
    public List<CanvasVideoData> externalTracks;
    public CanvasExtra extra;
    public ImageVideoSharedModel imageVideoSharedModel;
    public NewGreenScreenEffectModel newGreenScreenEffectModel;
    public Object nleClip;
    public int originVideoAIGCLabelType;

    @InterfaceC2270908v5
    @C0MY0(blockCreative = true)
    @InterfaceC2270808v4
    public List<String> sourceInfo;

    public CanvasVideoData() {
        this(null, null, null, null, null, 0, null, 0, null, null, null, null, 4095, null);
    }

    public final CanvasVideoData copy(List<String> list, List<String> list2, CanvasBackground canvasBackground, CropData cropData, CanvasExtra canvasExtra, int i, List<CanvasVideoData> list3, int i2, Object obj, AIGCInfo aIGCInfo, NewGreenScreenEffectModel newGreenScreenEffectModel, ImageVideoSharedModel imageVideoSharedModel) {
        return new CanvasVideoData(list, list2, canvasBackground, cropData, canvasExtra, i, list3, i2, obj, aIGCInfo, newGreenScreenEffectModel, imageVideoSharedModel);
    }

    public String toString() {
        return "CanvasVideoData(sourceInfo=" + this.sourceInfo + ", auditFrames=" + this.auditFrames + ", background=" + this.background + ", cropData=" + this.cropData + ", extra=" + this.extra + ", canvasType=" + this.canvasType + ", externalTracks=" + this.externalTracks + ", originVideoAIGCLabelType=" + this.originVideoAIGCLabelType + ", nleClip=" + this.nleClip + ", aigcInfo=" + this.aigcInfo + ", newGreenScreenEffectModel=" + this.newGreenScreenEffectModel + ", imageVideoSharedModel=" + this.imageVideoSharedModel + ')';
    }

    public final List<CanvasFilterParam> getTransformList() {
        return this._transformList;
    }

    public final CanvasFilterParam getClipTransform(int i) {
        List<CanvasFilterParam> transformList = getTransformList();
        CanvasFilterParam canvasFilterParam = null;
        if (transformList == null) {
            return null;
        }
        Iterator<CanvasFilterParam> it2 = transformList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CanvasFilterParam next = it2.next();
            if (next.getClipIndex() == i) {
                canvasFilterParam = next;
                break;
            }
        }
        return canvasFilterParam;
    }

    public final void putTransform(CanvasFilterParam canvasFilterParam) {
        if (canvasFilterParam == null) {
            return;
        }
        if (this._transformList == null) {
            this._transformList = new ArrayList();
        }
        List<CanvasFilterParam> list = this._transformList;
        if (list != null) {
            list.add(canvasFilterParam);
        }
    }

    public final void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public final void setAuditFrames(List<String> list) {
        this.auditFrames = list;
    }

    public final void setCanvasType(int i) {
        this.canvasType = i;
    }

    public final void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    public final void setExternalTracks(List<CanvasVideoData> list) {
        this.externalTracks = list;
    }

    public final void setExtra(CanvasExtra canvasExtra) {
        this.extra = canvasExtra;
    }

    public final void setImageVideoSharedModel(ImageVideoSharedModel imageVideoSharedModel) {
        this.imageVideoSharedModel = imageVideoSharedModel;
    }

    public final void setNewGreenScreenEffectModel(NewGreenScreenEffectModel newGreenScreenEffectModel) {
        this.newGreenScreenEffectModel = newGreenScreenEffectModel;
    }

    public final void setNleClip(Object obj) {
        this.nleClip = obj;
    }

    public final void setOriginVideoAIGCLabelType(int i) {
        this.originVideoAIGCLabelType = i;
    }

    public final void setSourceInfo(List<String> list) {
        this.sourceInfo = list;
    }

    public final void updateTransform(int i, CanvasFilterParam canvasFilterParam) {
        CanvasFilterParam canvasFilterParam2;
        if (this._transformList == null) {
            this._transformList = new ArrayList();
        }
        List<CanvasFilterParam> list = this._transformList;
        if (list != null && C13LP.LJJJLZIJ(i, list) != null) {
            List<CanvasFilterParam> list2 = this._transformList;
            if (list2 != null && (canvasFilterParam2 = (CanvasFilterParam) C13LP.LJJJLZIJ(i, list2)) != null) {
                canvasFilterParam2.setScaleFactor(canvasFilterParam.getScaleFactor());
                canvasFilterParam2.setDegree(canvasFilterParam.getDegree());
                canvasFilterParam2.setTransX(canvasFilterParam.getTransX());
                canvasFilterParam2.setTransY(canvasFilterParam.getTransY());
                return;
            }
            return;
        }
        List<CanvasFilterParam> list3 = this._transformList;
        if (list3 == null) {
            return;
        }
        list3.add(canvasFilterParam);
    }

    public CanvasVideoData(List<String> list, List<String> list2, CanvasBackground canvasBackground, CropData cropData, CanvasExtra canvasExtra, int i, List<CanvasVideoData> list3, int i2, Object obj, AIGCInfo aIGCInfo, NewGreenScreenEffectModel newGreenScreenEffectModel, ImageVideoSharedModel imageVideoSharedModel) {
        this.sourceInfo = list;
        this.auditFrames = list2;
        this.background = canvasBackground;
        this.cropData = cropData;
        this.extra = canvasExtra;
        this.canvasType = i;
        this.externalTracks = list3;
        this.originVideoAIGCLabelType = i2;
        this.nleClip = obj;
        this.aigcInfo = aIGCInfo;
        this.newGreenScreenEffectModel = newGreenScreenEffectModel;
        this.imageVideoSharedModel = imageVideoSharedModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CanvasVideoData(List list, List list2, CanvasBackground canvasBackground, CropData cropData, CanvasExtra canvasExtra, int i, List list3, int i2, Object obj, AIGCInfo aIGCInfo, NewGreenScreenEffectModel newGreenScreenEffectModel, ImageVideoSharedModel imageVideoSharedModel, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        NewGreenScreenEffectModel newGreenScreenEffectModel2 = newGreenScreenEffectModel;
        AIGCInfo aIGCInfo2 = aIGCInfo;
        Object obj2 = obj;
        List list4 = list3;
        int i4 = i;
        CanvasExtra canvasExtra2 = canvasExtra;
        CropData cropData2 = cropData;
        CanvasBackground canvasBackground2 = canvasBackground;
        List list5 = list2;
        List arrayList = (i3 & 1) != 0 ? new ArrayList() : list;
        list5 = (i3 & 2) != 0 ? null : list5;
        if ((i3 & 4) != 0) {
            CanvasBackground.Companion.getClass();
            canvasBackground2 = CanvasBackground.DEFAULT_BACKGROUND;
        }
        this(arrayList, list5, canvasBackground2, (i3 & 8) != 0 ? null : cropData2, (i3 & 16) != 0 ? null : canvasExtra2, (i3 & 32) != 0 ? 0 : i4, (i3 & 64) != 0 ? null : list4, (i3 & 128) == 0 ? i2 : 0, (i3 & 256) != 0 ? null : obj2, (i3 & 512) != 0 ? null : aIGCInfo2, (i3 & 1024) != 0 ? null : newGreenScreenEffectModel2, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? imageVideoSharedModel : null);
    }
}
