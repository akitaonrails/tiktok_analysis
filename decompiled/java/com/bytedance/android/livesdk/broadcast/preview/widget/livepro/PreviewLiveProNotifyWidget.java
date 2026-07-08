package com.bytedance.android.livesdk.broadcast.preview.widget.livepro;

import X.C0JBN;
import X.C0UKZ;
import X.C13LE;
import X.C16F5;
import X.C16FV;
import X.C1819620xS4;
import X.C500260Jjc;
import X.C760180Trs;
import X.C770220UJg;
import X.C786410Ut5;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveProNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveProNotifyWidget extends PreviewWidget {
    public C16F5 LLILZ;
    public C16FV LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL = "";
    public boolean LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(LiveProNotifyBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(LiveProNotifyBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View view;
        super.E1();
        hide();
        View view2 = getView();
        this.LLILZ = view2 != null ? (C16F5) view2.findViewById(R.id.rr_) : null;
        View view3 = getView();
        this.LLILZIL = view3 != null ? (C16FV) view3.findViewById(R.id.rr9) : null;
        Double dLIZ = C0UKZ.LL.LIZ();
        this.LLILZLL = dLIZ != null ? (int) dLIZ.doubleValue() : 0;
        Double dLIZ2 = C0UKZ.LLF.LIZ();
        this.LLIZ = dLIZ2 != null ? (int) dLIZ2.doubleValue() : 0;
        if ((!C760180Trs.LJI() || !A1()) && (view = getView()) != null) {
            view.setBackgroundResource(R.drawable.dlu);
        }
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.br9);
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 361));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 362));
            dataChannel.BQ2(this, LiveModeChannel.class, new AwS591S0100000_12(this, 363));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return (C760180Trs.LJI() && A1()) ? R.layout.h29 : R.layout.h28;
    }

    public final void G1(LiveProInfo liveProInfo) {
        String str;
        ImageModel.Content imageContent;
        List urls;
        if (liveProInfo == null) {
            return;
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel imageModel = liveProInfo.banner;
        String str2 = null;
        if (imageModel != null && (urls = imageModel.getUrls()) != null) {
            str = (String) ListProtector.get(urls, 0);
        } else {
            str = null;
        }
        c0jbnLIZ.setUrl(str);
        if (C760180Trs.LJI() && A1()) {
            c0jbnLIZ.LJIJI(Float.valueOf(12.0f));
        }
        c0jbnLIZ.LJIIZILJ(ImageView.ScaleType.CENTER_CROP);
        c0jbnLIZ.LJJI(this.LLILZIL);
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            ImageModel imageModel2 = liveProInfo.banner;
            if (imageModel2 != null && (imageContent = imageModel2.getImageContent()) != null) {
                str2 = imageContent.name;
            }
            c16f5.setText(str2);
        }
        View view = this.contentView;
        if (view != null) {
            C500260Jjc.LJLIIIL(500L, view, new AwS378S0200000_12(this, liveProInfo, 23));
        }
    }
}
