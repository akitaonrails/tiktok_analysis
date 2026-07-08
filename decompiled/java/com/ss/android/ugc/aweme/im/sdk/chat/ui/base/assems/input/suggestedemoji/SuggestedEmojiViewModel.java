package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji;

import X.C01GW;
import X.C06N8;
import X.C06NJ;
import X.C0I0B;
import X.C0YNP;
import X.C13BV;
import X.C13KL;
import X.C13LP;
import X.C1400340mXo;
import X.C15438062q;
import X.C1559260qg8;
import X.C1677606ha;
import X.C449580Hk4;
import X.C450770Hlz;
import X.C451030HmP;
import X.C452501pT;
import X.C453550HqT;
import X.C454580Hs8;
import X.C457780HxI;
import X.C463090IDz;
import X.C723600SZy;
import X.C830490Whz;
import X.InterfaceC0148002o;
import X.InterfaceC453050Hpf;
import X.InterfaceC453190Hpt;
import X.InterfaceC453710Hqj;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.emoji.analytics.IMEmojiAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.analytics.ReplyToStickerAnalytics;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes7.dex */
public final class SuggestedEmojiViewModel extends AssemViewModel<InterfaceC0148002o> implements InterfaceC453050Hpf {
    public static final /* synthetic */ int LLIZ = 0;
    public final C06N8 LL;
    public InterfaceC453190Hpt LLILLJJLI;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 538));
    public final IMEmojiAnalytics LLILZIL = IMEmojiAnalytics.LIZIZ;
    public final LifecycleEventObserver LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(13);
    }

    @Override // X.InterfaceC453050Hpf
    public final void rU() {
        InterfaceC453190Hpt interfaceC453190Hpt = this.LLILLJJLI;
        if (interfaceC453190Hpt != null) {
            interfaceC453190Hpt.ud();
        }
    }

    public SuggestedEmojiViewModel(C06N8 c06n8) {
        this.LL = c06n8;
        Map<String, String> map = C449580Hk4.LL;
        this.LLILZLL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel$callbackCleaner$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.LL.LLILLJJLI = null;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static List vQ2(String str) {
        List<Emoji> listLIZIZ;
        ?? arrayList;
        ?? arrayList2;
        InterfaceC453710Hqj imStickerInputPanelService;
        List<SetSticker> listLJIIJ;
        Integer num;
        Map<String, String> map = C449580Hk4.LL;
        if (((ConcurrentHashMap) map).isEmpty() || TextUtils.isEmpty(str) || ((listLIZIZ = C449580Hk4.LIZIZ(str, C449580Hk4.LLILLJJLI)) == null && (listLIZIZ = C449580Hk4.LIZIZ(str, map)) == null)) {
            listLIZIZ = C13BV.INSTANCE;
        }
        List<StickerItem> listLJIIZILJ = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIIZILJ(str, null);
        if (listLJIIZILJ != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIZILJ, 10));
            for (StickerItem stickerItem : listLJIIZILJ) {
                C451030HmP c451030HmP = new C451030HmP();
                StickerBase stickerBase = stickerItem.stickerBase;
                if (stickerBase != null) {
                    num = stickerBase.stickerType;
                } else {
                    num = null;
                }
                c451030HmP.LIZLLL = num;
                c451030HmP.LJ = C453550HqT.LJIIJJI(stickerItem);
                arrayList.add(c451030HmP);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        for (Emoji emoji : listLIZIZ) {
            C451030HmP c451030HmP2 = new C451030HmP();
            c451030HmP2.LIZIZ = C454580Hs8.LIZIZ(emoji);
            c451030HmP2.LIZJ = emoji;
            arrayList3.add(c451030HmP2);
        }
        if (C450770Hlz.LIZ().enable && (imStickerInputPanelService = IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService()) != null && (listLJIIJ = imStickerInputPanelService.LJIIJ(str)) != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
            for (SetSticker setSticker : listLJIIJ) {
                C451030HmP c451030HmP3 = new C451030HmP();
                c451030HmP3.LJ = setSticker;
                arrayList2.add(c451030HmP3);
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        return C13LP.LJLIL(arrayList2, C13LP.LJLIL(arrayList3, arrayList));
    }

    @Override // X.InterfaceC453050Hpf
    public final void vJ2(String str, String str2, String str3) {
        C457780HxI c457780HxI;
        SessionInfo sessionInfo;
        C06N8 c06n8;
        ReplyToStickerAnalytics replyToStickerAnalytics = ReplyToStickerAnalytics.LIZIZ;
        String str4 = (String) this.LLILZ.getValue();
        if (str4 != null && (c457780HxI = (C457780HxI) this.LLILLL.getValue()) != null && (sessionInfo = c457780HxI.LL) != null) {
            ReplyToStickerAnalytics.LIZIZ.LJ(str, str4, str2, C1677606ha.LIZ(sessionInfo.getChatType()), str3, null);
            if (!C06NJ.LIZIZ() && (c06n8 = this.LL) != null) {
                c06n8.LJII(AFwS229S0000000_2.get$arr$(304));
            }
            InterfaceC453190Hpt interfaceC453190Hpt = this.LLILLJJLI;
            if (interfaceC453190Hpt != null) {
                interfaceC453190Hpt.Un();
            }
        }
    }

    public final void wQ2(int i, String str, String str2, String str3) {
        SessionInfo sessionInfo;
        IMEmojiAnalytics iMEmojiAnalytics = this.LLILZIL;
        String str4 = (String) this.LLILZ.getValue();
        if (str4 == null) {
            return;
        }
        String strValueOf = String.valueOf(C0YNP.LJII((String) this.LLILZ.getValue()));
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        C457780HxI c457780HxI = (C457780HxI) this.LLILLL.getValue();
        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
            iMEmojiAnalytics.LIZLLL(str4, strValueOf, curUserId, C1677606ha.LIZ(sessionInfo.getChatType()), str, str2, str3, null, null, null, false, null, i, null, null, null, C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.InterfaceC453050Hpf
    public final void ZG1(String str, String str2, String str3, String str4, boolean z) {
        SessionInfo sessionInfo;
        BigInteger bigIntegerLIZ;
        String str5;
        C06N8 c06n8;
        IMEmojiAnalytics iMEmojiAnalytics = this.LLILZIL;
        Object value = this.LLILZ.getValue();
        if (value == null) {
            return;
        }
        String strValueOf = String.valueOf(C0YNP.LJII((String) this.LLILZ.getValue()));
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        C457780HxI c457780HxI = (C457780HxI) this.LLILLL.getValue();
        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
            String strLIZ = C1677606ha.LIZ(sessionInfo.getChatType());
            iMEmojiAnalytics.getClass();
            IMEmojiAnalytics.LIZJ.clear();
            IMEmojiAnalytics.LIZLLL.clear();
            if (curUserId.length() > 0) {
                C13KL.LIZ.getClass();
                bigIntegerLIZ = C13KL.LIZ(curUserId);
            } else {
                bigIntegerLIZ = null;
            }
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("conversation_id", value);
            c830490Whz.put("to_user_id", strValueOf);
            c830490Whz.put("from_user_id", curUserId);
            c830490Whz.put("chat_type", strLIZ);
            if (str != null) {
                c830490Whz.put("panel_type", str);
            }
            if (str2 != null) {
                c830490Whz.put("hashed_keyword", str2);
            }
            if (str3 != null) {
                c830490Whz.put("hashed_keyword_v2", str3);
            }
            if (z) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("has_ai_sticker", str5);
            if (bigIntegerLIZ != null) {
                c830490Whz.put("hash_uid", bigIntegerLIZ.toString());
            }
            if (str4 != null) {
                c830490Whz.put("input_language", str4);
            }
            IMEmojiAnalytics.LJ = c830490Whz;
            if (!C06NJ.LIZIZ() && (c06n8 = this.LL) != null) {
                c06n8.LJII(AFwS229S0000000_2.get$arr$(306));
            }
            InterfaceC453190Hpt interfaceC453190Hpt = this.LLILLJJLI;
            if (interfaceC453190Hpt != null) {
                interfaceC453190Hpt.Un();
            }
        }
    }
}
