package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1841350y17;
import X.C19322110iZ;
import X.C758020ToO;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.adminsetting.LiveCommentAddBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet;
import com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupGoLiveVisibleScopeSettingSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS130S0110000_12;

/* JADX INFO: loaded from: classes13.dex */
public class AbS162S0110000_12 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS162S0110000_12 abS162S0110000_12, View view) {
        if (view != null && abS162S0110000_12.z1) {
            ((LiveCommentAddBlockKeywordsOptFragment) abS162S0110000_12.l0).MR().LJII(false);
        }
    }

    public static final void LIZ$1(AbS162S0110000_12 abS162S0110000_12, View view) {
        if (view != null) {
            C758020ToO c758020ToO = C758020ToO.LIZ;
            DataChannel dataChannel = ((GroupChatGoLiveSettingSheet) abS162S0110000_12.l0).LLJLLL;
            boolean z = abS162S0110000_12.z1;
            c758020ToO.getClass();
            C758020ToO.LIZ(dataChannel, "click", "chat_live", z, false);
            GroupChatGoLiveSettingSheet groupChatGoLiveSettingSheet = (GroupChatGoLiveSettingSheet) abS162S0110000_12.l0;
            DataChannel dataChannel2 = groupChatGoLiveSettingSheet.LLJLLL;
            if (dataChannel2 != null) {
                FragmentManager parentFragmentManager = groupChatGoLiveSettingSheet.getParentFragmentManager();
                GroupGoLiveVisibleScopeSettingSheet groupGoLiveVisibleScopeSettingSheet = new GroupGoLiveVisibleScopeSettingSheet();
                groupGoLiveVisibleScopeSettingSheet.LLJLLL = dataChannel2;
                C19322110iZ.LJFF(parentFragmentManager, groupGoLiveVisibleScopeSettingSheet, "GroupGoLiveVisibleScopeSettingSheet", null, 0);
            }
        }
    }

    public static final void LIZ$2(AbS162S0110000_12 abS162S0110000_12, View view) {
        if (view != null) {
            C1841350y17 c1841350y17 = ((LiveVisibleScopeSettingFragment) abS162S0110000_12.l0).LLILZIL;
            if (c1841350y17 != null && c1841350y17.isChecked()) {
                return;
            }
            AwS130S0110000_12 awS130S0110000_12 = new AwS130S0110000_12((LiveVisibleScopeSettingFragment) abS162S0110000_12.l0, abS162S0110000_12.z1, 0);
            LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) abS162S0110000_12.l0;
            if (liveVisibleScopeSettingFragment.MR(liveVisibleScopeSettingFragment.LLILZIL, 0, null, true)) {
                return;
            }
            awS130S0110000_12.invoke();
        }
    }

    public static final void LIZ$3(AbS162S0110000_12 abS162S0110000_12, View view) {
        if (view != null) {
            C1841350y17 c1841350y17 = ((LiveVisibleScopeSettingFragment) abS162S0110000_12.l0).LLIZ;
            if (c1841350y17 != null && c1841350y17.isChecked()) {
                return;
            }
            AwS130S0110000_12 awS130S0110000_12 = new AwS130S0110000_12((LiveVisibleScopeSettingFragment) abS162S0110000_12.l0, abS162S0110000_12.z1, 1);
            LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) abS162S0110000_12.l0;
            if (liveVisibleScopeSettingFragment.MR(liveVisibleScopeSettingFragment.LLIZ, 1, null, true)) {
                return;
            }
            awS130S0110000_12.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS162S0110000_12(Object obj, boolean z, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
