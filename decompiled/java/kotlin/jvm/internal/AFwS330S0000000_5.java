package kotlin.jvm.internal;

import X.C09AY;
import X.C0F4I;
import X.C0F4K;
import X.C1439820nZU;
import X.C1452640nuA;
import X.C21518819Ji;
import X.C2188811AlT;
import X.InterfaceC1631620sYq;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public class AFwS330S0000000_5 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static AFwS330S0000000_5 get$arr$(int i) {
        AFwS330S0000000_5 aFwS330S0000000_5 = (AFwS330S0000000_5) arr$.get(i);
        if (aFwS330S0000000_5 != null) {
            return aFwS330S0000000_5;
        }
        arr$.compareAndSet(i, null, new AFwS330S0000000_5(i));
        return (AFwS330S0000000_5) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS330S0000000_5(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS330S0000000_5 aFwS330S0000000_5, Object obj, Object obj2, Object obj3) {
        C1439820nZU c1439820nZU = (C1439820nZU) obj2;
        C1439820nZU c1439820nZU2 = (C1439820nZU) obj3;
        if (!((Boolean) obj).booleanValue() && c1439820nZU.LJFF == 1) {
            c1439820nZU2.LIZ.setMMusicPath(c1439820nZU.LIZ.getMMusicPath());
            c1439820nZU2.LIZ.setMusicOrigin(c1439820nZU.LIZ.getMusicOrigin());
            c1439820nZU2.LIZ.setMCurMusicLength(c1439820nZU.LIZ.getMCurMusicLength());
            c1439820nZU2.LIZ.setOriginalSound(c1439820nZU.LIZ.isOriginalSound());
            c1439820nZU2.LIZ.setMMusicType(c1439820nZU.LIZ.getMMusicType());
            c1439820nZU2.LIZ.setMusicVolume(c1439820nZU.LIZ.getMusicVolume());
            C1452640nuA.LJII(MusicBeanUtilKt.extractAVMusic(c1439820nZU.LIZ.creativeModel.musicBuzModel), false, c1439820nZU2.LIZ.creativeModel.musicBuzModel);
        }
        VideoPublishEditModel videoPublishEditModel = c1439820nZU2.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = c1439820nZU.LIZ;
        videoPublishEditModel.commentSetting = videoPublishEditModel2.commentSetting;
        videoPublishEditModel.isPrivate = videoPublishEditModel2.isPrivate;
        videoPublishEditModel.allowDownloadSetting = videoPublishEditModel2.allowDownloadSetting;
        InitialFilterConfig initialFilterConfig = videoPublishEditModel2.creativeModel.initialModel.filterConfig;
        if (initialFilterConfig != null) {
            InitialFilterConfig initialFilterConfig2 = videoPublishEditModel.creativeModel.initialModel.filterConfig;
            if (initialFilterConfig2 != null) {
                initialFilterConfig2.setAppliedInImageEditPage(initialFilterConfig.getAppliedInImageEditPage());
            }
            InitialFilterConfig initialFilterConfig3 = c1439820nZU2.LIZ.creativeModel.initialModel.filterConfig;
            if (initialFilterConfig3 != null) {
                initialFilterConfig3.setAppliedInVideoEditPage(initialFilterConfig.getAppliedInVideoEditPage());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS330S0000000_5 aFwS330S0000000_5, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        float fFloatValue = ((Number) obj3).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('M');
        sbLIZ.append(iIntValue / 2);
        sbLIZ.append(' ');
        sbLIZ.append(iIntValue2 / 2);
        sbLIZ.append(C0F4I.LIZJ);
        Path pathLIZLLL = C21518819Ji.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        Matrix matrix = new Matrix();
        matrix.setScale(fFloatValue, fFloatValue, iIntValue / 2.0f, iIntValue2 / 2.0f);
        pathLIZLLL.transform(matrix);
        return pathLIZLLL;
    }

    public static final Object invoke$2(AFwS330S0000000_5 aFwS330S0000000_5, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Number) obj3).floatValue();
        float f = iIntValue;
        float f2 = f / C0F4K.LIZJ;
        float f3 = C0F4K.LIZLLL * f2;
        float f4 = ((iIntValue2 - (C0F4K.LJ * f2)) / 2.0f) - (C0F4K.LJFF * f2);
        Path pathLIZLLL = C21518819Ji.LIZLLL(C0F4K.LIZIZ);
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f2);
        RectF rectF = C0F4K.LIZ;
        matrix.postTranslate(((f - f3) / 2.0f) - (rectF.left * f2), f4 - (rectF.top * f2));
        pathLIZLLL.transform(matrix);
        return pathLIZLLL;
    }
}
