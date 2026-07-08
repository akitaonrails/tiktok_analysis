package kotlin.jvm.internal;

import X.C09AY;
import X.C1096600edu;
import X.C1161920gLG;
import X.C20684815ws;
import X.InterfaceC1363540laS;
import X.InterfaceC474360Iiw;
import android.content.Context;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostProduceConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS65S2100000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS65S2100000_27 awS65S2100000_27) {
        boolean z;
        ILiveOuterService iLiveOuterService;
        InterfaceC1363540laS interfaceC1363540laSE4;
        String str;
        Map<String, String> mapWQ2;
        LiveRepostVM liveRepostVMT1;
        if (C1096600edu.LIZIZ() && LiveRepostProduceConfig.INSTANCE.config().repostEducationPanel) {
            z = true;
        } else {
            z = false;
        }
        Map<String, String> mapWQ22 = null;
        if (z) {
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            final LabelContainerWidget labelContainerWidget = (LabelContainerWidget) awS65S2100000_27.l2;
            Context context = labelContainerWidget.context;
            InterfaceC474360Iiw interfaceC474360Iiw = new InterfaceC474360Iiw() { // from class: X.0yAw
                @Override // X.InterfaceC474360Iiw
                public final void LIZJ() {
                    LiveRepostVM liveRepostVMT12 = labelContainerWidget.T1();
                    if (liveRepostVMT12 != null) {
                        liveRepostVMT12.FQ2(labelContainerWidget.context);
                    }
                }
            };
            LiveRepostVM liveRepostVMT12 = labelContainerWidget.T1();
            if (liveRepostVMT12 != null) {
                mapWQ2 = liveRepostVMT12.wQ2();
            } else {
                mapWQ2 = null;
            }
            if (!iRoomFunctionService.je1(context, interfaceC474360Iiw, "repost_panel", mapWQ2) && (liveRepostVMT1 = ((LabelContainerWidget) awS65S2100000_27.l2).T1()) != null) {
                liveRepostVMT1.FQ2(((LabelContainerWidget) awS65S2100000_27.l2).context);
            }
        } else {
            LiveRepostVM liveRepostVMT13 = ((LabelContainerWidget) awS65S2100000_27.l2).T1();
            if (liveRepostVMT13 != null) {
                liveRepostVMT13.FQ2(((LabelContainerWidget) awS65S2100000_27.l2).context);
            }
        }
        LiveRepostVM liveRepostVMT14 = ((LabelContainerWidget) awS65S2100000_27.l2).T1();
        if (liveRepostVMT14 != null) {
            mapWQ22 = liveRepostVMT14.wQ2();
            String str2 = awS65S2100000_27.s0;
            String str3 = awS65S2100000_27.s1;
            mapWQ22.put("reposted_userid", str2);
            if (str3 != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC1363540laSE4 = iLiveOuterService.E4()) != null) {
                if (interfaceC1363540laSE4.onlyEmoji(str3)) {
                    str = "emoji";
                } else if (interfaceC1363540laSE4.containEmoji(str3)) {
                    str = "text_emoji";
                } else {
                    str = "text";
                }
                mapWQ22.put("message_type", str);
                mapWQ22.put("repost_length", String.valueOf(interfaceC1363540laSE4.LJIIIIZZ(str3)));
            }
        }
        C20684815ws.LJIILLIIL("livesdk_repost_user_status_click", mapWQ22);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS65S2100000_27 awS65S2100000_27) {
        Map<String, String> mapWQ2;
        String str;
        ILiveOuterService iLiveOuterService;
        InterfaceC1363540laS interfaceC1363540laSE4;
        String str2;
        LabelContainerWidget labelContainerWidget = (LabelContainerWidget) awS65S2100000_27.l2;
        if (!labelContainerWidget.LLJZ) {
            labelContainerWidget.LLJZ = true;
            LiveRepostVM liveRepostVMT1 = labelContainerWidget.T1();
            if (liveRepostVMT1 != null) {
                mapWQ2 = liveRepostVMT1.wQ2();
                String str3 = awS65S2100000_27.s0;
                String str4 = awS65S2100000_27.s1;
                LabelContainerWidget labelContainerWidget2 = (LabelContainerWidget) awS65S2100000_27.l2;
                mapWQ2.put("reposted_userid", str3);
                if (str4 != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC1363540laSE4 = iLiveOuterService.E4()) != null) {
                    if (interfaceC1363540laSE4.onlyEmoji(str4)) {
                        str2 = "emoji";
                    } else if (interfaceC1363540laSE4.containEmoji(str4)) {
                        str2 = "text_emoji";
                    } else {
                        str2 = "text";
                    }
                    mapWQ2.put("message_type", str2);
                    mapWQ2.put("repost_length", String.valueOf(interfaceC1363540laSE4.LJIIIIZZ(str4)));
                }
                LiveRepostVM liveRepostVMT12 = labelContainerWidget2.T1();
                if (liveRepostVMT12 != null && !liveRepostVMT12.LLIZ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                mapWQ2.put("is_first_index", str);
                LiveRepostVM liveRepostVMT13 = labelContainerWidget2.T1();
                if (liveRepostVMT13 != null) {
                    liveRepostVMT13.LLIZ = true;
                }
            } else {
                mapWQ2 = null;
            }
            C20684815ws.LJIILLIIL("livesdk_repost_user_status_show", mapWQ2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S2100000_27(LabelContainerWidget labelContainerWidget, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = labelContainerWidget;
        this.s0 = str;
        this.s1 = str2;
    }
}
