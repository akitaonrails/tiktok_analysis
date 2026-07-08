package com.bytedance.geckox.policy.meta.file;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class ChannelFileAggregateStatus {
    public final String accessStateBase64;
    public final String existStateBase64;
    public final String fileFreshMergeBase64;
    public final int totalFileCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelFileAggregateStatus)) {
            return false;
        }
        ChannelFileAggregateStatus channelFileAggregateStatus = (ChannelFileAggregateStatus) obj;
        return Intrinsics.LJFF(this.existStateBase64, channelFileAggregateStatus.existStateBase64) && Intrinsics.LJFF(this.accessStateBase64, channelFileAggregateStatus.accessStateBase64) && Intrinsics.LJFF(this.fileFreshMergeBase64, channelFileAggregateStatus.fileFreshMergeBase64) && this.totalFileCount == channelFileAggregateStatus.totalFileCount;
    }

    public int hashCode() {
        return (((((this.existStateBase64.hashCode() * 31) + this.accessStateBase64.hashCode()) * 31) + this.fileFreshMergeBase64.hashCode()) * 31) + this.totalFileCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChannelFileAggregateStatus(existStateBase64=");
        sbLIZ.append(this.existStateBase64);
        sbLIZ.append(", accessStateBase64=");
        sbLIZ.append(this.accessStateBase64);
        sbLIZ.append(", fileFreshMergeBase64=");
        sbLIZ.append(this.fileFreshMergeBase64);
        sbLIZ.append(", totalFileCount=");
        sbLIZ.append(this.totalFileCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChannelFileAggregateStatus(String str, String str2, String str3, int i) {
        this.existStateBase64 = str;
        this.accessStateBase64 = str2;
        this.fileFreshMergeBase64 = str3;
        this.totalFileCount = i;
    }
}
