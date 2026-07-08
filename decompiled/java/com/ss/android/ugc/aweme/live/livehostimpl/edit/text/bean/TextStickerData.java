package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.C09CT;
import X.C0MY0;
import X.C1697810uHb;
import X.C196986125g;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import X.InterfaceC384940F7k;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerCoverExtraData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TextStickerData implements Parcelable, Cloneable, InterfaceC384940F7k {

    @C09CT("font_type")
    public String _fontType;
    public boolean addToLayout;
    public boolean addToLayoutInPreviewOrCover;

    @C09CT("align")
    public int align;
    public Pair<Float, Boolean> alpha;

    @C09CT("audio_path_list")
    @C0MY0
    public List<String> audioPathList;

    @C09CT("old_text")
    public String audioText;

    @C09CT("audio_track_duration")
    public int audioTrackDuration;

    @C09CT("audio_track_file_path")
    @C0MY0
    public String audioTrackFilePath;

    @C09CT("audio_track_index")
    public int audioTrackIndex;
    public boolean autoSelect;

    @C09CT("bg_mode")
    public int bgMode;

    @C09CT("canvas_height")
    public int canvasHeight;

    @C09CT("canvas_width")
    public int canvasWidth;

    @C09CT("color")
    public int color;

    @C09CT("cover_extra_data")
    public TextStickerCoverExtraData coverExtraData;

    @C09CT("edit_center_point")
    public Point editCenterPoint;

    @C09CT("mEndTime")
    public int endTime;

    @C09CT("font_id")
    public String fontId;

    @C09CT("font_path")
    public String fontPath;
    public int fontSize;

    @C09CT("has_read_text_audio")
    public boolean hasReadTextAudio;

    @C09CT("layout_height")
    public float layoutHeight;

    @C09CT("layout_width")
    public float layoutWidth;

    @C09CT("nle_uuid")
    public String nleUuid;

    @C09CT("r")
    public float rotation;

    @C09CT("s")
    public float scale;
    public boolean showOnScreen;

    @C09CT("speaker_id")
    public String speakerID;

    @C09CT("speaker_name")
    public String speakerName;

    @C09CT("mStartTime")
    public int startTime;

    @C09CT("text_str")
    public String textStr;

    @C09CT("text_str_ary")
    public String[] textStrAry;

    @C09CT("text_str_wrap")
    public TextStickerTextWrap textWrap;

    @C09CT("text_str_wrap_list")
    public List<TextStickerTextWrap> textWrapList;

    @C09CT("type")
    public String type;

    @C09CT("mUIEndTime")
    public int uiEndTime;

    @C09CT("mUIStartTime")
    public int uiStartTime;

    @C09CT("video_width")
    public int videoWidth;
    public float x;
    public float y;
    public static final Parcelable.Creator<TextStickerData> CREATOR = new Parcelable.Creator<TextStickerData>() { // from class: X.0wQu
        @Override // android.os.Parcelable.Creator
        public final TextStickerData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            Point point = (Point) parcel.readParcelable(TextStickerData.class.getClassLoader());
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            TextStickerData.Pair pair = (TextStickerData.Pair) parcel.readSerializable();
            float f3 = parcel.readFloat();
            float f4 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i8 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i9 = parcel.readInt();
            String string7 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i10 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            TextStickerTextWrap textStickerTextWrapCreateFromParcel = TextStickerTextWrap.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(TextStickerTextWrap.CREATOR.createFromParcel(parcel));
            }
            return new TextStickerData(string, i, i2, i3, string2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, string3, string4, string5, string6, i9, string7, arrayListCreateStringArrayList, i10, strArrCreateStringArray, textStickerTextWrapCreateFromParcel, arrayList, TextStickerCoverExtraData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerData[] newArray(int i) {
            return new TextStickerData[i];
        }
    };
    public static final int $stable = 8;

    public TextStickerData() {
        this(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1, 511, null);
    }

    public TextStickerData(String str) {
        this(str, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -2, 511, null);
    }

    public TextStickerData(String str, int i) {
        this(str, i, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -4, 511, null);
    }

    public TextStickerData(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -8, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -16, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this(str, i, i2, i3, str2, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -32, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point) {
        this(str, i, i2, i3, str2, point, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -64, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4) {
        this(str, i, i2, i3, str2, point, i4, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -128, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5) {
        this(str, i, i2, i3, str2, point, i4, i5, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -256, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -512, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1024, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -2048, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -4096, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -8192, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -16384, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -32768, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -65536, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -131072, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -262144, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -524288, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1048576, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -2097152, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -4194304, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -8388608, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -16777216, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -33554432, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -67108864, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -134217728, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -268435456, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -536870912, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1073741824, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, Integer.MIN_VALUE, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, 0, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, null, null, 0.0f, 0.0f, 0, 0, 0, null, 0, 510, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, str8, null, 0.0f, 0.0f, 0, 0, 0, null, 0, 508, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, str8, str9, 0.0f, 0.0f, 0, 0, 0, null, 0, 504, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9, float f5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, str8, str9, f5, 0.0f, 0, 0, 0, null, 0, 496, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9, float f5, float f6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, str8, str9, f5, f6, 0, 0, 0, null, 0, 480, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9, float f5, float f6, int i11) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, str8, str9, f5, f6, i11, 0, 0, null, 0, 448, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9, float f5, float f6, int i11, int i12) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, str8, str9, f5, f6, i11, i12, 0, null, 0, 384, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9, float f5, float f6, int i11, int i12, int i13) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, z, z2, z3, pair, f3, f4, z4, z5, i8, str3, str4, str5, str6, i9, str7, list, i10, strArr, textStickerTextWrap, list2, textStickerCoverExtraData, str8, str9, f5, f6, i11, i12, i13, null, 0, 256, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getTextStrAry$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getTextWrap$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void get_fontType$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textStr);
        parcel.writeInt(this.bgMode);
        parcel.writeInt(this.color);
        parcel.writeInt(this.align);
        parcel.writeString(this._fontType);
        parcel.writeParcelable(this.editCenterPoint, i);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeInt(this.showOnScreen ? 1 : 0);
        parcel.writeInt(this.addToLayout ? 1 : 0);
        parcel.writeInt(this.addToLayoutInPreviewOrCover ? 1 : 0);
        parcel.writeSerializable(this.alpha);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.autoSelect ? 1 : 0);
        parcel.writeInt(this.hasReadTextAudio ? 1 : 0);
        parcel.writeInt(this.audioTrackIndex);
        parcel.writeString(this.nleUuid);
        parcel.writeString(this.audioTrackFilePath);
        parcel.writeString(this.speakerID);
        parcel.writeString(this.speakerName);
        parcel.writeInt(this.audioTrackDuration);
        parcel.writeString(this.audioText);
        parcel.writeStringList(this.audioPathList);
        parcel.writeInt(this.fontSize);
        parcel.writeStringArray(this.textStrAry);
        this.textWrap.writeToParcel(parcel, i);
        List<TextStickerTextWrap> list = this.textWrapList;
        parcel.writeInt(list.size());
        Iterator<TextStickerTextWrap> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.coverExtraData.writeToParcel(parcel, i);
        parcel.writeString(this.fontId);
        parcel.writeString(this.fontPath);
        parcel.writeFloat(this.layoutWidth);
        parcel.writeFloat(this.layoutHeight);
        parcel.writeInt(this.canvasWidth);
        parcel.writeInt(this.canvasHeight);
        parcel.writeInt(this.videoWidth);
        parcel.writeString(this.type);
    }

    public final boolean hasPositionData() {
        return !(this.scale == 0.0f);
    }

    public final boolean hasTimeData() {
        return this.endTime != 0;
    }

    public final boolean isCaption() {
        return Intrinsics.LJFF(this.type, "type_inline_caption");
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextStickerData m252clone() {
        try {
            return (TextStickerData) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1, 511, null);
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textStr: ");
        sbLIZ.append(this.textStr);
        sbLIZ.append(", bgMode: ");
        sbLIZ.append(this.bgMode);
        sbLIZ.append(", color: ");
        sbLIZ.append(this.color);
        sbLIZ.append(", align: ");
        sbLIZ.append(this.align);
        sbLIZ.append(", fontType: ");
        sbLIZ.append(this._fontType);
        sbLIZ.append(", centerPoint: ");
        sbLIZ.append(this.editCenterPoint);
        sbLIZ.append(", fontSize: ");
        sbLIZ.append(this.fontSize);
        sbLIZ.append(", position: (");
        sbLIZ.append(this.x);
        sbLIZ.append(", ");
        sbLIZ.append(this.y);
        sbLIZ.append("), scale: ");
        sbLIZ.append(this.scale);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getAddToLayout() {
        return this.addToLayout;
    }

    public final boolean getAddToLayoutInPreviewOrCover() {
        return this.addToLayoutInPreviewOrCover;
    }

    public final int getAlign() {
        return this.align;
    }

    public final Pair<Float, Boolean> getAlpha() {
        return this.alpha;
    }

    public final List<String> getAudioPathList() {
        return this.audioPathList;
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getAutoSelect() {
        return this.autoSelect;
    }

    public final int getBgMode() {
        return this.bgMode;
    }

    public final int getCanvasHeight() {
        return this.canvasHeight;
    }

    public final int getCanvasWidth() {
        return this.canvasWidth;
    }

    public final int getColor() {
        return this.color;
    }

    public final TextStickerCoverExtraData getCoverExtraData() {
        return this.coverExtraData;
    }

    public final Point getEditCenterPoint() {
        return this.editCenterPoint;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getFontId() {
        return this.fontId;
    }

    public final String getFontPath() {
        return this.fontPath;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getFontType() {
        return this._fontType;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final float getLayoutHeight() {
        return this.layoutHeight;
    }

    public final float getLayoutWidth() {
        return this.layoutWidth;
    }

    public final String getNleUuid() {
        return this.nleUuid;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean getShowOnScreen() {
        return this.showOnScreen;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    public final String getSpeakerName() {
        return this.speakerName;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final List<TextStickerTextWrap> getTextWrapList() {
        return this.textWrapList;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUiEndTime() {
        return this.uiEndTime;
    }

    public final int getUiStartTime() {
        return this.uiStartTime;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final boolean isVisibleWhen(long j) {
        if (hasTimeData()) {
            int i = this.startTime;
            if (j > this.endTime || i > j) {
                return false;
            }
        }
        return true;
    }

    public final void setAddToLayout(boolean z) {
        this.addToLayout = z;
    }

    public final void setAddToLayoutInPreviewOrCover(boolean z) {
        this.addToLayoutInPreviewOrCover = z;
    }

    public final void setAlign(int i) {
        this.align = i;
    }

    public final void setAlpha(Pair<Float, Boolean> pair) {
        this.alpha = pair;
    }

    public final void setAudioPathList(List<String> list) {
        this.audioPathList = list;
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i) {
        this.audioTrackDuration = i;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setAutoSelect(boolean z) {
        this.autoSelect = z;
    }

    public final void setBgMode(int i) {
        this.bgMode = i;
    }

    public final void setCanvasHeight(int i) {
        this.canvasHeight = i;
    }

    public final void setCanvasWidth(int i) {
        this.canvasWidth = i;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setCoverExtraData(TextStickerCoverExtraData textStickerCoverExtraData) {
        this.coverExtraData = textStickerCoverExtraData;
    }

    public final void setEditCenterPoint(Point point) {
        this.editCenterPoint = point;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setFontId(String str) {
        this.fontId = str;
    }

    public final void setFontPath(String str) {
        this.fontPath = str;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final void setFontType(String str) {
        TextFontStyleData textFontStyleData;
        this._fontType = str;
        C196986125g c196986125gLJFF = C196986125g.LJFF();
        c196986125gLJFF.getClass();
        if (!TextUtils.isEmpty(str) && (textFontStyleData = c196986125gLJFF.LIZ.get(str)) != null) {
            this.fontId = textFontStyleData.LIZJ.getEffectId();
            this.fontPath = textFontStyleData.LIZJ.getUnzipPath();
        } else {
            this.fontId = "";
            this.fontPath = "";
        }
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setLayoutHeight(float f) {
        this.layoutHeight = f;
    }

    public final void setLayoutWidth(float f) {
        this.layoutWidth = f;
    }

    public final void setNleUuid(String str) {
        this.nleUuid = str;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setShowOnScreen(boolean z) {
        this.showOnScreen = z;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public final void setSpeakerName(String str) {
        this.speakerName = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public final void setTextWrapList(List<TextStickerTextWrap> list) {
        this.textWrapList = list;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUiEndTime(int i) {
        this.uiEndTime = i;
    }

    public final void setUiStartTime(int i) {
        this.uiStartTime = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public static final class Pair<A, B> implements Serializable {
        public static final int $stable = 0;

        @C09CT(alternate = {"LIZIZ"}, value = "first")
        public final A first;

        @C09CT(alternate = {"LIZ"}, value = "second")
        public final B second;

        public Pair(A a, B b) {
            this.first = a;
            this.second = b;
        }
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9, float f5, float f6, int i11, int i12, int i13, String str10) {
        this.textStr = str;
        this.bgMode = i;
        this.color = i2;
        this.align = i3;
        this._fontType = str2;
        this.editCenterPoint = point;
        this.startTime = i4;
        this.endTime = i5;
        this.uiStartTime = i6;
        this.uiEndTime = i7;
        this.x = f;
        this.y = f2;
        this.showOnScreen = z;
        this.addToLayout = z2;
        this.addToLayoutInPreviewOrCover = z3;
        this.alpha = pair;
        this.rotation = f3;
        this.scale = f4;
        this.autoSelect = z4;
        this.hasReadTextAudio = z5;
        this.audioTrackIndex = i8;
        this.nleUuid = str3;
        this.audioTrackFilePath = str4;
        this.speakerID = str5;
        this.speakerName = str6;
        this.audioTrackDuration = i9;
        this.audioText = str7;
        this.audioPathList = list;
        this.fontSize = i10;
        this.textStrAry = strArr;
        this.textWrap = textStickerTextWrap;
        this.textWrapList = list2;
        this.coverExtraData = textStickerCoverExtraData;
        this.fontId = str8;
        this.fontPath = str9;
        this.layoutWidth = f5;
        this.layoutHeight = f6;
        this.canvasWidth = i11;
        this.canvasHeight = i12;
        this.videoWidth = i13;
        this.type = str10;
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair pair, float f3, float f4, boolean z4, boolean z5, int i8, String str3, String str4, String str5, String str6, int i9, String str7, List list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List list2, TextStickerCoverExtraData textStickerCoverExtraData, String str8, String str9, float f5, float f6, int i11, int i12, int i13, String str10, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        String str12 = str10;
        int i16 = i11;
        float f7 = f6;
        float f8 = f5;
        String str13 = str8;
        TextStickerCoverExtraData textStickerCoverExtraData2 = textStickerCoverExtraData;
        int i17 = i12;
        TextStickerTextWrap textStickerTextWrap2 = textStickerTextWrap;
        String[] strArr2 = strArr;
        int i18 = i10;
        String str14 = str7;
        int i19 = i9;
        String str15 = str5;
        boolean z6 = z;
        String str16 = str4;
        float f9 = f;
        boolean z7 = z4;
        float f10 = f2;
        int i20 = i8;
        float f11 = f4;
        List listLJ = list2;
        Pair pair2 = pair;
        String str17 = str3;
        boolean z8 = z5;
        int i21 = i13;
        float f12 = f3;
        int i22 = i7;
        int i23 = i6;
        int i24 = i5;
        int i25 = i4;
        List arrayList = list;
        boolean z9 = z3;
        Point point2 = point;
        String str18 = str2;
        int i26 = i3;
        String str19 = str6;
        boolean z10 = z2;
        int i27 = i2;
        int i28 = i;
        String str20 = (i14 & 1) != 0 ? null : str;
        i28 = (i14 & 2) != 0 ? 0 : i28;
        i27 = (i14 & 4) != 0 ? 0 : i27;
        i26 = (i14 & 8) != 0 ? 0 : i26;
        str18 = (i14 & 16) != 0 ? null : str18;
        point2 = (i14 & 32) != 0 ? new Point() : point2;
        i25 = (i14 & 64) != 0 ? 0 : i25;
        i24 = (i14 & 128) != 0 ? 0 : i24;
        i23 = (i14 & 256) != 0 ? 0 : i23;
        i22 = (i14 & 512) != 0 ? 0 : i22;
        f9 = (i14 & 1024) != 0 ? 0.0f : f9;
        f10 = (i14 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0.0f : f10;
        z6 = (i14 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z6;
        z10 = (i14 & 8192) != 0 ? false : z10;
        z9 = (i14 & 16384) != 0 ? false : z9;
        pair2 = (32768 & i14) != 0 ? new Pair(Float.valueOf(1.0f), Boolean.TRUE) : pair2;
        f12 = (65536 & i14) != 0 ? 0.0f : f12;
        f11 = (131072 & i14) != 0 ? 0.0f : f11;
        z7 = (262144 & i14) != 0 ? false : z7;
        z8 = (524288 & i14) != 0 ? false : z8;
        i20 = (1048576 & i14) != 0 ? -1 : i20;
        str17 = (2097152 & i14) != 0 ? "" : str17;
        str16 = (4194304 & i14) != 0 ? null : str16;
        str15 = (8388608 & i14) != 0 ? null : str15;
        str19 = (16777216 & i14) != 0 ? null : str19;
        i19 = (33554432 & i14) != 0 ? 0 : i19;
        str14 = (67108864 & i14) != 0 ? null : str14;
        arrayList = (134217728 & i14) != 0 ? new ArrayList() : arrayList;
        i18 = (268435456 & i14) != 0 ? 64 : i18;
        strArr2 = (536870912 & i14) != 0 ? new String[0] : strArr2;
        if ((1073741824 & i14) != 0) {
            if (strArr2 != null && strArr2.length != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                StringBuilder sb = new StringBuilder();
                for (String str21 : strArr2) {
                    sb.append(str21);
                    linkedHashMap.put(new TextStickerString(str21), new ArrayList());
                }
                TextStickerTextPair textStickerTextPair = new TextStickerTextPair(sb.toString(), new ArrayList());
                textStickerTextWrap2 = new TextStickerTextWrap(linkedHashMap, textStickerTextPair, textStickerTextPair.first.length(), false, false);
            } else {
                HashMap map = new HashMap();
                TextStickerTextPair textStickerTextPair2 = new TextStickerTextPair("", new ArrayList());
                textStickerTextWrap2 = new TextStickerTextWrap(map, textStickerTextPair2, textStickerTextPair2.first.length(), false, false);
            }
        }
        listLJ = (i14 & Integer.MIN_VALUE) != 0 ? C1697810uHb.LJ(textStickerTextWrap2) : listLJ;
        if ((i15 & 1) != 0) {
            str11 = null;
            textStickerCoverExtraData2 = new TextStickerCoverExtraData(true);
        } else {
            str11 = null;
        }
        this(str20, i28, i27, i26, str18, point2, i25, i24, i23, i22, f9, f10, z6, z10, z9, pair2, f12, f11, z7, z8, i20, str17, str16, str15, str19, i19, str14, arrayList, i18, strArr2, textStickerTextWrap2, listLJ, textStickerCoverExtraData2, (i15 & 2) != 0 ? str11 : str13, (i15 & 4) == 0 ? str9 : str11, (i15 & 8) != 0 ? 0.0f : f8, (i15 & 16) != 0 ? 0.0f : f7, (i15 & 32) != 0 ? 0 : i16, (i15 & 64) != 0 ? 0 : i17, (i15 & 128) != 0 ? 0 : i21, (i15 & 256) != 0 ? "type_text_sticker" : str12);
    }
}
