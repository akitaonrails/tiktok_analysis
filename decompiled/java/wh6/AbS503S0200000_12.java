package wh6;

import X.AbstractC1110520f0M;
import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.AbstractC21673619ry;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C0KYR;
import X.C0UKZ;
import X.C0UX6;
import X.C13LP;
import X.C15438062q;
import X.C20337914i1;
import X.C23250099c;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C748770TYt;
import X.C759220TqK;
import X.C759230TqL;
import X.C759310TqT;
import X.C781270Ukn;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC20484815Dq;
import android.app.Dialog;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.chatroom.model.ChatBatchApproveRequest;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveModeratorNewSuggestionSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReplayShareSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class AbS503S0200000_12 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS503S0200000_12 abS503S0200000_12, View view) {
        AbstractC21673619ry adapter;
        C759310TqT c759310TqT;
        DataChannel dataChannelLJ;
        Room room;
        String str;
        if (view != null) {
            RecyclerView recyclerViewLLII = ((CommunityFlaggedManageSheetFragment) abS503S0200000_12.l0).LLII();
            if (recyclerViewLLII != null) {
                adapter = recyclerViewLLII.getAdapter();
            } else {
                adapter = null;
            }
            if ((adapter instanceof C759310TqT) && (c759310TqT = (C759310TqT) adapter) != null) {
                List<C759230TqL> list = c759310TqT.LLILZLL;
                ArrayList arrayList = new ArrayList();
                for (C759230TqL c759230TqL : list) {
                    if (c759230TqL.LIZIZ) {
                        arrayList.add(c759230TqL);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC1110520f0M<? extends AbstractC1136060ffY> abstractC1110520f0M = ((C759230TqL) it2.next()).LIZ;
                    if (abstractC1110520f0M != null) {
                        arrayList2.add(abstractC1110520f0M);
                    }
                }
                if (!arrayList2.isEmpty() && (dataChannelLJ = C475510Ikn.LJ((CommunityFlaggedManageSheetFragment) abS503S0200000_12.l0)) != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
                    ChatBatchApproveRequest chatBatchApproveRequest = new ChatBatchApproveRequest();
                    chatBatchApproveRequest.roomId = room.getId();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Long.valueOf(((AbstractC1110800f0o) it3.next()).getMessageId()));
                    }
                    chatBatchApproveRequest.msgIds = new ArrayList(arrayList3);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_approve");
                    c474500IjALIZ.LJIJJLI((DataChannel) abS503S0200000_12.l1);
                    c474500IjALIZ.LJJII(C0KYR.LIZJ((DataChannel) abS503S0200000_12.l1), "admin_type");
                    c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(chatBatchApproveRequest.msgIds, ",", null, null, 0, null, null, 62), "msg_id_list");
                    List<C759230TqL> list2 = c759310TqT.LLILZLL;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<C759230TqL> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        AbstractC1110520f0M<? extends AbstractC1136060ffY> abstractC1110520f0M2 = it4.next().LIZ;
                        if (abstractC1110520f0M2 != null) {
                            arrayList4.add(abstractC1110520f0M2);
                        }
                    }
                    c474500IjALIZ.LJJII(Integer.valueOf(arrayList4.size()), "num_show");
                    c474500IjALIZ.LJJII(Integer.valueOf(arrayList2.size()), "num_approve");
                    c474500IjALIZ.LJJII(Long.valueOf((SystemClock.elapsedRealtime() - ((CommunityFlaggedManageSheetFragment) abS503S0200000_12.l0).LLLI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
                    c474500IjALIZ.LJJII(Integer.valueOf(((CommunityFlaggedManageSheetFragment) abS503S0200000_12.l0).LLLII), "user_scroll");
                    if (((CommunityFlaggedManageSheetFragment) abS503S0200000_12.l0).LLLIIIL != 0) {
                        str = "eye_icon";
                    } else {
                        str = "filtered_comments";
                    }
                    c474500IjALIZ.LJJII(str, "enter_from");
                    c474500IjALIZ.LIZ();
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((CommunityFlaggedManageSheetFragment) abS503S0200000_12.l0), null, null, new C759220TqK((CommunityFlaggedManageSheetFragment) abS503S0200000_12.l0, c759310TqT, chatBatchApproveRequest, arrayList2, room, null), 3);
                }
            }
        }
    }

    public static final void LIZ$1(AbS503S0200000_12 abS503S0200000_12, View view) {
        InterfaceC20484815Dq interfaceC20484815DqLH1;
        if (view != null) {
            if (LiveReplayShareSetting.INSTANCE.enable()) {
                RedDotExtensionKt.LIZ(C0UX6.RED_DOT_MODERATOR_REPLAY_SHARE_SETTING);
            }
            C0UKZ.LLJILJIL.LJFF(Boolean.FALSE);
            C500260Jjc.LJIILIIL((View) abS503S0200000_12.l0);
            if (LiveModeratorNewSuggestionSetting.INSTANCE.isEnable()) {
                interfaceC20484815DqLH1 = C781270Ukn.LJIIZILJ().wj2("");
            } else {
                interfaceC20484815DqLH1 = C781270Ukn.LJIIZILJ().lH1();
            }
            if (interfaceC20484815DqLH1 != null) {
                ((BasePreviewSettingMainFragmentSheetInitializer) abS503S0200000_12.l1).LLILLL.LJIIJ(interfaceC20484815DqLH1, "moderator_list");
            }
            ((BasePreviewSettingMainFragmentSheetInitializer) abS503S0200000_12.l1).LJJIJL("click");
        }
    }

    public static final void LIZ$2(AbS503S0200000_12 abS503S0200000_12, View view) {
        String str;
        LiveMode liveMode;
        if (view != null) {
            ((BasePreviewSettingMainFragmentSheetInitializer) abS503S0200000_12.l0).LLILLL.LJIIJ(C781270Ukn.LIZIZ().pn1("from_page_preview", new AwS591S0100000_12((BasePreviewSettingMainFragmentSheetInitializer) abS503S0200000_12.l0, 403)), "live_comment_setting");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_settings_click");
            DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) abS503S0200000_12.l0).LLILLJJLI;
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                str = liveMode.logStreamingType;
            } else {
                str = null;
            }
            c474500IjALIZ.LJJ(str);
            c474500IjALIZ.LJIJJLI(((BasePreviewSettingMainFragmentSheetInitializer) abS503S0200000_12.l0).LLILLJJLI);
            c474500IjALIZ.LJJII(C0KYR.LIZJ(((BasePreviewSettingMainFragmentSheetInitializer) abS503S0200000_12.l0).LLILLJJLI), "admin_type");
            c474500IjALIZ.LIZ();
            C20337914i1<Boolean> c20337914i1 = C0UKZ.LLJILJILJ;
            Boolean bool = Boolean.FALSE;
            c20337914i1.LJFF(bool);
            C20337914i1<Map<String, Boolean>> c20337914i12 = InterfaceC1106030et7.D4;
            Map<String, Boolean> mapLIZIZ = c20337914i12.LIZIZ();
            mapLIZIZ.put("1", bool);
            c20337914i12.LJFF(mapLIZIZ);
            View view2 = (View) abS503S0200000_12.l1;
            if (view2 != null) {
                C500260Jjc.LJIILIIL(view2);
            }
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_COMMENT_SETTING);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$3(wh6.AbS503S0200000_12 r6, android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS503S0200000_12.LIZ$3(wh6.AbS503S0200000_12, android.view.View):void");
    }

    public static final void LIZ$4(AbS503S0200000_12 abS503S0200000_12, View view) {
        Function1<BlockWord, Unit> function1;
        if (view != null && (function1 = ((C748770TYt) abS503S0200000_12.l0).LLILLJJLI) != null) {
            function1.invoke((BlockWord) abS503S0200000_12.l1);
        }
    }

    public static final void LIZ$5(AbS503S0200000_12 abS503S0200000_12, View view) {
        if (view != null) {
            C786410Ut5.LIZIZ((Dialog) abS503S0200000_12.l0);
            ((Function0) abS503S0200000_12.l1).invoke();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS503S0200000_12(android.view.View r4, com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer r5, int r6) {
        /*
            r3 = this;
            r3.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L11
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 300(0x12c, double:1.48E-321)
        Ld:
            r2.<init>(r0)
            return
        L11:
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r0 = 300(0x12c, double:1.48E-321)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS503S0200000_12.<init>(android.view.View, com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS503S0200000_12(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
