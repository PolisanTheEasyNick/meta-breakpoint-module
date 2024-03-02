This README file contains information on the contents of the meta-breakpoint-module layer.

Please see the corresponding sections below for details.


Table of Contents
=================

  I. Adding the meta-breakpoint-module layer to your build
 II. Misc


I. Adding the meta-breakpoint-module layer to your build
=================================================

Run 'bitbake-layers add-layer meta-breakpoint-module'  
And do not forget to append "breakpoint-module" to your local.conf

II. Misc
========
Module have name "memory".
Module kernel accepts "watch_address" unsigned long parameter with needed address for breakpoint.
For enabling module you can use command `modprobe`:
```bash
modprobe memory watch_address=0x48b1a0
```
Also module creates sysfs entry at kernel folder. While module is enabled you can change address by changing address in sysfs entry:
```bash
echo 0x48b1a1 > /sys/kernel/watch_address/watch_address
```
