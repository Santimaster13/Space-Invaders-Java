/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.draft;

import java.applet.AudioClip;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/**
 *
 * @author Santi Mercado
 */

public class Contenedor {
    int pua=0, vueltas=0, tiempo = 0, pause=0, ts=0, togglepu=0, tscount=0, end=0, tse=0, difi=0, ticks=0, piercing=0, pi=0, pd=0, stat=0, expe=0, speed=0, movx=0, stick=0, mody=0, coop=0, hitp2=0, movx2=0, piercing2=0, stat2=0, expe2=0, mody2=0, pi2=0, pd2=0, tse2=0, speed2=0, score=0, stick2=0, first=0, pucd=1, fcount=0, se=0, dc=0, delay=0, bf=0, bb=0, ffc=0, inmortal=0, binvi=0, endless=0, togglepu2=0;
    AudioClip Sound, Megalo, Boom, Shoot, Damage, Crosslaser, ZW, ZWS, DSE, Slash, EXPLOSION, oup, chug, kss, click= java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/clk.wav")), Shoot2, tgoalid, tgoalidtick, tgoalidend, hpurple, spiritss, finalkha, roomtact, IM, FD, glshoot, glcharge, revivea, ffact, ffbreak, ffhit, mch;
    int reroll1=0, reroll2=0;
    boolean fin, finn;
     Timer timerma = new Timer("Timer");
     Timer timerts = new Timer("Timer");
    ImageIcon zaw = new ImageIcon(getClass().getResource("zaw.gif"));
    ImageIcon ds = new ImageIcon(getClass().getResource("DS.gif"));
    ImageIcon EXP = new ImageIcon(getClass().getResource("EXPLOSIOON.gif"));
    ImageIcon nuke = new ImageIcon(getClass().getResource("nuke.gif"));
    ImageIcon pausa = new ImageIcon(getClass().getResource("pausa.png"));
    ImageIcon ks = new ImageIcon(getClass().getResource("ks.gif"));
    ImageIcon tgoalidgif = new ImageIcon(getClass().getResource("tgoalidgif.gif"));
    ImageIcon tgoalide = new ImageIcon(getClass().getResource("tgoalide.gif"));
    ImageIcon hollowp = new ImageIcon(getClass().getResource("hollowp.gif"));
    ImageIcon sstorm = new ImageIcon(getClass().getResource("sstorm.gif"));
    ImageIcon fkha = new ImageIcon(getClass().getResource("fkha.gif"));
    ImageIcon tactgif = new ImageIcon(getClass().getResource("tactgif.gif"));
    ImageIcon glaser = new ImageIcon(getClass().getResource("glaser.gif"));
    ImageIcon revivev = new ImageIcon(getClass().getResource("revivev.gif"));
    
    
    TimerTask task = new TimerTask() {
        int tick, hit;
          @Override
          public void run() {
          }
          };
    TimerTask taskts = new TimerTask() {
          @Override
          public void run() {
            if (pause ==0 && end==0){
              if (tse==1){
                 tscount++;
                 if (tscount==1100){
                     ZWS.play();
                 }
                 if (tscount==4000){
                  tse=0;
                  ts=0;
                  tscount=0;
                  if (bb==0){
                         Megalo.loop();
                         } else {
                             FD.loop();
                         }
                 }
             }
             if (tse==2){
                 tscount++;
                 if (tscount ==100){
                     Slash.play();
                 }
                 if(tscount==1000){
                 tse=0;
                 ts=0;
                 tscount=0;
                 if (bb==0){
                         Megalo.loop();
                         } else {
                             FD.loop();
                         }   
                 }
                 
             }
             if (tse==3){
                 tscount++;
                 if(tscount==350){
                 tse=0;
                 ts=0;
                 tscount=0;
                 piercing=0;
                 stat=0;
                 pi=0;
                 pd=0;
                 expe=1;
                 if (bb==0){
                         Megalo.loop();
                         } else {
                             FD.loop();
                         }    
                 }
             }
             if (tse==5){
                 tscount++;
                 if(tscount==5000){
                 tse=0;
                 ts=0;
                 tscount=0;
                 speed=0;
                 movx=0;
                 stick=0;   
                 }
             }
             
             if (tse==11){
                 tscount++;
                 if (tscount==1000){
                    tgoalidtick.play();
                    fcount++;   
                    tscount=0;
                 }
                 if (fcount==15){
                     tse=0;
                     ts=0;
                     fcount=0;
                     tgoalidend.play();
                     end=1;
                     se=1;
                     tscount=0;
                 }
             }
            
             if (tse2==2){
                 tscount++;
                 if (tscount ==100){
                     Slash.play();
                 }
                 if(tscount==1000){
                 tse2=0;
                 ts=0;
                 tscount=0;
                 if (bb==0){
                         Megalo.loop();
                         } else {
                             FD.loop();
                         }   
                 }
                 
             }
             if (tse2==3){
                 tscount++;
                 if(tscount==350){
                 tse2=0;
                 ts=0;
                 tscount=0;
                 piercing2=0;
                 stat2=0;
                 pi2=0;
                 pd2=0;
                 expe2=1;
                 if (bb==0){
                         Megalo.loop();
                         } else {
                             FD.loop();
                         }   
                 }
             }
             if (tse2==5){
                 tscount++;
                 if(tscount==5000){
                 tse2=0;
                 ts=0;
                 tscount=0;
                 speed2=0;
                 movx2=0;
                 stick2=0;   
                 }
             }
             
             if(tse2==11){
                tscount++;
                if (tscount==1000){
                     tgoalidtick.play();
                    fcount++; 
                    tscount=0;
                 }
                 if (fcount==15){
                     tse2=0;
                     ts=0;
                     fcount=0;
                     tgoalidend.play();
                     end=1;
                     se=1;
                     tscount=0;
                 }
                
             }
            }

              
          }
          };
    
     
}
