package com.bytedance.android.livesdkapi.host;

import X.AnonymousClass1677;
import X.C006A;
import X.C09CT;
import X.C0JKV;
import X.C0L0G;
import X.C207213166p;
import X.C2188811AlT;
import X.C495480Jbu;
import X.C495490Jbv;
import X.C518580KVk;
import X.InterfaceC1631620sYq;
import X.InterfaceC1822460xWe;
import X.InterfaceC495470Jbt;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostSubscription extends C006A {

    public static final class Params {

        @C09CT("async")
        public boolean async;

        @C09CT("emotes_show_style")
        public int emotesShowStyle;

        @C09CT("logInfo")
        public Map<String, ? extends Object> logInfo = new HashMap();

        @C09CT("max_count")
        public int max_count;

        @C09CT("max_height")
        public int max_height;

        @C09CT("max_size")
        public int max_size;

        @C09CT("max_width")
        public int max_width;

        @C09CT("min_height")
        public int min_height;

        @C09CT("min_width")
        public int min_width;
    }

    public static final class Result {
        public int LIZ;
        public int LIZIZ;

        @C09CT("originFiles")
        public PhotoFile[] originFiles;

        @C09CT("tempFiles")
        public PhotoFile[] tempFiles;

        /* JADX INFO: loaded from: classes31.dex */
        public static final class PhotoFile {

            @C09CT("base64Data")
            public String base64;

            @C09CT("bitmap")
            public Bitmap bitmap;

            @C09CT("has_cropped")
            public boolean isCropped;

            @C09CT("is_little_photo")
            public boolean isLittlePhoto;

            @C09CT("path")
            public String path;

            @C09CT("size")
            public int size;

            @C09CT("with_text_sticker")
            public int withTextSticker;
        }
    }

    int Ah0();

    void Bc1(InterfaceC495470Jbt interfaceC495470Jbt);

    List<LiveSubMediaModel> CA1(Intent intent, String str);

    void Ca0(Function0<Unit> function0);

    void EB0(Context context, int i, String str);

    void Fy(Context context, String str, String str2, String str3, Integer num, String str4, String str5, int i, C495480Jbu c495480Jbu);

    void Ia2(Context context);

    void In1(Context context, Bundle bundle);

    void Is0(Context context, String str, int i, boolean z, int i2, boolean z2, boolean z3, C495490Jbv c495490Jbv);

    void KC0(Context context, String str, String str2, long j, long j2, String str3, long j3, boolean z);

    void KJ1(Activity activity, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Map<String, ? extends Object> map, int i10);

    void NR0(Context context, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10);

    void P51(AnonymousClass1677 anonymousClass1677, String str);

    void Q32(FragmentManager fragmentManager, String str, String str2, long j, long j2, String str3, long j3, boolean z, boolean z2);

    String Rj(String str);

    void Rq2(Context context, C0JKV c0jkv);

    Result T62(Fragment fragment, List<LiveSubMediaModel> list, Params params, boolean z);

    void WH(Context context, String str);

    boolean Xs();

    void ZR0(Context context, List<SubscribingInfo> list);

    void ch(Fragment fragment, String str);

    void g21(Context context, String str, String str2, String str3, String str4, int i, String str5, long j, long j2, int i2, Map<String, ? extends Object> map, ArrayList<SpriteImage> arrayList, String str6, String str7);

    void iL1(C518580KVk c518580KVk);

    void iQ1(AnonymousClass1677 anonymousClass1677);

    void kB2(Activity activity);

    String ky0(Context context, Uri uri);

    boolean l21();

    void mS1(C207213166p c207213166p);

    InterfaceC1822460xWe nN2();

    void tG2(Fragment fragment, int i, int i2, int i3, int i4, C0L0G c0l0g, Map<String, ? extends Object> map, int i5, int i6);

    void u60(Context context, Bundle bundle);

    void v72(Function0<Unit> function0);

    Result vV1(Fragment fragment, Intent intent, Params params);

    List<LiveSubMediaModel> vZ(Intent intent);

    Result.PhotoFile vq2(Context context, LiveSubMediaModel liveSubMediaModel, int i, int i2, int i3, int i4, boolean z);

    Fragment wt1(boolean z, Room room, long j, String str, String str2, String str3, Boolean bool, Function1<? super Integer, Unit> function1, SubOnlyVideoOpenParams subOnlyVideoOpenParams, Function0<Unit> function0);

    InterfaceC495470Jbt yj0(InterfaceC1631620sYq<? super String, ? super JSONObject, ? super Map<String, String>, Unit> interfaceC1631620sYq);

    /* JADX INFO: loaded from: classes21.dex */
    public static final class SpriteImage implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SpriteImage> CREATOR = new Parcelable.Creator<SpriteImage>() { // from class: X.0jgO
            @Override // android.os.Parcelable.Creator
            public final IHostSubscription.SpriteImage createFromParcel(Parcel parcel) {
                return new IHostSubscription.SpriteImage(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final IHostSubscription.SpriteImage[] newArray(int i) {
                return new IHostSubscription.SpriteImage[i];
            }
        };

        @C09CT("fps")
        public final int fps;

        @C09CT("image_height")
        public final int imageHeight;

        @C09CT("image_width")
        public final int imageWidth;

        @C09CT("image_x_num")
        public final int imageXNum;

        @C09CT("image_y_num")
        public final int imageYNum;

        @C09CT("sprite_num")
        public final int spriteNum;

        @C09CT("url")
        public final String url;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpriteImage)) {
                return false;
            }
            SpriteImage spriteImage = (SpriteImage) obj;
            return Intrinsics.LJFF(this.url, spriteImage.url) && this.spriteNum == spriteImage.spriteNum && this.imageXNum == spriteImage.imageXNum && this.imageYNum == spriteImage.imageYNum && this.imageHeight == spriteImage.imageHeight && this.imageWidth == spriteImage.imageWidth && this.fps == spriteImage.fps;
        }

        public final int hashCode() {
            return (((((((((((this.url.hashCode() * 31) + this.spriteNum) * 31) + this.imageXNum) * 31) + this.imageYNum) * 31) + this.imageHeight) * 31) + this.imageWidth) * 31) + this.fps;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SpriteImage(url=");
            sbLIZ.append(this.url);
            sbLIZ.append(", spriteNum=");
            sbLIZ.append(this.spriteNum);
            sbLIZ.append(", imageXNum=");
            sbLIZ.append(this.imageXNum);
            sbLIZ.append(", imageYNum=");
            sbLIZ.append(this.imageYNum);
            sbLIZ.append(", imageHeight=");
            sbLIZ.append(this.imageHeight);
            sbLIZ.append(", imageWidth=");
            sbLIZ.append(this.imageWidth);
            sbLIZ.append(", fps=");
            sbLIZ.append(this.fps);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.url);
            parcel.writeInt(this.spriteNum);
            parcel.writeInt(this.imageXNum);
            parcel.writeInt(this.imageYNum);
            parcel.writeInt(this.imageHeight);
            parcel.writeInt(this.imageWidth);
            parcel.writeInt(this.fps);
        }

        public SpriteImage(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.url = str;
            this.spriteNum = i;
            this.imageXNum = i2;
            this.imageYNum = i3;
            this.imageHeight = i4;
            this.imageWidth = i5;
            this.fps = i6;
        }
    }
}
