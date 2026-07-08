package com.ss.android.ugc.aweme.utils;

import X.C0I0B;
import X.C0I1M;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z58;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LN;
import X.C13LP;
import X.C1461005nk;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C461720I8s;
import X.C985403tE;
import X.InterfaceC876950Yaj;
import Y.AComparatorS33S0000000_14;
import android.content.Context;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMAnonymousServiceImpl implements IIMAnonymousService {
    @Override // com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService
    public final boolean LIZ(String str) {
        if (str.length() == 0) {
            return false;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if ((c0y8tLIZ == null || !c0y8tLIZ.isSingleChat()) && C0Z58.LIZ.LIZ(str) && !C1461005nk.LIZ.LJIIIZ(c0y8tLIZ, Long.valueOf(C461720I8s.LIZJ()), false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService
    public final boolean LJ(String str) {
        C0Y8T c0y8tLIZ;
        if (str.length() != 0 && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) != null && !c0y8tLIZ.isSingleChat() && C0Z58.LIZ.LIZ(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService
    public final CharSequence LIZJ(String str, TextContent textContent, CharSequence charSequence) {
        List<RichTextInfo> listLJLLLL;
        List<RichTextInfo> richTextInfos = textContent.getRichTextInfos();
        if (richTextInfos != null && !richTextInfos.isEmpty()) {
            if (LIZ(str) && charSequence != null && charSequence.length() != 0) {
                StringBuilder sb = new StringBuilder(charSequence);
                List<RichTextInfo> richTextInfos2 = textContent.getRichTextInfos();
                if (richTextInfos2 != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS33S0000000_14(5), richTextInfos2)) != null) {
                    int length = 0;
                    for (RichTextInfo richTextInfo : listLJLLLL) {
                        String str2 = richTextInfo.mentionedUid;
                        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
                        if (str2 != null && str2.length() != 0 && richTextInfo.type != C0I1M.MENTION_ALL.getValue() && !C461720I8s.LJI(str2) && !C1461005nk.LIZ.LJIIIZ(c0y8tLIZ, C2095008Iq.LJIILIIL(str2), true)) {
                            int i = richTextInfo.position;
                            int i2 = i + 1 + length;
                            int i3 = i + richTextInfo.length + length;
                            int length2 = sb.length();
                            if (i3 > length2) {
                                i3 = length2;
                            }
                            if (i2 >= 0 && i2 < sb.length()) {
                                int i4 = i3 - i2;
                                Character chLJLLILLLL = C13LN.LJLLILLLL(sb.substring(i2, i3));
                                if (chLJLLILLLL != null) {
                                    char cCharValue = chLJLLILLLL.charValue();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(cCharValue);
                                    sbLIZ.append("***");
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    if (strLIZIZ != null && strLIZIZ.length() != 0) {
                                        sb.replace(i2, i3, strLIZIZ);
                                        length += strLIZIZ.length() - i4;
                                    }
                                }
                                richTextInfo.setNeedToBeAnonymous(true);
                            }
                        } else {
                            richTextInfo.setAnonymousStartPosition(richTextInfo.position + length);
                        }
                    }
                    return sb.toString();
                }
                return charSequence;
            }
            List<RichTextInfo> richTextInfos3 = textContent.getRichTextInfos();
            if (richTextInfos3 != null) {
                Iterator<RichTextInfo> it2 = richTextInfos3.iterator();
                while (it2.hasNext()) {
                    it2.next().resetAnonymous();
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService
    public final boolean LIZLLL(String str, String str2, boolean z) {
        if (str.length() == 0 || str2.length() == 0 || C461720I8s.LJI(str2) || !LIZ(str)) {
            return false;
        }
        return !C1461005nk.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str), C2095008Iq.LJIILIIL(str2), z);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService
    public final boolean LJFF(String str, String str2, boolean z) {
        if (C461720I8s.LJI(str2)) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            if (C0Z58.LIZ.LIZ(str) && !C1461005nk.LIZ.LJIIIZ(c0y8tLIZ, C2095008Iq.LJIILIIL(str2), z)) {
                return true;
            }
            return false;
        }
        return LIZLLL(str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService
    public final void LIZIZ(Context context, String str, String str2, String str3) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131846504);
        C985403tE.LIZ(c1397580mTM, AFwS248S0000000_14.get$arr$(345));
        new C1397510mTF(c1397580mTM).LIZLLL();
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("enter_method", str), new Pair("conversation_id", str2), new Pair("to_user_id", str3));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_group_hide_members_popup_show", mapLJIIIIZZ);
    }
}
