package kotlin.jvm.internal;

import X.C09AY;
import X.C935650aSJ;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS5S2210000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S2210000_15 awS5S2210000_15, Object obj) {
        String targetFilePath;
        boolean zXQ2 = true;
        if (awS5S2210000_15.z4) {
            zXQ2 = ((MultiGuestSharedBgGuestViewModel) awS5S2210000_15.l2).xQ2(true);
        }
        String str = awS5S2210000_15.s0;
        String str2 = awS5S2210000_15.s1;
        DownloadInfo downloadInfo = (DownloadInfo) awS5S2210000_15.l3;
        if (downloadInfo != null) {
            targetFilePath = downloadInfo.getTargetFilePath();
        } else {
            targetFilePath = null;
        }
        obj.getClass();
        return new C935650aSJ(zXQ2, str, str2, targetFilePath);
    }

    public static final Object invoke$1(AwS5S2210000_15 awS5S2210000_15, Object obj) {
        String targetFilePath;
        boolean zXQ2 = true;
        if (awS5S2210000_15.z4) {
            zXQ2 = ((MultiGuestSharedBgGuestViewModel) awS5S2210000_15.l2).xQ2(true);
        }
        String str = awS5S2210000_15.s0;
        String str2 = awS5S2210000_15.s1;
        DownloadInfo downloadInfo = (DownloadInfo) awS5S2210000_15.l3;
        if (downloadInfo != null) {
            targetFilePath = downloadInfo.getTargetFilePath();
        } else {
            targetFilePath = null;
        }
        obj.getClass();
        return new C935650aSJ(zXQ2, str, str2, targetFilePath);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S2210000_15(boolean z, MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, String str2, DownloadInfo downloadInfo, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.l2 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = downloadInfo;
    }
}
