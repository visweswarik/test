# Linux commands
| Command                                     | Description                                                      |
| ------------------------------------------- | ---------------------------------------------------------------- |
| `mv file1 file2`                            | Moves or renames `file1` to `file2`.                             |
| `mv intro manual/chap1`                     | Moves the file `intro` into the directory `manual/chap1`.        |
| `mv intro chap3`                            | Renames `intro` to `chap3`.                                      |
| `mv appendix apndx.a`                       | Renames `appendix` to `apndx.a`.                                 |
| `cat filename`                              | Displays the contents of a file on the terminal.                 |
| `vim filename`                              | Opens the file in the `vim` editor for editing.                  |
| `mkdir directory_name`                      | Creates a new directory.                                         |
| `ls`                                        | Lists files and directories in the current directory.            |
| `ls -t`                                     | Lists files sorted by modification time (newest first).          |
| `ls -s`                                     | Lists files with their size in blocks.                           |
| `ls -h`                                     | Lists file sizes in **human-readable** format (e.g., KB, MB).    |
| `ls -r`                                     | Lists files in **reverse** order.                                |
| `cd`                                        | Changes to the home directory (`~/`).                            |
| `cd ..`                                     | Moves up one directory level.                                    |
| `cd ~` or `cd ~/`                           | Changes to the current user's home directory.                    |
| `cd ../../`                                 | Moves up **two** directory levels.                               |
| `mkdir -p dir1/dir2/dir3`                   | Creates nested directories (makes parent directories as needed). |
| `cp source.txt destination.txt`             | Copies a file from source to destination.                        |
| `cp -v source.txt destination.txt`          | Copies with **verbose** output (shows what’s being copied).      |
| `cp -p source.txt destination.txt`          | Preserves file **permissions, ownership, and timestamps**.       |
| `cp -r dir1 dir2`                           | Recursively copies an entire directory and its contents.         |
| `cp file1.txt file2.txt`                    | Copies `file1.txt` to `file2.txt`.                               |
| `cp file1.txt file2.txt /path/to/directory` | Copies both files into the specified directory.                  |
| `echo "Hello, World!"`                      | Prints text to the terminal. Useful in scripts.                  |
| `less filename`                             | Opens a file for **paged viewing** (scrollable).                 |
| `less -E filename`                          | Exits `less` automatically when the end of the file is reached.  |
| `less -n filename`                          | Hides line numbers while viewing.                                |
| `less -N filename`                          | Shows line numbers while viewing.                                |
| `less -s filename`                          | Squeezes multiple blank lines into a single blank line.          |
| `uname`                                     | Displays system information (e.g., kernel name)                  |
| `whoami`                                    | Shows the current logged-in username                             |
| `tar`                                       | Archive utility (often used with `.tar`, `.tar.gz` files)        |
| `zip`                                       | Compresses files into a `.zip` archive                           |
| `unzip`                                     | Extracts files from a `.zip` archive                             |
| `grep`                                      | Searches for a pattern in files or output                        |
| `head`                                      | Shows the first 10 lines of a file                               |
| `tail`                                      | Shows the last 10 lines of a file                                |
| `head -n 7`                                 | Shows the first 7 lines of a file                                |
| `head -n -97`                               | Shows all but the last 97 lines of a file                        |
| `tail -n 7`                                 | Shows the last 7 lines of a file                                 |
| `tail -n +95`                               | Shows the file from line 95 to the end                           |
| `cal`                                       | Displays a calendar                                              |
| `kill`                                      | Sends a signal to a process (typically to terminate it)          |
| `killall`                                   | Kills all processes by name                                      |
| `ps`                                        | Lists current processes                                          |
| `whereis`                                   | Locates the binary, source, and manual for a command             |
| `whatis`                                    | Gives a one-line description of a command                        |
| `top`                                       | Displays running processes in real time                          |
| `useradd`                                   | Adds a new user                                                  |
| `usermod`                                   | Modifies a user account                                          |
| `wget`                                      | Downloads files from the web via HTTP, HTTPS, or FTP             |

#Vim editor commands
| Command | Description                               |
| ------- | ----------------------------------------- |
| `i`     | Enters **insert mode** (to start typing). |
| `Esc`   | Exits insert mode.                        |
| `:w`    | Writes (saves) the file.                  |
| `:q`    | Quits the editor.                         |
| `:wq`   | Writes and then quits.                    |
| `:q!`   | Forces quit without saving changes.       |
#Navigating a Text File (e.g., with less or man)
| Command          | Description                                      |
| ---------------- | ------------------------------------------------ |
| `q`              | Quit the viewer (e.g., `less`, `man`)            |
| `↓` (down arrow) | Scroll down one line                             |
| `↑` (up arrow)   | Scroll up one line                               |
| `/[string]`      | Search forward for a string                      |
| `?[string]`      | Search backward for a string                     |
| `n`              | Repeat previous search in the same direction     |
| `N`              | Repeat previous search in the opposite direction |


