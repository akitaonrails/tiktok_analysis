package com.lynx.animax.player;

import X.C1282740jU8;
import X.C1285590jYj;
import X.C1285600jYk;
import X.C1285610jYl;
import android.media.MediaFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class VideoAsset {
    public static final String[] LJ = {"csd-0", "csd-1", "csd-2"};
    public String LIZ;
    public C1285600jYk LIZIZ;
    public boolean LIZJ;
    public C1285590jYj LIZLLL;

    public static VideoAsset create() {
        return new VideoAsset();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.animax.player.VideoAsset.LIZIZ():boolean");
    }

    public int getFrameCount() {
        C1285600jYk c1285600jYk = this.LIZIZ;
        if (c1285600jYk == null) {
            return 0;
        }
        return c1285600jYk.LJ;
    }

    public float getFrameRate() {
        C1285600jYk c1285600jYk = this.LIZIZ;
        if (c1285600jYk == null) {
            return 0.0f;
        }
        return c1285600jYk.LIZLLL;
    }

    public int getHeight() {
        C1285600jYk c1285600jYk = this.LIZIZ;
        if (c1285600jYk == null) {
            return 0;
        }
        return c1285600jYk.LIZJ;
    }

    public ByteBuffer getVideoParameterSets() {
        MediaFormat mediaFormat = this.LIZIZ.LIZ;
        if (mediaFormat == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iRemaining = 0;
        for (String str : LJ) {
            if (!mediaFormat.containsKey(str)) {
                break;
            }
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
            if (byteBuffer != null && byteBuffer.remaining() > 0) {
                arrayList.add(byteBuffer);
                iRemaining += byteBuffer.remaining();
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put(((ByteBuffer) it2.next()).duplicate());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public int getWidth() {
        C1285600jYk c1285600jYk = this.LIZIZ;
        if (c1285600jYk == null) {
            return 0;
        }
        return c1285600jYk.LIZIZ;
    }

    public boolean isHEVCFormat() {
        MediaFormat mediaFormat;
        String string;
        C1285600jYk c1285600jYk = this.LIZIZ;
        return (c1285600jYk == null || (mediaFormat = c1285600jYk.LIZ) == null || (string = mediaFormat.getString("mime")) == null || !string.equalsIgnoreCase("video/hevc")) ? false : true;
    }

    public final ByteBuffer LIZ(C1285610jYl c1285610jYl) {
        C1285590jYj c1285590jYj;
        ByteBuffer byteBuffer;
        if (c1285610jYl == null || (c1285590jYj = this.LIZLLL) == null || (byteBuffer = c1285590jYj.LIZ) == null) {
            return null;
        }
        byteBuffer.position(0);
        byteBuffer.limit(c1285610jYl.LIZIZ);
        byteBuffer.position(c1285610jYl.LIZ);
        return byteBuffer;
    }

    public ByteBuffer getFrameData(int i) {
        C1285590jYj c1285590jYj = this.LIZLLL;
        C1285610jYl c1285610jYl = null;
        if (c1285590jYj != null) {
            ArrayList<C1285610jYl> arrayList = c1285590jYj.LIZJ;
            if (i >= 0 && i < arrayList.size()) {
                c1285610jYl = (C1285610jYl) ListProtector.get(arrayList, i);
            }
        }
        return LIZ(c1285610jYl);
    }

    public int getPrevKeyFrame(int i) {
        ArrayList<Integer> arrayList = this.LIZLLL.LIZIZ;
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return ((Integer) ListProtector.get(arrayList, iBinarySearch)).intValue();
    }

    public boolean isSupportDecodeBySystem(boolean z) {
        MediaFormat mediaFormat;
        String string;
        C1282740jU8 c1282740jU8;
        C1285600jYk c1285600jYk = this.LIZIZ;
        if (c1285600jYk != null && (mediaFormat = c1285600jYk.LIZ) != null && (string = mediaFormat.getString("mime")) != null) {
            synchronized (C1282740jU8.class) {
                if (C1282740jU8.LIZJ == null) {
                    C1282740jU8.LIZJ = new C1282740jU8();
                }
                c1282740jU8 = C1282740jU8.LIZJ;
            }
            if (c1282740jU8.LIZ(string, z)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean loadLocal(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.animax.player.VideoAsset.loadLocal(java.lang.String):boolean");
    }
}
