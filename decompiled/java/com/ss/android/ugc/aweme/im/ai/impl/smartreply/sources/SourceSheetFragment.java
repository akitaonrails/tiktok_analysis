package com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources;

import X.C098200Yq;
import X.C1391190mJ3;
import X.C13BV;
import X.C15438062q;
import X.C1685300txQ;
import X.C1781740wSy;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C343970De7;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS161S0100000_27;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public final class SourceSheetFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZy46ZiwhOSN9OyHELIOSgtOzshLTUgMGEgJzA+KiogZhYjPD0wLRYkLConDjctLiI2JjE=";
    public SourceSheetData LLIZ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SourceSheetData sourceSheetData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            sourceSheetData = (SourceSheetData) arguments.getParcelable("im_source_sheet_panel_config");
        } else {
            sourceSheetData = null;
        }
        this.LLIZ = sourceSheetData;
        if (sourceSheetData == null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? arrayList;
        List<SourceSheetItem> list;
        SourceSheetContext sourceSheetContext;
        long jLongValue;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        super.onViewCreated(view, bundle);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.vqz), new ACListenerS161S0100000_27(this, 36));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.vr1);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SourceCell.class);
        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
        SourceSheetData sourceSheetData = this.LLIZ;
        if (sourceSheetData != null && (list = sourceSheetData.items) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (SourceSheetItem sourceSheetItem : list) {
                SourceSheetData sourceSheetData2 = this.LLIZ;
                if (sourceSheetData2 != null) {
                    sourceSheetContext = sourceSheetData2.context;
                } else {
                    sourceSheetContext = null;
                }
                String str7 = sourceSheetItem.content;
                String str8 = "";
                if (str7 == null) {
                    str7 = "";
                }
                String str9 = sourceSheetItem.imageUrl;
                String str10 = sourceSheetItem.videoId;
                if (str10 == null) {
                    str10 = "";
                }
                String str11 = sourceSheetItem.commentId;
                if (str11 == null) {
                    str11 = "";
                }
                Long l = sourceSheetItem.createTime;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                String str12 = sourceSheetItem.schema;
                if (str12 == null) {
                    str12 = "";
                }
                String str13 = sourceSheetItem.type;
                if (str13 == null) {
                    str13 = "";
                }
                if (sourceSheetContext != null) {
                    str = sourceSheetContext.conversationId;
                    str2 = sourceSheetContext.msgId;
                    str3 = sourceSheetContext.enterFrom;
                    str4 = sourceSheetContext.chatType;
                    str5 = sourceSheetContext.isSelf;
                    String str14 = sourceSheetContext.replyMessageId;
                    if (str14 != null) {
                        str8 = str14;
                    }
                    str6 = sourceSheetContext.toUserId;
                    arrayList.add(new C1781740wSy(str7, str9, str10, str11, jLongValue, str12, str13, str, str2, str3, str4, str5, str8, str6));
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                }
                if (sourceSheetContext != null) {
                    str6 = sourceSheetContext.toUserId;
                } else {
                    str6 = null;
                }
                arrayList.add(new C1781740wSy(str7, str9, str10, str11, jLongValue, str12, str13, str, str2, str3, str4, str5, str8, str6));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        state.LIZLLL(arrayList, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cpy, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
