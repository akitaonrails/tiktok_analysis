package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.edit.NLEEditModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.publish.PublishConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC1294060jmO
public final class CreativeFlowData implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreativeFlowData> CREATOR = new Parcelable.Creator<CreativeFlowData>() { // from class: X.0mg9
        @Override // android.os.Parcelable.Creator
        public final CreativeFlowData createFromParcel(Parcel parcel) {
            HashMap map;
            FlowDataMusicInfo flowDataMusicInfoCreateFromParcel;
            HashMap map2;
            ShareKitPanel shareKitPanelCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            ShootExtraData shootExtraData = (ShootExtraData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() == 0) {
                flowDataMusicInfoCreateFromParcel = null;
            } else {
                flowDataMusicInfoCreateFromParcel = FlowDataMusicInfo.CREATOR.createFromParcel(parcel);
            }
            FlowDataMusicInfo flowDataMusicInfo = flowDataMusicInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                map2 = null;
            } else {
                int i3 = parcel.readInt();
                map2 = new HashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
            }
            AnchorTransData anchorTransData = (AnchorTransData) parcel.readSerializable();
            AutoSelectedAnchorInfos autoSelectedAnchorInfos = (AutoSelectedAnchorInfos) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                shareKitPanelCreateFromParcel = null;
            } else {
                shareKitPanelCreateFromParcel = ShareKitPanel.CREATOR.createFromParcel(parcel);
            }
            ShareKitPanel shareKitPanel = shareKitPanelCreateFromParcel;
            CreativeDurationExtra creativeDurationExtraCreateFromParcel = CreativeDurationExtra.CREATOR.createFromParcel(parcel);
            EditorProModel editorProModel = (EditorProModel) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
            NLEEditModel nLEEditModelCreateFromParcel = NLEEditModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new CreativeFlowData(string, shootExtraData, map, flowDataMusicInfo, map2, anchorTransData, autoSelectedAnchorInfos, shareKitPanel, creativeDurationExtraCreateFromParcel, editorProModel, nLEEditModelCreateFromParcel, z, string2, arrayList, PublishConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CreativeFlowData[] newArray(int i) {
            return new CreativeFlowData[i];
        }
    };

    @C09CT("anchors")
    public List<AnchorTransData> anchors;

    @C09CT("auto_selected_anchor")
    public AnchorTransData autoSelectedAnchor;

    @C09CT("auto_selected_anchor_infos")
    public AutoSelectedAnchorInfos autoSelectedAnchorInfos;

    @C09CT("creative_duration_extra")
    public CreativeDurationExtra creativeDurationExtra;

    @C09CT("editor_pro_model")
    public EditorProModel editorProModel;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("extra_log_params")
    public HashMap<String, String> extraLogParams;

    @C09CT("open_extra_share_options")
    public HashMap<String, Integer> extraShareOptions;

    @C09CT("music_info")
    public FlowDataMusicInfo flowDataMusicInfo;

    @C09CT("is_through_anchor")
    public boolean isThroughAnchor;

    @C09CT("nle_edit_model")
    public NLEEditModel nleEditModel;

    @C09CT("publish_config")
    public PublishConfig publishConfig;

    @C09CT("share_kit_panel")
    public ShareKitPanel shareKitPanel;

    @C09CT("shoot_extra_data")
    public ShootExtraData shootExtraData;

    @C09CT("tag")
    public String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeFlowData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tag);
        parcel.writeParcelable(this.shootExtraData, i);
        HashMap<String, Integer> map = this.extraShareOptions;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeInt(entry.getValue().intValue());
            }
        }
        FlowDataMusicInfo flowDataMusicInfo = this.flowDataMusicInfo;
        if (flowDataMusicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flowDataMusicInfo.writeToParcel(parcel, i);
        }
        HashMap<String, String> map2 = this.extraLogParams;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeSerializable(this.autoSelectedAnchor);
        parcel.writeSerializable(this.autoSelectedAnchorInfos);
        ShareKitPanel shareKitPanel = this.shareKitPanel;
        if (shareKitPanel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shareKitPanel.writeToParcel(parcel, i);
        }
        this.creativeDurationExtra.writeToParcel(parcel, i);
        parcel.writeParcelable(this.editorProModel, i);
        this.nleEditModel.writeToParcel(parcel, i);
        parcel.writeInt(this.isThroughAnchor ? 1 : 0);
        parcel.writeString(this.enterMethod);
        List<AnchorTransData> list = this.anchors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AnchorTransData> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        this.publishConfig.writeToParcel(parcel, i);
    }

    public final List<AnchorTransData> getAnchors() {
        return this.anchors;
    }

    public final AnchorTransData getAutoSelectedAnchor() {
        return this.autoSelectedAnchor;
    }

    public final AutoSelectedAnchorInfos getAutoSelectedAnchorInfos() {
        return this.autoSelectedAnchorInfos;
    }

    public final CreativeDurationExtra getCreativeDurationExtra() {
        return this.creativeDurationExtra;
    }

    public final EditorProModel getEditorProModel() {
        return this.editorProModel;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final HashMap<String, String> getExtraLogParams() {
        return this.extraLogParams;
    }

    public final HashMap<String, Integer> getExtraShareOptions() {
        return this.extraShareOptions;
    }

    public final FlowDataMusicInfo getFlowDataMusicInfo() {
        return this.flowDataMusicInfo;
    }

    public final NLEEditModel getNleEditModel() {
        return this.nleEditModel;
    }

    public final PublishConfig getPublishConfig() {
        return this.publishConfig;
    }

    public final ShareKitPanel getShareKitPanel() {
        return this.shareKitPanel;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getTag() {
        return this.tag;
    }

    public final boolean isThroughAnchor() {
        return this.isThroughAnchor;
    }

    public final void setAnchors(List<AnchorTransData> list) {
        this.anchors = list;
    }

    public final void setAutoSelectedAnchor(AnchorTransData anchorTransData) {
        this.autoSelectedAnchor = anchorTransData;
    }

    public final void setAutoSelectedAnchorInfos(AutoSelectedAnchorInfos autoSelectedAnchorInfos) {
        this.autoSelectedAnchorInfos = autoSelectedAnchorInfos;
    }

    public final void setCreativeDurationExtra(CreativeDurationExtra creativeDurationExtra) {
        this.creativeDurationExtra = creativeDurationExtra;
    }

    public final void setEditorProModel(EditorProModel editorProModel) {
        this.editorProModel = editorProModel;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setExtraLogParams(HashMap<String, String> map) {
        this.extraLogParams = map;
    }

    public final void setExtraShareOptions(HashMap<String, Integer> map) {
        this.extraShareOptions = map;
    }

    public final void setFlowDataMusicInfo(FlowDataMusicInfo flowDataMusicInfo) {
        this.flowDataMusicInfo = flowDataMusicInfo;
    }

    public final void setNleEditModel(NLEEditModel nLEEditModel) {
        this.nleEditModel = nLEEditModel;
    }

    public final void setPublishConfig(PublishConfig publishConfig) {
        this.publishConfig = publishConfig;
    }

    public final void setShareKitPanel(ShareKitPanel shareKitPanel) {
        this.shareKitPanel = shareKitPanel;
    }

    public final void setShootExtraData(ShootExtraData shootExtraData) {
        this.shootExtraData = shootExtraData;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setThroughAnchor(boolean z) {
        this.isThroughAnchor = z;
    }

    public CreativeFlowData(String str, ShootExtraData shootExtraData, HashMap<String, Integer> map, FlowDataMusicInfo flowDataMusicInfo, HashMap<String, String> map2, AnchorTransData anchorTransData, AutoSelectedAnchorInfos autoSelectedAnchorInfos, ShareKitPanel shareKitPanel, CreativeDurationExtra creativeDurationExtra, EditorProModel editorProModel, NLEEditModel nLEEditModel, boolean z, String str2, List<AnchorTransData> list, PublishConfig publishConfig) {
        this.tag = str;
        this.shootExtraData = shootExtraData;
        this.extraShareOptions = map;
        this.flowDataMusicInfo = flowDataMusicInfo;
        this.extraLogParams = map2;
        this.autoSelectedAnchor = anchorTransData;
        this.autoSelectedAnchorInfos = autoSelectedAnchorInfos;
        this.shareKitPanel = shareKitPanel;
        this.creativeDurationExtra = creativeDurationExtra;
        this.editorProModel = editorProModel;
        this.nleEditModel = nLEEditModel;
        this.isThroughAnchor = z;
        this.enterMethod = str2;
        this.anchors = list;
        this.publishConfig = publishConfig;
    }

    public /* synthetic */ CreativeFlowData(String str, ShootExtraData shootExtraData, HashMap map, FlowDataMusicInfo flowDataMusicInfo, HashMap map2, AnchorTransData anchorTransData, AutoSelectedAnchorInfos autoSelectedAnchorInfos, ShareKitPanel shareKitPanel, CreativeDurationExtra creativeDurationExtra, EditorProModel editorProModel, NLEEditModel nLEEditModel, boolean z, String str2, List list, PublishConfig publishConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : shootExtraData, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : flowDataMusicInfo, (i & 16) != 0 ? null : map2, (i & 32) != 0 ? null : anchorTransData, (i & 64) != 0 ? new AutoSelectedAnchorInfos(null, null, null, null, null, null) : autoSelectedAnchorInfos, (i & 128) != 0 ? null : shareKitPanel, (i & 256) != 0 ? new CreativeDurationExtra(0L, 0L, 0L) : creativeDurationExtra, (i & 512) != 0 ? null : editorProModel, (i & 1024) != 0 ? new NLEEditModel(false, true) : nLEEditModel, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str2 : null, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? new PublishConfig(0) : publishConfig);
    }
}
