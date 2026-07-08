package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageSummary;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageModel implements Parcelable {
    public static final Parcelable.Creator<Text2ImageModel> CREATOR = new Parcelable.Creator<Text2ImageModel>() { // from class: X.0Lv0
        @Override // android.os.Parcelable.Creator
        public final Text2ImageModel createFromParcel(Parcel parcel) {
            Float fValueOf;
            Integer numValueOf;
            ArrayList arrayList;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Text2ImageSummary text2ImageSummaryCreateFromParcel;
            boolean z5;
            boolean z6;
            Integer numValueOf2;
            boolean z7;
            boolean z8;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(TextImageTaskInfo.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                text2ImageSummaryCreateFromParcel = null;
            } else {
                text2ImageSummaryCreateFromParcel = Text2ImageSummary.CREATOR.createFromParcel(parcel);
            }
            Text2ImageSummary text2ImageSummary = text2ImageSummaryCreateFromParcel;
            String string13 = parcel.readString();
            Bundle bundle = parcel.readBundle(Text2ImageModel.class.getClassLoader());
            Bundle bundle2 = parcel.readBundle(Text2ImageModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            String string14 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(TextImageTaskInfo.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            String string15 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new Text2ImageModel(string, arrayListCreateStringArrayList, arrayList2, string2, string3, fValueOf, numValueOf, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, arrayList, string4, z, string5, z2, string6, z3, string7, string8, z4, string9, string10, string11, string12, text2ImageSummary, string13, bundle, bundle2, z5, string14, z6, arrayList3, numValueOf2, z7, string15, z8, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Text2ImageModel[] newArray(int i) {
            return new Text2ImageModel[i];
        }
    };

    @C040H
    public String asyncEntrance;

    @C09CT("cmt_to_post_entrance_element")
    public String cmtToPostEntranceElement;

    @C09CT("cmt_to_post_entrance_module")
    public String cmtToPostEntranceModule;

    @C09CT("cmt_to_post_initial_content_source")
    public String cmtToPostInitialContentSource;

    @C09CT("cmt_to_post_preview_position")
    public String cmtToPostPreviewPosition;

    @C09CT("comment_summary")
    public Text2ImageSummary commentSummary;

    @C09CT("comment_text")
    public String commentText;

    @C09CT("temp_cover")
    @C0MY0
    public String coverPath;

    @C040H
    public String curPathPage;

    @C040H
    public String curPathPageType;

    @C040H
    public Float customFontScaling;

    @C040H
    public boolean directToChoose;

    @C09CT("text2image_emoji_list")
    public List<String> emojiList;

    @C09CT("disable_guide")
    public boolean enableGuide;

    @C09CT("enable_story")
    public boolean enableStory;

    @C09CT("entrance")
    public String entrance;

    @C040H
    public transient Bundle etParams;

    @C040H
    public transient Bundle extraParams;

    @C09CT("from_author_id")
    public String fromAuthorId;

    @C09CT("from_aweme_id")
    public String fromAwemeId;

    @C09CT("from_comment_id")
    public String fromCommentId;

    @C040H
    public boolean fromPopup;

    @C09CT("from_username")
    public String fromUserName;

    @C09CT("image_path_list")
    public List<String> imageList;

    @C09CT("image_task_list")
    public List<TextImageTaskInfo> imageTaskList;

    @C09CT("text2image_index")
    public Integer index;

    @C040H
    public String insertIds;

    @C09CT("is_comment_seeking_help")
    public boolean isCommentSeekingHelp;

    @C09CT("is_help_text")
    public boolean isHelpText;

    @C09CT("text2image_keyword")
    public List<String> keyword;

    @C040H
    public String mobSubEditPageType;

    @C040H
    public String prevPathPage;

    @C040H
    public String prevPathPageType;

    @C040H
    public Integer quota;

    @C09CT("search_query")
    public String searchQuery;

    @C040H
    public boolean showEnterAnim;

    @C040H
    public List<TextImageTaskInfo> tempImageTaskList;

    @C09CT("text2image_template_list")
    public List<Long> templateList;

    @C09CT("text2image_text")
    public String text;

    @C09CT("text2image_text_by_ai")
    public String textByAi;

    @C09CT("text2image_text_key")
    public String textKey;

    @C09CT("text_to_image_edit_title")
    public String textToImageEditTitle;

    @C040H
    public int textTransPicStatus;

    @C09CT("trans_to_desc")
    public boolean transToDesc;

    public Text2ImageModel() {
        this(null, new ArrayList(), new CopyOnWriteArrayList(), "", null, null, null, null, null, null, null, false, "", true, "", true, "", "", false, "", "", "", null, null, null, null, null, false, null, false, new ArrayList(), null, false, null, false, "start", "start", "", "page", -1, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeStringList(this.imageList);
        List<TextImageTaskInfo> list = this.imageTaskList;
        parcel.writeInt(list.size());
        Iterator<TextImageTaskInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.coverPath);
        parcel.writeString(this.textKey);
        Float f = this.customFontScaling;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.index;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.keyword);
        parcel.writeStringList(this.emojiList);
        List<Long> list2 = this.templateList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Long> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeLong(it3.next().longValue());
            }
        }
        parcel.writeString(this.searchQuery);
        parcel.writeInt(this.transToDesc ? 1 : 0);
        parcel.writeString(this.textToImageEditTitle);
        parcel.writeInt(this.enableStory ? 1 : 0);
        parcel.writeString(this.entrance);
        parcel.writeInt(this.enableGuide ? 1 : 0);
        parcel.writeString(this.fromAwemeId);
        parcel.writeString(this.fromCommentId);
        parcel.writeInt(this.isCommentSeekingHelp ? 1 : 0);
        parcel.writeString(this.fromAuthorId);
        parcel.writeString(this.fromUserName);
        parcel.writeString(this.commentText);
        parcel.writeString(this.textByAi);
        Text2ImageSummary text2ImageSummary = this.commentSummary;
        if (text2ImageSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            text2ImageSummary.writeToParcel(parcel, i);
        }
        parcel.writeString(this.asyncEntrance);
        parcel.writeBundle(this.etParams);
        parcel.writeBundle(this.extraParams);
        parcel.writeInt(this.directToChoose ? 1 : 0);
        parcel.writeString(this.insertIds);
        parcel.writeInt(this.showEnterAnim ? 1 : 0);
        List<TextImageTaskInfo> list3 = this.tempImageTaskList;
        parcel.writeInt(list3.size());
        Iterator<TextImageTaskInfo> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        Integer num2 = this.quota;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.isHelpText ? 1 : 0);
        parcel.writeString(this.mobSubEditPageType);
        parcel.writeInt(this.fromPopup ? 1 : 0);
        parcel.writeString(this.prevPathPage);
        parcel.writeString(this.prevPathPageType);
        parcel.writeString(this.curPathPage);
        parcel.writeString(this.curPathPageType);
        parcel.writeInt(this.textTransPicStatus);
        parcel.writeString(this.cmtToPostEntranceModule);
        parcel.writeString(this.cmtToPostEntranceElement);
        parcel.writeString(this.cmtToPostPreviewPosition);
        parcel.writeString(this.cmtToPostInitialContentSource);
    }

    public Text2ImageModel(String str, List<String> list, List<TextImageTaskInfo> list2, String str2, String str3, Float f, Integer num, List<String> list3, List<String> list4, List<Long> list5, String str4, boolean z, String str5, boolean z2, String str6, boolean z3, String str7, String str8, boolean z4, String str9, String str10, String str11, String str12, Text2ImageSummary text2ImageSummary, String str13, Bundle bundle, Bundle bundle2, boolean z5, String str14, boolean z6, List<TextImageTaskInfo> list6, Integer num2, boolean z7, String str15, boolean z8, String str16, String str17, String str18, String str19, int i, String str20, String str21, String str22, String str23) {
        this.text = str;
        this.imageList = list;
        this.imageTaskList = list2;
        this.coverPath = str2;
        this.textKey = str3;
        this.customFontScaling = f;
        this.index = num;
        this.keyword = list3;
        this.emojiList = list4;
        this.templateList = list5;
        this.searchQuery = str4;
        this.transToDesc = z;
        this.textToImageEditTitle = str5;
        this.enableStory = z2;
        this.entrance = str6;
        this.enableGuide = z3;
        this.fromAwemeId = str7;
        this.fromCommentId = str8;
        this.isCommentSeekingHelp = z4;
        this.fromAuthorId = str9;
        this.fromUserName = str10;
        this.commentText = str11;
        this.textByAi = str12;
        this.commentSummary = text2ImageSummary;
        this.asyncEntrance = str13;
        this.etParams = bundle;
        this.extraParams = bundle2;
        this.directToChoose = z5;
        this.insertIds = str14;
        this.showEnterAnim = z6;
        this.tempImageTaskList = list6;
        this.quota = num2;
        this.isHelpText = z7;
        this.mobSubEditPageType = str15;
        this.fromPopup = z8;
        this.prevPathPage = str16;
        this.prevPathPageType = str17;
        this.curPathPage = str18;
        this.curPathPageType = str19;
        this.textTransPicStatus = i;
        this.cmtToPostEntranceModule = str20;
        this.cmtToPostEntranceElement = str21;
        this.cmtToPostPreviewPosition = str22;
        this.cmtToPostInitialContentSource = str23;
    }
}
