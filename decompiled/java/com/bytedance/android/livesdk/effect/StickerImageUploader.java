package com.bytedance.android.livesdk.effect;

import X.AbstractC19484711Kz;
import X.C09CT;
import X.C0UC3;
import X.C0VSJ;
import X.C11JL;
import X.C11LS;
import X.C11NN;
import X.C11S5;
import X.C1701940uOG;
import X.C207206166i;
import X.C207207166j;
import X.C2188811AlT;
import X.C470590Icr;
import X.C769390UGb;
import X.EnumC19496911Pr;
import X.EnumC771350UNp;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import Y.AfS148S0200000_12;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public final class StickerImageUploader {
    public C11JL LIZ;
    public C11LS LIZIZ;
    public boolean LIZJ;
    public final C769390UGb<C0UC3> LIZLLL = new C769390UGb<>();

    public interface UploadStickerImageApi {
        @InterfaceC1501170pAR("/webcast/review/upload_green_screen/")
        AbstractC19484711Kz<C470590Icr<UploadResponse>> upload(@InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2);
    }

    public final void LIZIZ() {
        C11NN c11nnLJLJLJ;
        if (this.LIZJ) {
            return;
        }
        int i = 1;
        this.LIZJ = true;
        C769390UGb<C0UC3> c769390UGb = this.LIZLLL;
        Bitmap bitmapDecodeStream = null;
        C0UC3 c0uc3 = (C0UC3) (c769390UGb.LIZ.size() == 0 ? null : ListProtector.remove(c769390UGb.LIZ, 0));
        if (c0uc3 == null || c0uc3.LIZ == null) {
            this.LIZJ = false;
            return;
        }
        if (!new C0VSJ(c0uc3.LIZ).exists()) {
            this.LIZJ = false;
            return;
        }
        String str = c0uc3.LIZ;
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.length() / 1024 < 300) {
            c11nnLJLJLJ = C11NN.LJIIIIZZ(c0vsj);
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 > i3 && i2 > 600) {
                i = i2 / 600;
            } else if (i2 < i3 && i3 > 800) {
                i = i3 / 800;
            }
            options.inSampleSize = i;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            if (bitmapDecodeFile != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                int i4 = 90;
                while (byteArrayOutputStream.toByteArray().length / 1024 > 300) {
                    byteArrayOutputStream.reset();
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                    i4 -= 10;
                }
                bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(UUID.randomUUID().toString());
            sbLIZ.append(".jpg");
            c11nnLJLJLJ = C207206166i.LIZJ(new C207207166j(C2188811AlT.LIZIZ(sbLIZ), EnumC771350UNp.STICKER, "image", "jpg", bitmapDecodeStream, true, Bitmap.CompressFormat.JPEG, 100, "")).LJLJLJ(EnumC19496911Pr.LATEST);
        }
        this.LIZIZ = (C11LS) c11nnLJLJLJ.LJIIJ(C1701940uOG.LIZIZ()).LJIIZILJ(C11S5.LIZ()).LJIILIIL(new AfS148S0200000_12(this, c0uc3, 30), new AfS148S0200000_12(this, c0uc3, 31));
    }

    public class UploadResponse {

        @C09CT("url")
        public String url;

        public UploadResponse(StickerImageUploader stickerImageUploader) {
        }
    }

    public final void LIZ(C0UC3 c0uc3) {
        C769390UGb<C0UC3> c769390UGb = this.LIZLLL;
        if (c769390UGb.LIZ.indexOf(c0uc3) != -1) {
            c769390UGb.LIZ.remove(c0uc3);
        }
        if (c769390UGb.LIZIZ <= c769390UGb.LIZ.size()) {
            ListProtector.remove(c769390UGb.LIZ, c769390UGb.LIZIZ - 1);
        }
        ListProtector.add(c769390UGb.LIZ, 0, c0uc3);
        if (this.LIZLLL.LIZ.size() != 0) {
            LIZIZ();
        }
    }
}
