package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0QSJ;
import X.C13LE;
import X.C1559260qg8;
import X.C1606506Qt;
import X.C2217381BqS;
import X.C23250099c;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerFragment;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.common.view.IgnoreRecyclerAndPagerBottomSheetBehaviour;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BotSharePostInputIconAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public volatile IInputFieldAbility LLJJIII;
    public InterfaceC665370Q7z LLJJIJI;
    public C0QSJ LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotSharePostInputIconAssem.class, "inputFieldAbility", "getInputFieldAbility()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/IInputFieldAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cni;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final IInputFieldAbility hp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJIJIIJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJI;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJIJI = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJJIJIIJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) c0qsjLIZLLL.getAbility(IInputFieldAbility.class);
        C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        return iInputFieldAbility;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final String conversationId = ((C457780HxI) this.LLJJI.getValue()).LL.getConversationId();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1606506Qt(this, null), 3);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.06Qu
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                C19EG activity;
                boolean z;
                if (view2 != null) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this.LLILZ);
                    if (fragmentLJI != null) {
                        activity = fragmentLJI.getActivity();
                    } else {
                        activity = null;
                    }
                    if ((activity instanceof C19EG) && activity != null) {
                        C054G c054g = C05O6.LIZ;
                        String str = conversationId;
                        if (str.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C23250099c.LIZLLL(C05O6.LIZ, null, null, new C1497405tc(str, null), 3);
                        }
                        String str2 = BotSharePostPickerFragment._pnsPageId;
                        String str3 = conversationId;
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        if (supportFragmentManager.LJJJJZI("BotSharePost") == null) {
                            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                            BotSharePostPickerFragment botSharePostPickerFragment = new BotSharePostPickerFragment();
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJJI("conversation_id", str3, bundle);
                            bundle.putInt("max_select_count", 3);
                            botSharePostPickerFragment.setArguments(bundle);
                            TuxSheet tuxSheet = c1390920mIc.LIZ;
                            tuxSheet.LLJJIJI = botSharePostPickerFragment;
                            tuxSheet.LLJLL = true;
                            tuxSheet.LLJLILLLLZIIL = false;
                            tuxSheet.LLLIIIL = Boolean.TRUE;
                            tuxSheet.LLJJIJIIJIL = true;
                            c1390920mIc.LIZIZ((int) (C497820Jfg.LIZ(activity) * 0.75f), C497820Jfg.LIZ(activity));
                            c1390920mIc.LJIIIIZZ(2);
                            IgnoreRecyclerAndPagerBottomSheetBehaviour ignoreRecyclerAndPagerBottomSheetBehaviour = new IgnoreRecyclerAndPagerBottomSheetBehaviour();
                            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                            tuxSheet2.LLLIIII = ignoreRecyclerAndPagerBottomSheetBehaviour;
                            tuxSheet2.show(supportFragmentManager, "BotSharePost");
                            return;
                        }
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("click ignored, activity is null, conversationId=");
                    sbLIZ.append(conversationId);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, LJJIJL());
    }
}
