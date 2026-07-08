package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import X.EnumC574990Mgr;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.AddYoursModel;
import com.ss.ugc.aweme.creation.base.AlbumModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.ChallengeModel;
import com.ss.ugc.aweme.creation.base.DraftModel;
import com.ss.ugc.aweme.creation.base.ImportModel;
import com.ss.ugc.aweme.creation.base.LiveEventModel;
import com.ss.ugc.aweme.creation.base.MentionModel;
import com.ss.ugc.aweme.creation.base.MusicModel;
import com.ss.ugc.aweme.creation.base.PropModel;
import com.ss.ugc.aweme.creation.base.ShareModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class BasicModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<BasicModel> CREATOR = new Parcelable.Creator<BasicModel>() { // from class: X.0Mgq
        @Override // android.os.Parcelable.Creator
        public final BasicModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Integer numValueOf;
            boolean z;
            EnumC574990Mgr enumC574990Mgr = (EnumC574990Mgr) C08FF.LIZ(EnumC574990Mgr.class, parcel.readString());
            ImportModel importModel = (ImportModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            ChallengeModel challengeModel = (ChallengeModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            MentionModel mentionModel = (MentionModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(BasicModel.class.getClassLoader()));
                i--;
            }
            TrackModel trackModel = (TrackModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            MusicModel musicModel = (MusicModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            AddYoursModel addYoursModel = (AddYoursModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            AlbumModel albumModel = (AlbumModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            DraftModel draftModel = (DraftModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            ShareModel shareModel = (ShareModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            PropModel propModel = (PropModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            LiveEventModel liveEventModel = (LiveEventModel) parcel.readParcelable(BasicModel.class.getClassLoader());
            String string = parcel.readString();
            boolean z2 = true;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf = null;
            }
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            while (i2 != 0) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                i2--;
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
            while (i3 != 0) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
                i3--;
            }
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new BasicModel(enumC574990Mgr, importModel, challengeModel, mentionModel, arrayList, trackModel, musicModel, addYoursModel, albumModel, draftModel, shareModel, propModel, liveEventModel, string, boolValueOf, string2, arrayListCreateStringArrayList, numValueOf, linkedHashMap, linkedHashMap2, arrayListCreateStringArrayList2, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BasicModel[] newArray(int i) {
            return new BasicModel[i];
        }
    };

    @C09CT("addyours")
    public AddYoursModel addyours;

    @C09CT("album")
    public AlbumModel album;

    @C09CT("anchors")
    public List<AnchorModel> anchors;

    @C09CT("auto_open_album")
    public Boolean autoOpenAlbum;

    @C09CT("challenge")
    public ChallengeModel challenge;

    @C09CT("challenges")
    public List<String> challenges;

    @C09CT("compose_type")
    public EnumC574990Mgr composeType;

    @C09CT("create_aweme_dict")
    public Map<String, String> createAwemeDict;

    @C09CT("creation_id")
    public String creationId;

    @C09CT("disable_draft")
    public Boolean disableDraft;

    @C09CT("draft")
    public DraftModel draft;

    @C09CT("extra_dict")
    public Map<String, String> extraDict;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    @C09CT("import")
    public ImportModel f87import;

    @C09CT("landing_page")
    public Integer landingPage;

    @C09CT("live_event")
    public LiveEventModel liveEvent;

    @C09CT("mention")
    public MentionModel mention;

    @C09CT("music")
    public MusicModel music;

    @C09CT("prop")
    public PropModel prop;

    @C09CT("publish_title")
    public String publishTitle;

    @C09CT("publish_title_element_order")
    public List<String> publishTitleElementOrder;

    @C09CT("share")
    public ShareModel share;

    @C09CT("track")
    public TrackModel track;

    public BasicModel() {
        this(EnumC574990Mgr.ComposeType_Default, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, null, null, new ArrayList(), null, new LinkedHashMap(), new LinkedHashMap(), new ArrayList(), null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.composeType.name());
        parcel.writeParcelable(this.f87import, i);
        parcel.writeParcelable(this.challenge, i);
        parcel.writeParcelable(this.mention, i);
        List<AnchorModel> list = this.anchors;
        parcel.writeInt(list.size());
        Iterator<AnchorModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeParcelable(this.track, i);
        parcel.writeParcelable(this.music, i);
        parcel.writeParcelable(this.addyours, i);
        parcel.writeParcelable(this.album, i);
        parcel.writeParcelable(this.draft, i);
        parcel.writeParcelable(this.share, i);
        parcel.writeParcelable(this.prop, i);
        parcel.writeParcelable(this.liveEvent, i);
        parcel.writeString(this.publishTitle);
        Boolean bool = this.disableDraft;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.creationId);
        parcel.writeStringList(this.challenges);
        Integer num = this.landingPage;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Map<String, String> map = this.extraDict;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Map<String, String> map2 = this.createAwemeDict;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
        parcel.writeStringList(this.publishTitleElementOrder);
        Boolean bool2 = this.autoOpenAlbum;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final AddYoursModel getAddyours() {
        return this.addyours;
    }

    public final AlbumModel getAlbum() {
        return this.album;
    }

    public final List<AnchorModel> getAnchors() {
        return this.anchors;
    }

    public final Boolean getAutoOpenAlbum() {
        return this.autoOpenAlbum;
    }

    public final ChallengeModel getChallenge() {
        return this.challenge;
    }

    public final List<String> getChallenges() {
        return this.challenges;
    }

    public final EnumC574990Mgr getComposeType() {
        return this.composeType;
    }

    public final Map<String, String> getCreateAwemeDict() {
        return this.createAwemeDict;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final Boolean getDisableDraft() {
        return this.disableDraft;
    }

    public final DraftModel getDraft() {
        return this.draft;
    }

    public final Map<String, String> getExtraDict() {
        return this.extraDict;
    }

    public final ImportModel getImport() {
        return this.f87import;
    }

    public final Integer getLandingPage() {
        return this.landingPage;
    }

    public final LiveEventModel getLiveEvent() {
        return this.liveEvent;
    }

    public final MentionModel getMention() {
        return this.mention;
    }

    public final MusicModel getMusic() {
        return this.music;
    }

    public final PropModel getProp() {
        return this.prop;
    }

    public final String getPublishTitle() {
        return this.publishTitle;
    }

    public final List<String> getPublishTitleElementOrder() {
        return this.publishTitleElementOrder;
    }

    public final ShareModel getShare() {
        return this.share;
    }

    public final TrackModel getTrack() {
        return this.track;
    }

    public final void setAddyours(AddYoursModel addYoursModel) {
        this.addyours = addYoursModel;
    }

    public final void setAlbum(AlbumModel albumModel) {
        this.album = albumModel;
    }

    public final void setAnchors(List<AnchorModel> list) {
        this.anchors = list;
    }

    public final void setAutoOpenAlbum(Boolean bool) {
        this.autoOpenAlbum = bool;
    }

    public final void setChallenge(ChallengeModel challengeModel) {
        this.challenge = challengeModel;
    }

    public final void setChallenges(List<String> list) {
        this.challenges = list;
    }

    public final void setComposeType(EnumC574990Mgr enumC574990Mgr) {
        this.composeType = enumC574990Mgr;
    }

    public final void setCreateAwemeDict(Map<String, String> map) {
        this.createAwemeDict = map;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setDisableDraft(Boolean bool) {
        this.disableDraft = bool;
    }

    public final void setDraft(DraftModel draftModel) {
        this.draft = draftModel;
    }

    public final void setExtraDict(Map<String, String> map) {
        this.extraDict = map;
    }

    public final void setImport(ImportModel importModel) {
        this.f87import = importModel;
    }

    public final void setLandingPage(Integer num) {
        this.landingPage = num;
    }

    public final void setLiveEvent(LiveEventModel liveEventModel) {
        this.liveEvent = liveEventModel;
    }

    public final void setMention(MentionModel mentionModel) {
        this.mention = mentionModel;
    }

    public final void setMusic(MusicModel musicModel) {
        this.music = musicModel;
    }

    public final void setProp(PropModel propModel) {
        this.prop = propModel;
    }

    public final void setPublishTitle(String str) {
        this.publishTitle = str;
    }

    public final void setPublishTitleElementOrder(List<String> list) {
        this.publishTitleElementOrder = list;
    }

    public final void setShare(ShareModel shareModel) {
        this.share = shareModel;
    }

    public final void setTrack(TrackModel trackModel) {
        this.track = trackModel;
    }

    public BasicModel(EnumC574990Mgr enumC574990Mgr, ImportModel importModel, ChallengeModel challengeModel, MentionModel mentionModel, List<AnchorModel> list, TrackModel trackModel, MusicModel musicModel, AddYoursModel addYoursModel, AlbumModel albumModel, DraftModel draftModel, ShareModel shareModel, PropModel propModel, LiveEventModel liveEventModel, String str, Boolean bool, String str2, List<String> list2, Integer num, Map<String, String> map, Map<String, String> map2, List<String> list3, Boolean bool2) {
        this.composeType = enumC574990Mgr;
        this.f87import = importModel;
        this.challenge = challengeModel;
        this.mention = mentionModel;
        this.anchors = list;
        this.track = trackModel;
        this.music = musicModel;
        this.addyours = addYoursModel;
        this.album = albumModel;
        this.draft = draftModel;
        this.share = shareModel;
        this.prop = propModel;
        this.liveEvent = liveEventModel;
        this.publishTitle = str;
        this.disableDraft = bool;
        this.creationId = str2;
        this.challenges = list2;
        this.landingPage = num;
        this.extraDict = map;
        this.createAwemeDict = map2;
        this.publishTitleElementOrder = list3;
        this.autoOpenAlbum = bool2;
    }
}
