package com.bytedance.android.livesdk.adminsetting.comment.filter;

import X.AbstractC1110520f0M;
import X.AbstractC1136060ffY;
import X.AbstractC21673619ry;
import X.C001A;
import X.C01GW;
import X.C0IMD;
import X.C1109770ez9;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C14KS;
import X.C1506330pIl;
import X.C1515210pX5;
import X.C1516680pZS;
import X.C158B;
import X.C16FS;
import X.C23250099c;
import X.C292401Bi;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C759230TqL;
import X.C759260TqO;
import X.C759310TqT;
import X.C776250Uch;
import X.C786410Ut5;
import X.InterfaceC1112060f2q;
import Y.ACListenerS147S0100000_12;
import Y.AsS39S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS503S0200000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class CommunityFlaggedManageSheetFragment extends LiveSheetFragment implements OnIMMessageListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZiYjJCHELIOSI2JjFiLyY/PCA+Zww8JSg5JyYnMQMgKCg0LSEBKCEyLyAfISo2PAM+KCg+LSs4";
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public long LLLIIIL;
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 147));
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 140));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 148));
    public final C01GW LLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 144));
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 142));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 143));
    public final C01GW LLLFFI = C292401Bi.LIZ(new AwS556S0100000_12(this, 145));
    public final C01GW LLLFZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 141));
    public long LLLI = SystemClock.elapsedRealtime();
    public final C01GW LLLIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 146));

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "community_flagged";
    }

    public final RecyclerView LLII() {
        return (RecyclerView) this.LLJLLL.getValue();
    }

    public final C16FS wS() {
        return (C16FS) this.LLJZ.getValue();
    }

    public final void zS() {
        int i = this.LLLIIII;
        if (i == 0) {
            C500260Jjc.LJIILIIL((View) this.LLLFF.getValue());
            C500260Jjc.LJIILIIL((View) this.LLLF.getValue());
            C500260Jjc.LLFFF((View) this.LLLFFI.getValue());
            C500260Jjc.LLFFF((View) this.LLL.getValue());
            return;
        }
        if (i == 1) {
            C500260Jjc.LJIILIIL((View) this.LLLFFI.getValue());
            C500260Jjc.LJIILIIL((View) this.LLL.getValue());
            C500260Jjc.LLFFF((View) this.LLLF.getValue());
        } else if (i == 2 || i == 3) {
            C500260Jjc.LJIILIIL((View) this.LLLFFI.getValue());
            C500260Jjc.LJIILIIL((View) this.LLLF.getValue());
            C500260Jjc.LLFFF((View) this.LLL.getValue());
            C500260Jjc.LLFFF((View) this.LLLFF.getValue());
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        IMessageManager iMessageManager;
        super.onDestroyView();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (iMessageManager = (IMessageManager) dataChannelLJ.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener((OnIMMessageListener) this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public static List yS(List list) {
        AbstractC1136060ffY abstractC1136060ffY;
        ArrayList arrayList = new ArrayList();
        for (ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage : (ArrayList) list) {
            try {
                Class<? extends AbstractC1136060ffY> messageClass = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).getMessageClass(baseProtoMessage.method);
                if (messageClass != null) {
                    C1515210pX5.LIZLLL().getClass();
                    C0IMD c0imdLJI = C1515210pX5.LJI(messageClass);
                    if (c0imdLJI != null) {
                        C1516680pZS c1516680pZS = new C1516680pZS();
                        c1516680pZS.LJIIL(new C1506330pIl(baseProtoMessage.payload));
                        abstractC1136060ffY = (AbstractC1136060ffY) c0imdLJI.LIZJ(c1516680pZS);
                    } else {
                        abstractC1136060ffY = null;
                    }
                    if (abstractC1136060ffY != null) {
                        abstractC1136060ffY.generalMessageType = baseProtoMessage.msgType;
                        abstractC1136060ffY.isHistoryMessage = true;
                        abstractC1136060ffY.historyMessageFromApi = true;
                        abstractC1136060ffY.receiveTime = C158B.LIZ();
                        arrayList.add(abstractC1136060ffY);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.dimBehindType = 0;
        sheetOptions.LIZ(1, null);
        return sheetOptions;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        ChatMessage chatMessage;
        AbstractC1110520f0M abstractC1110520f0M;
        AbstractC21673619ry adapter;
        C759310TqT c759310TqT = null;
        if ((iMessage instanceof ChatMessage) && (chatMessage = (ChatMessage) iMessage) != null && chatMessage.LIZ()) {
            InterfaceC1112060f2q interfaceC1112060f2qOo = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(chatMessage);
            if ((interfaceC1112060f2qOo instanceof AbstractC1110520f0M) && (abstractC1110520f0M = (AbstractC1110520f0M) interfaceC1112060f2qOo) != null) {
                RecyclerView recyclerViewLLII = LLII();
                if (recyclerViewLLII != null) {
                    adapter = recyclerViewLLII.getAdapter();
                } else {
                    adapter = null;
                }
                if (adapter instanceof C759310TqT) {
                    c759310TqT = (C759310TqT) adapter;
                }
                abstractC1110520f0M.LJII((C1109770ez9) this.LLLIIL.getValue());
                if (c759310TqT != null) {
                    if (c759310TqT.LLILZLL.size() == 0) {
                        Map<String, Object> map = C1338270kvh.LIZ;
                        return;
                    }
                    ListProtector.add(c759310TqT.LLILZLL, 1, new C759230TqL(abstractC1110520f0M, false, 14));
                    NextLiveData<Integer> nextLiveData = c759310TqT.LLIZ;
                    List<C759230TqL> list = c759310TqT.LLILZLL;
                    ArrayList arrayList = new ArrayList();
                    for (C759230TqL c759230TqL : list) {
                        if (c759230TqL.LIZ != null) {
                            arrayList.add(c759230TqL);
                        }
                    }
                    nextLiveData.setValue(Integer.valueOf(arrayList.size()));
                    c759310TqT.notifyItemInserted(1);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uS(X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1112060f2q>> r18) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment.uS(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        long j;
        int i;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("from_page");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "live_comment_setting")) {
            C500260Jjc.LJIILIIL((View) this.LLJZIJLIL.getValue());
            C500260Jjc.LLFFF((View) this.LLLFZ.getValue());
        } else {
            C500260Jjc.LLFFF((View) this.LLJZIJLIL.getValue());
            C500260Jjc.LJIILIIL((View) this.LLLFZ.getValue());
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null) {
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            j = arguments2.getLong("target_message_id");
        } else {
            j = 0;
        }
        this.LLLIIIL = j;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i = arguments3.getInt("presenter_index");
        } else {
            i = 0;
        }
        this.LLLIIIIL = i;
        View view2 = (View) this.LLJZIJLIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 126), view2);
        }
        if (this.LLJL != null) {
            View view3 = (View) this.LLLFZ.getValue();
            if (view3 != null) {
                C786410Ut5.I7(new AbS694S0100000_12(this, 9), view3);
            }
        } else {
            View view4 = (View) this.LLLFZ.getValue();
            if (view4 != null) {
                C786410Ut5.I7(new AbS694S0100000_12(this, 10), view4);
            }
            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.tqy).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (((double) C14KS.LIZLLL()) * 0.7d);
                C786410Ut5.W5(view, layoutParams);
            }
        }
        RecyclerView recyclerViewLLII = LLII();
        if (recyclerViewLLII != null) {
            recyclerViewLLII.addOnScrollListener(new AsS39S0100000_12(this, 1));
        }
        zS();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C759260TqO(this, view, dataChannelLJ, null), 3);
        IMessageManager iMessageManager = (IMessageManager) dataChannelLJ.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.CHAT.getIntType(), (OnIMMessageListener) this);
        }
        C16FS c16fsWS = wS();
        if (c16fsWS != null) {
            C786410Ut5.I7(new AbS503S0200000_12(this, dataChannelLJ, 0), c16fsWS);
        }
        this.LLLI = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g55, viewGroup, false);
    }
}
