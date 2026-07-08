package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateComplexity;

/* JADX INFO: loaded from: classes6.dex */
public final class TemplateComplexity implements Parcelable {
    public static final Parcelable.Creator<TemplateComplexity> CREATOR = new Parcelable.Creator<TemplateComplexity>() { // from class: X.0F3p
        @Override // android.os.Parcelable.Creator
        public final TemplateComplexity createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            Integer numValueOf7;
            Integer numValueOf8;
            Integer numValueOf9;
            Integer numValueOf10;
            Integer numValueOf11;
            Integer numValueOf12;
            Integer numValueOf13;
            Integer numValueOf14;
            Integer numValueOf15;
            Integer numValueOf16;
            Integer numValueOf17;
            Integer numValueOf18;
            Integer numValueOf19;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf7 = null;
            } else {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf8 = null;
            } else {
                numValueOf8 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf9 = null;
            } else {
                numValueOf9 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf10 = null;
            } else {
                numValueOf10 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf11 = null;
            } else {
                numValueOf11 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf12 = null;
            } else {
                numValueOf12 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf13 = null;
            } else {
                numValueOf13 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf14 = null;
            } else {
                numValueOf14 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf15 = null;
            } else {
                numValueOf15 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf16 = null;
            } else {
                numValueOf16 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf17 = null;
            } else {
                numValueOf17 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf18 = null;
            } else {
                numValueOf18 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf19 = null;
            } else {
                numValueOf19 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new TemplateComplexity(string, string2, string3, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, numValueOf11, numValueOf12, numValueOf13, numValueOf14, numValueOf15, numValueOf16, numValueOf17, numValueOf18, numValueOf19, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateComplexity[] newArray(int i) {
            return new TemplateComplexity[i];
        }
    };

    @C09CT("ori_template_aimatting_cnt")
    public Integer aiMatting;

    @C09CT("ori_template_cfilter_adjust_cnt")
    public Integer cFilterAndAjustCnt;

    @C09CT("ori_template_curve_sp_cnt")
    public Integer curvespeedCnt;

    @C09CT("ori_template_dispatch_from")
    public String dispatchType;

    @C09CT("ori_template_effect_cnt")
    public Integer effect;

    @C09CT("ori_template_gfilter_adjust_cnt")
    public Integer gAdjustAndFilterCnt;

    @C09CT("ori_template_inner_pic_cnt")
    public Integer innerPicCnt;

    @C09CT("ori_template_inner_video_cnt")
    public Integer innerVideoCnt;

    @C09CT("ori_template_kf_cnt")
    public Integer kFCnt;

    @C09CT("ori_template_magic_cnt")
    public Integer magic;

    @C09CT("ori_template_magic_v2_cnt")
    public Integer magicV2;

    @C09CT("ori_template_music_cnt")
    public Integer musicCnt;

    @C09CT("ori_template_mutable_slot_cnt")
    public Integer mutableCnt;

    @C09CT("ori_template_pip_cnt")
    public Integer pipCnt;

    @C09CT("ori_template_same_asset_cnt")
    public Integer sameAssetGroupCnt;

    @C09CT("ori_template_sp_cnt")
    public Integer speedCnt;

    @C09CT("ori_template_id")
    public String templateID;

    @C09CT("ori_template_type")
    public Integer templateType;

    @C09CT("ori_template_url")
    public String templateUrl;

    @C09CT("template_zip_size")
    public Long templateZipSize;

    @C09CT("ori_template_txt_sticker_cnt")
    public Integer textStickerCnt;

    @C09CT("ori_template_track_cnt")
    public Integer trackCnt;

    @C09CT("ori_template_trans_cnt")
    public Integer transCnt;

    public TemplateComplexity() {
        this(null, null, null, null, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateID);
        parcel.writeString(this.templateUrl);
        parcel.writeString(this.dispatchType);
        Integer num = this.templateType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.pipCnt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.textStickerCnt;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.cFilterAndAjustCnt;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.gAdjustAndFilterCnt;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.musicCnt;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.effect;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.magic;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Integer num9 = this.magicV2;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        Integer num10 = this.aiMatting;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num10.intValue());
        }
        Integer num11 = this.kFCnt;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num11.intValue());
        }
        Integer num12 = this.speedCnt;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num12.intValue());
        }
        Integer num13 = this.curvespeedCnt;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num13.intValue());
        }
        Integer num14 = this.transCnt;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num14.intValue());
        }
        Integer num15 = this.trackCnt;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num15.intValue());
        }
        Integer num16 = this.mutableCnt;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num16.intValue());
        }
        Integer num17 = this.innerPicCnt;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num17.intValue());
        }
        Integer num18 = this.innerVideoCnt;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num18.intValue());
        }
        Integer num19 = this.sameAssetGroupCnt;
        if (num19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num19.intValue());
        }
        Long l = this.templateZipSize;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public TemplateComplexity(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Long l) {
        this.templateID = str;
        this.templateUrl = str2;
        this.dispatchType = str3;
        this.templateType = num;
        this.pipCnt = num2;
        this.textStickerCnt = num3;
        this.cFilterAndAjustCnt = num4;
        this.gAdjustAndFilterCnt = num5;
        this.musicCnt = num6;
        this.effect = num7;
        this.magic = num8;
        this.magicV2 = num9;
        this.aiMatting = num10;
        this.kFCnt = num11;
        this.speedCnt = num12;
        this.curvespeedCnt = num13;
        this.transCnt = num14;
        this.trackCnt = num15;
        this.mutableCnt = num16;
        this.innerPicCnt = num17;
        this.innerVideoCnt = num18;
        this.sameAssetGroupCnt = num19;
        this.templateZipSize = l;
    }
}
