package com.ss.android.ugc.aweme.aigc.invite;

import X.AbstractViewOnClickListenerC1231770i9v;
import X.C002I;
import X.C069P;
import X.C0VSJ;
import X.C0YMW;
import X.C0YTK;
import X.C1308910kAL;
import X.C1322110kVd;
import X.C1331100kk8;
import X.C1336205Ku;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C197039127h;
import X.C19EG;
import X.C2097608Jq;
import X.C21161217rW;
import X.C21350518gx;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C546820LcW;
import X.C547140Ld2;
import X.C547860LeC;
import X.C549860LhQ;
import X.C786410Ut5;
import X.C814420VxA;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C929103k9;
import X.C985403tE;
import X.DialogInterfaceOnDismissListenerC21523619Le;
import X.InterfaceC1364105Vn;
import X.InterfaceC1743406sC;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aigc.IMService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS4S0800000_32;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class IMServiceImpl implements IMService {
    public final MutableLiveData<List<MentionDataItem>> LIZ = new MutableLiveData<>();
    public final MutableLiveData<C002I> LIZIZ = new MutableLiveData<>();

    @Override // com.ss.android.ugc.aweme.aigc.IMService
    public final MutableLiveData LJ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IMService
    public final MutableLiveData LJFF() {
        return this.LIZIZ;
    }

    public static void LJIIIZ(View view) {
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
            view.setBackground(c384050F3z.LIZ(view.getContext()));
        }
    }

    public final void LJII(final boolean z, C0YMW c0ymw) {
        String string;
        MutableLiveData<C002I> mutableLiveData = this.LIZIZ;
        final String str = "";
        if (!z && c0ymw != null && (string = Integer.valueOf(c0ymw.getCode()).toString()) != null) {
            str = string;
        }
        mutableLiveData.postValue((C002I) new Object(z, str) { // from class: X.002I
            public final boolean LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C002I)) {
                    return false;
                }
                C002I c002i = (C002I) obj;
                return this.LIZ == c002i.LIZ && Intrinsics.LJFF(this.LIZIZ, c002i.LIZIZ);
            }

            public final int hashCode() {
                return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIGCInviteSendResultEvent(success=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", imErrorCode=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = z;
                this.LIZIZ = str;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.aigc.IMService
    public final void LIZ(Context context, Long l, String str) {
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("navigateToChatPage ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(l);
        c547140Ld2.LIZ("IMService", C2188811AlT.LIZIZ(sbLIZ));
        IMContactApi.LIZ.getClass();
        IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(str, null, "im_chat");
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUserLIZLLL);
        enterChatParams.setQuickChat(false);
        enterChatParams.setScrollToMsgId(l);
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IMService
    public final Object LIZLLL(long j, String str, InterfaceC1364105Vn<? super Pair<? extends List<MentionDataItem>, Boolean>> interfaceC1364105Vn) {
        return C21161217rW.LIZ.LIZ(j, str, interfaceC1364105Vn);
    }

    public final void LJIIIIZZ(final AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, BaseTemplate baseTemplate) {
        String str;
        List<MentionDataItem> list;
        MentionDataItem mentionDataItem;
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        if (aIGCSocialModel != null && (list = aIGCSocialModel.peerCameoInfo) != null && (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list)) != null) {
            str = mentionDataItem.uid;
        } else {
            str = null;
        }
        String strLJJIIZ = imChatService.LJJIIZ(str);
        String str2 = c21350518gx.LJIIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = c21350518gx.LJIILIIL;
        if (str4 != null) {
            str3 = str4;
        }
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        c874730YTfLIZ.LIZIZ.LJIIL = c21350518gx.LIZIZ;
        c874730YTfLIZ.LIZJ(baseTemplate);
        c874730YTfLIZ.LIZIZ.LJFF = strLJJIIZ;
        c874730YTfLIZ.LIZIZ.LJIILIIL = C2097608Jq.LJIIJ(new Pair("enter_from", str2), new Pair("enter_method", str3));
        c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.18h4
            @Override // X.C0YTK
            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list2, Map<C869590Y9l, C0YMW> map) {
            }

            @Override // X.C0YTY
            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list2) {
            }

            @Override // X.C0YTK
            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTY
            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTK
            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                List<MentionDataItem> list2;
                AIGCSocialModel aIGCSocialModel2 = aIGCSocialModel;
                if (aIGCSocialModel2 != null && (list2 = aIGCSocialModel2.peerCameoInfo) != null) {
                    this.LIZ.postValue(list2);
                }
                this.LJII(true, null);
            }

            @Override // X.C0YTK
            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                this.LJII(false, c0ymw);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r13, java.lang.String r14, java.util.Map<java.lang.String, ? extends java.lang.Object> r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate> r16) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl.LJI(java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.IMService
    public final void LIZIZ(Context context, AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        MentionDataItem mentionDataItem;
        String str;
        Uri uri = null;
        if (context != null && C1388190mED.LIZ(context) != null && aIGCSocialModel != null) {
            ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(context);
            if ((componentCallbacks2LIZ instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null && !Intrinsics.LJFF(aIGCSocialModel.isGroupChat, Boolean.TRUE)) {
                List<MentionDataItem> list = aIGCSocialModel.peerCameoInfo;
                if (list != null) {
                    mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list);
                } else {
                    mentionDataItem = null;
                }
                C1322110kVd c1322110kVd = new C1322110kVd(context);
                c1322110kVd.getHierarchy().LJJIII(C1331100kk8.LIZ());
                if (mentionDataItem != null && (str = mentionDataItem.iconUrl) != null) {
                    uri = UriProtector.parse(str);
                }
                c1322110kVd.setImageURI(uri);
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJIILIIL = 0;
                C929103k9.LIZ(c1397580mTM, c1322110kVd, AFwS271S0000000_28.get$arr$(29));
                c1397580mTM.LJI(c21350518gx.LIZJ);
                c1397580mTM.LIZIZ(c21350518gx.LIZLLL);
                C985403tE.LIZ(c1397580mTM, new AwS4S0800000_32(c21350518gx, (C21350518gx) function02, (Function0<Unit>) lifecycleScope, (LifecycleCoroutineScope) this, (IMServiceImpl) mentionDataItem, (MentionDataItem) context, (Context) aIGCSocialModel, (AIGCSocialModel) function03, (Function0<Unit>) 0));
                c1397580mTM.LIZLLL(AFwS271S0000000_28.get$arr$(30));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IMService
    public final void LIZJ(C19EG c19eg, final AIGCSocialModel aIGCSocialModel, final C21350518gx c21350518gx, AwS552S0100000_8 awS552S0100000_8, final AwS552S0100000_8 awS552S0100000_82, AwS552S0100000_8 awS552S0100000_83) {
        View viewFindViewById;
        C1322110kVd c1322110kVd;
        C1322110kVd c1322110kVd2;
        View viewFindViewById2;
        C1322110kVd c1322110kVd3;
        View viewFindViewById3;
        TextView textView;
        TextView textView2;
        C197039127h c197039127h;
        String str;
        String str2;
        Uri uri;
        Uri uri2;
        MentionDataItem mentionDataItem;
        MentionDataItem mentionDataItem2;
        MentionDataItem mentionDataItem3;
        final LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg);
        if (lifecycleScope == null) {
            return;
        }
        String str3 = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.mo, null, false);
        if (viewTd != null) {
            viewFindViewById = viewTd.findViewById(R.id.fy2);
            c1322110kVd = (C1322110kVd) viewTd.findViewById(R.id.bo6);
            c1322110kVd2 = (C1322110kVd) viewTd.findViewById(R.id.uo0);
            viewFindViewById2 = viewTd.findViewById(R.id.uo1);
            c1322110kVd3 = (C1322110kVd) viewTd.findViewById(R.id.q88);
            viewFindViewById3 = viewTd.findViewById(R.id.q89);
            textView = (TextView) viewTd.findViewById(R.id.kyt);
            textView2 = (TextView) viewTd.findViewById(R.id.kyp);
            c197039127h = (C197039127h) viewTd.findViewById(R.id.up_);
        } else {
            viewFindViewById = null;
            c1322110kVd = null;
            c1322110kVd2 = null;
            viewFindViewById2 = null;
            c1322110kVd3 = null;
            viewFindViewById3 = null;
            textView = null;
            textView2 = null;
            c197039127h = null;
        }
        List<MentionDataItem> list = aIGCSocialModel.selfCameoInfo;
        if (list != null && (mentionDataItem3 = (MentionDataItem) C13LP.LJJJLL(list)) != null) {
            str3 = mentionDataItem3.iconUrl;
        }
        List<MentionDataItem> list2 = aIGCSocialModel.peerCameoInfo;
        if (list2 != null && (mentionDataItem2 = (MentionDataItem) C13LP.LJJJLL(list2)) != null) {
            str = mentionDataItem2.iconUrl;
        } else {
            str = null;
        }
        List<MentionDataItem> list3 = aIGCSocialModel.peerCameoInfo;
        if (list3 != null && (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list3)) != null) {
            str2 = mentionDataItem.uid;
        } else {
            str2 = null;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewTd;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLLL = true;
        tuxSheet2.LLJLILLLLZIIL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c19eg);
        final TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJI = numLIZJ;
        tuxSheet3.LLILLJJLI = new DialogInterfaceOnDismissListenerC21523619Le(awS552S0100000_83, 6);
        tuxSheet3.show(c19eg.getSupportFragmentManager(), "AIGCSocialInviteCard");
        if (c1322110kVd != null) {
            C547860LeC.LIZ.getClass();
            String strLIZ = C547860LeC.LJI().LIZ(C549860LhQ.LIZJ);
            if (strLIZ != null) {
                c1322110kVd.setImageURI(Uri.fromFile(new C0VSJ(strLIZ)));
            }
        }
        if (c1322110kVd2 != null) {
            if (str3 != null) {
                uri2 = UriProtector.parse(str3);
            } else {
                uri2 = null;
            }
            c1322110kVd2.setImageURI(uri2);
        }
        LJIIIZ(viewFindViewById2);
        if (c1322110kVd3 != null) {
            if (str != null) {
                uri = UriProtector.parse(str);
            } else {
                uri = null;
            }
            c1322110kVd3.setImageURI(uri);
        }
        LJIIIZ(viewFindViewById3);
        if (textView != null) {
            textView.setText(c21350518gx.LJI);
        }
        if (textView2 != null) {
            textView2.setText(c21350518gx.LJII);
        }
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.0iXs
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1231770i9v
                public final void LIZ(View view) {
                    if (view != null) {
                        tuxSheet3.dismiss();
                    }
                }
            }, viewFindViewById);
        }
        if (c197039127h != null) {
            c197039127h.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)));
            c197039127h.setTextColorRes(R.attr.a0p);
            c197039127h.setIconTintColorRes(R.attr.a0p);
            List<MentionDataItem> list4 = aIGCSocialModel.peerCameoInfo;
            if (list4 != null) {
                if (!list4.isEmpty()) {
                    Iterator<MentionDataItem> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (!(!Intrinsics.LJFF(it2.next().invited, Boolean.TRUE))) {
                            c197039127h.setEnabled(false);
                            c197039127h.setText(c21350518gx.LJIIIZ);
                            break;
                        }
                    }
                }
                c197039127h.setEnabled(true);
                c197039127h.setText(c21350518gx.LJIIIIZZ);
                final String str4 = str2;
                final C197039127h c197039127h2 = c197039127h;
                C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.18gy
                    @Override // X.AbstractViewOnClickListenerC1231770i9v
                    public final void LIZ(View view) {
                        if (view != null) {
                            Function0 function0 = awS552S0100000_82;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            c197039127h2.setLoading(true);
                            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C21351018h2(this, c21350518gx, str4, c197039127h2, aIGCSocialModel, tuxSheet3, view, null), 2);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, c197039127h);
            } else {
                c197039127h.setEnabled(false);
                c197039127h.setText(c21350518gx.LJIIIZ);
                final String str42 = str2;
                final C197039127h c197039127h22 = c197039127h;
                C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.18gy
                    @Override // X.AbstractViewOnClickListenerC1231770i9v
                    public final void LIZ(View view) {
                        if (view != null) {
                            Function0 function0 = awS552S0100000_82;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            c197039127h22.setLoading(true);
                            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C21351018h2(this, c21350518gx, str42, c197039127h22, aIGCSocialModel, tuxSheet3, view, null), 2);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, c197039127h);
            }
        }
        awS552S0100000_8.invoke();
    }
}
